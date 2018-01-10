package com.weimaipay.authorize;

/*
 * 认证授权帮助器
 */
public class AuthHelper {  
	

	private String payPrivateKey;
	
	private String appPublicKey;
    
    /**
     * 真实的app_id
     */
    private String realAppId;
    
    public AuthHelper() {

    }
    
	public AuthHelper(String payPrivateKey, String appPublicKey){
		this.payPrivateKey=payPrivateKey;
		this.appPublicKey=appPublicKey;
	}
	/** 
	 * @param encyrptAppId 申请api的app id
	 * @throws Exception
	 */
	public AuthHelper create(String encyrptAppId) throws Exception {
		String appId="";
		try {
			appId = RSA.decrypt(encyrptAppId, payPrivateKey);
		} catch (Exception e) {
			e.printStackTrace();
		}
    	//比对appid是否为备案的商户appid 
		if("10001".equals(appId)){ 
			AuthHelper ah = new AuthHelper(payPrivateKey, appPublicKey);
			ah.setRealAppId(appId);
			return ah;
		} else if("10003".equals(appId)){
			AuthHelper ah= new AuthHelper(payPrivateKey, appPublicKey);
			ah.setRealAppId(appId);
			return ah;
		}else{
			throw new Exception("非法授权");
		}
	}  

	public String getRealAppId() {
		return realAppId;
	}
	
	public void setRealAppId(String realAppId) {
		this.realAppId = realAppId;
	}

	/**
	 * 解密真实数据（包含签名验证，解密随机aeskey,最后解密出真实数据）
	 * @param encyrptData  加密的数据
	 * @param signData 加密的数据的签名
	 * @param encyrptAESKey 加密的随机aeskey
	 * @return
	 * @throws Exception
	 */
	public String decyrptData(String encyrptData, String signData, String encyrptAESKey) throws Exception {
    	//
    	//1.验证签名
    	//对signData进行解密得到对应的数据。
    	//比较data和encyrptData是否一样，如果一样的话，那么签名成功
    	Boolean sign = RSA.checkSign(encyrptData, signData, this.appPublicKey);
    	if(!sign){
    		throw new Exception("验证签名不成功");
    	}
    	//2.解密Key
    	//用wmpay的私钥解析随机key
    	String randomAESKey = RSA.decrypt(encyrptAESKey,this.payPrivateKey);
    	//3.解密真实数据
    	String realData= AES.decryptFromBase64(encyrptData, randomAESKey);
    	return realData;
    }
	
	/**
	 * 解密真实数据（包含签名验证，解密随机aeskey,最后解密出真实数据）
	 * @param encyrptData  加密的数据
	 * @param encyrptAESKey 加密的随机aeskey
	 * @return
	 */
	public String decyrptData(String encyrptData, String encyrptAESKey) throws Exception
	{
    	//2.解密Key
    	//用wmpay的私钥解析随机key
    	String randomAESKey = RSA.decrypt(encyrptAESKey,this.payPrivateKey);
    	//3.解密真实数据
    	String realData= AES.decryptFromBase64(encyrptData, randomAESKey);
    	return realData;
    }
    
    /**
     * 返回目标数据
     * @param targetData 返回的目标数据
     * @return
     */
    public AuthResultInfo encryptData(String targetData){
    	String randAESKey = RandomUtil.getRandom(16);
    	//AES加密返回data
    	String resultData = AES.encryptToBase64(targetData, randAESKey);
    	//RSA私钥签名返回的sign
    	String resultSign = RSA.sign(resultData, this.payPrivateKey);
    	
    	//RSA应用公钥加密randAESKey
    	String resultRsaKey="";
    	try { 
    		resultRsaKey = RSA.encrypt(randAESKey, this.appPublicKey);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}   
    	
    	AuthResultInfo authInfo=new AuthResultInfo();
    	authInfo.setContent(resultData);
    	authInfo.setKey(resultRsaKey);
    	authInfo.setSign(resultSign);
		authInfo.setPlainKey(randAESKey);
    	return authInfo;
    }
    
    public String encryptData(String targetData, String randAESKey){
    	//AES加密返回data
    	String resultData =AES.encryptToBase64(targetData, randAESKey);
    	return resultData;

    }
    
    public String encrytAESKey(String randAESKey){
    	//RSA应用公钥加密randAESKey
    	String resultRsaKey="";
    	try { 
    		resultRsaKey = RSA.encrypt(randAESKey, this.appPublicKey);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	return resultRsaKey;
    }

	public static String getEncAppId(String appId, String appPublicKey) throws Exception
	{
		return RSA.encrypt(appId, appPublicKey);
	}
    
}
