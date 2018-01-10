package com.weimaipay;

/**
 * <h1>异常</h1>
 * <p>
 * <b>描述：</b> 定义SDK异常，不包含服务端的接口异常。 异常及异常码定义如下：
 * <p>
 * <table cellpadding=2 cellspacing=10 summary="SDK异常码表">
 * <tr>
 * <th>异常代码</th>
 * <th>异常信息</th>
 * <th>可能的原因</th>
 * </tr>
 * <tr>
 * <td align=center>000</td>
 * <td align=center>BaseHttpInvoker HTTP Client初始化出错</td>
 * <td>无</td>
 * </tr>
 * <tr>
 * <td align=center>001</td>
 * <td align=center>HTTP Post请求出错</td>
 * <td>确认服务是否处于可用状态，请求地址是否正确</td>
 * </tr>
 * <tr>
 * <td align=center>002</td>
 * <td align=center>加密 appId 出错，请检查weimaiPublicKey是否正确</td>
 * <td>weimaiPublicKey不正确</td>
 * </tr>
 * <tr>
 * <td align=center>003</td>
 * <td align=center>解密响应信息出错，请检查密钥是否配置正确</td>
 * <td>公钥或私钥同服务器上的配置不一致</td>
 * </tr>
 * <tr>
 * <td align=center>004</td>
 * <td align=center>消息解密出错</td>
 * <td>公钥或私钥同服务器上的配置不一致</td>
 * </tr>
 * <tr>
 * <td align=center>005</td>
 * <td align=center>缺少参数[filePath]</td>
 * <td>文件路径未传入</td>
 * </tr>
 * <tr>
 * <td align=center>006</td>
 * <td align=center>文件路径不存在</td>
 * <td>文件路径传入不正确</td>
 * </tr>
 * <tr>
 * <td align=center>007</td>
 * <td align=center>获取文件失败</td>
 * <td>文件获取异常/没有符合条件的文件</td>
 * </tr>
 * <tr>
 * <td align=center>008</td>
 * <td align=center>FTP文件目录为空</td>
 * <td>FTP文件目录下无文件</td>
 * </tr>
 * <tr>
 * <td align=center>009</td>
 * <td align=center>方法未实现</td>
 * <td>方法未实现</td>
 * </tr>
 *
 * <tr>
 * <td align=center>010</td>
 * <td align=center>FTP登录失败</td>
 * <td>FTP登录失败</td>
 * </tr>
 *
 * <tr>
 * <td align=center>011</td>
 * <td align=center>FTP文件目录不存在</td>
 * <td>FTP文件目录不存在</td>
 * </tr>
 *
 * 
 * </table>
 * </blockquote>
 * </p>
 *
 * @author 七星草 杭州求是同创网路科技有限公司
 * @version 2.0 2017年07月04日 11点25分
 */
public class PaySDKException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6112040277997189777L;
	private String code;
	private String msg;

	public PaySDKException(String code, String message) {
		super(message);
		this.code = code;
		this.msg = message;
	}

	public PaySDKException(String code, String message, Throwable throwable) {
		super("code:" + code + " message:" + message, throwable);
		this.code = code;
		this.msg = message;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}
