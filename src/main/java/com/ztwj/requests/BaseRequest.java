package com.ztwj.requests;

import com.ztwj.responses.BaseResponse;

import java.io.Serializable;

/**
 * Created by LIUSF on 2019-03-20 18:02:29.
 *
 * @author LIUSF
 * @date 2019-03-27 18:32:06
 */
public class BaseRequest<T extends BaseResponse> implements Serializable {
    private String reqId;
    private String version;

    public String getReqId() {
        return reqId;
    }

    public void setReqId(String reqId) {
        this.reqId = reqId;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
