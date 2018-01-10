package com.weimaipay.http;

import java.util.Map;

/**<h1> Http调用器 </h1>
 * <p>
 * <b>描述：</b>
 *        本地接口最终会依赖调用器完成对服务端接口的调用
 * </p>
 * @author   七星草  求是同创网络科技有限公司
 * @version  2.0    2017年07月05日 星期三 下午 4点16分17秒
 */
public interface HttpInvoker {

    /**
     * 业务层调用逻辑
     * @param request 请求实体
     * @param weimaiPublicKey 微脉支付公钥
     * @param appPrivateKey 商户私钥
     * @param appId 应用ID 需要平台存在对应的，完整的，正确的配置
     * @param invokeUrl 完整的接口地址
     * @return 响应的消息（已解密的JSON字符串）
     */
    String invoke(Object request, String weimaiPublicKey, String appPrivateKey, String appId, String invokeUrl);

    /**
     * 交易相关接口业务逻辑
     * @param request
     * @param weimaiPublicKey
     * @param appPrivateKey
     * @param appId
     * @param invokeUrl
     * @return
     */
    String invoke1(Object request, String weimaiPublicKey, String appPrivateKey, String appId, String invokeUrl);

    /**
     * HTTP POST调用逻辑
     * @param url 完整的接口地址
     * @param params 请求参数
     * @param charset HTTP 正文编码
     * @return HTTP响应正文（密文）
     */
    String doPost(String url, Map<String, String> params, String charset);

}
