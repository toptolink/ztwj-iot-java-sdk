package com.ztwj.query;

import com.alibaba.fastjson.JSON;
import com.ztwj.DefaultClientTest;
import com.ztwj.requests.query.GetPackageListByUserRequest;
import com.ztwj.requests.query.GetUserInfoByUserRequest;
import com.ztwj.responses.query.GetPackageListByUserResponse;
import com.ztwj.responses.query.GetUserInfoByUserResponse;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Description: ztwj-iot-java-sdk
 *
 * @author : fire
 * @date : 2019/5/24 11:05
 */
public class GetUserInfoByUserRequestTest extends DefaultClientTest {
    @Before
    public void setUp() throws Exception {
        System.out.println("GetUserInfoByUserRequestTest start");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("GetUserInfoByUserRequestTest end");
    }

    @Test
    public void getUserInfoByUser() throws Exception {
        GetUserInfoByUserRequest request = new GetUserInfoByUserRequest();
        GetUserInfoByUserResponse response = client.execute(request);

        TestCase.assertNotNull("response is null", response);
        TestCase.assertNotNull("code is null", response.getCode());
        TestCase.assertNotNull("message is null", response.getMessage());

        System.out.println(JSON.toJSONString(response));
    }
}