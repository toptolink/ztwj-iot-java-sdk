package com.ztwj;


import com.ztwj.requests.BaseRequest;
import com.ztwj.responses.BaseResponse;

/**
 * @author LIUSF
 * @date 2019-03-27 18:32:06
 */
public interface ZtwjApiClient {
    /**
     * 执行入口
     *
     * @param request
     * @param <T>
     * @return
     */
    <T extends BaseResponse> T execute(BaseRequest<T> request);
}
