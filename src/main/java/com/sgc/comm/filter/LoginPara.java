package com.sgc.comm.filter;

/**
 * 添加登录获取token时，所需要的认证信息类LoginPara.java
 * @author 曾庆华
 *
 */
public class LoginPara {
	private String clientId;  
    private String userName;  
    private String password;  
    private String captchaCode;  
    private String captchaValue;  
      
    public String getClientId() {  
        return clientId;  
    }  
    public void setClientId(String clientId) {  
        this.clientId = clientId;  
    }  
    public String getUserName() {  
        return userName;  
    }  
    public void setUserName(String userName) {  
        this.userName = userName;  
    }  
    public String getPassword() {  
        return password;  
    }  
    public void setPassword(String password) {  
        this.password = password;  
    }  
    public String getCaptchaCode() {  
        return captchaCode;  
    }  
    public void setCaptchaCode(String captchaCode) {  
        this.captchaCode = captchaCode;  
    }  
    public String getCaptchaValue() {  
        return captchaValue;  
    }  
    public void setCaptchaValue(String captchaValue) {  
        this.captchaValue = captchaValue;  
    }  
}
