package com.example.mettre.myaprojectandroid.bean;

/**
 * 验证码
 */
public class CaptchaBean {

    /**
     * phone : 18844157373
     * captchaType : 1
     * code : 4878
     */

    private String phone;
    private int captchaType;
    private String code;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getCaptchaType() {
        return captchaType;
    }

    public void setCaptchaType(int captchaType) {
        this.captchaType = captchaType;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
