package com.ztwj.responses;

import java.io.Serializable;

/**
 * @author LIUSF
 * @date 2019-03-27 18:32:06
 */
public class BaseResponse implements Serializable {
    /**
     * 响应码
     */
    private String code;
    /**
     * 响应消息
     */
    private String message;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
