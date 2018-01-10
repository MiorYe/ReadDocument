package com.weimaipay.http;

import com.weimaipay.PaySDKException;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.TrustSelfSignedStrategy;
import org.apache.http.conn.ssl.TrustStrategy;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.ssl.SSLContextBuilder;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * <h1> HttpInvoker的默认实现  </h1>
 * <p>
 * <b>描述：</b>
 *         用于进行HTTP请求，向微脉支付服务器发送请求 <br>
 *         该实现采用httpClient进行处理。
 * </p>
 *
 * @author 长者见闻
 * @version 1.0     2017年03月29日  15点58分
 */
public class BaseHttpInvoker extends AbstractHttpInvoker {

    private CloseableHttpClient httpClient;

    public BaseHttpInvoker(){
        SSLContext sslContext;
        try
        {
            sslContext = new SSLContextBuilder().loadTrustMaterial(null, TrustSelfSignedStrategy.INSTANCE).build();
            SSLConnectionSocketFactory sslsf = new SSLConnectionSocketFactory(sslContext, new String[] { "TLSv1" }, null, NoopHostnameVerifier.INSTANCE);
            httpClient = HttpClients.custom().setSSLSocketFactory(sslsf).build();
        } catch (NoSuchAlgorithmException | KeyManagementException | KeyStoreException e)
        {
            throw new PaySDKException("000", "BaseHttpInvoker HTTP Client初始化出错", e);
        }

    }

    public String doPost(String url, Map<String, String> map, String charset){
        HttpPost httpPost;
        String result = null;
        try{
            httpPost = new HttpPost(url);
            httpPost.setHeader("accept", "application/json");
            httpPost.setHeader("Content-Type", "application/x-www-form-urlencoded;charset=" + charset);
            //设置参数
            List<NameValuePair> list = new ArrayList<>();
            for (Map.Entry<String, String> elem : map.entrySet())
            {
                list.add(new BasicNameValuePair(elem.getKey(), elem.getValue()));
            }
            if(list.size() > 0){
                UrlEncodedFormEntity entity = new UrlEncodedFormEntity(list, charset);
                httpPost.setEntity(entity);
            }
            HttpResponse response = httpClient.execute(httpPost);
            if(response != null){
                HttpEntity resEntity = response.getEntity();
                if(resEntity != null){
                    result = EntityUtils.toString(resEntity, charset);
                }
            }
        } catch(Exception e) {
            throw new PaySDKException("001", "HTTP Post请求出错，URL=" + url, e);
        }
        return result;
    }

}
