package com.ztwj.query;

import com.alibaba.fastjson.JSON;
import com.ztwj.DefaultClientTest;
import com.ztwj.requests.query.GetCardAuthInfoRequest;
import com.ztwj.responses.query.GetCardAuthInfoResponse;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Description: ztwj-iot-java-sdk
 *
 * @author : fire
 * @date : 2019/5/24 11:03
 */
public class GetCardAuthInfoRequestTest extends DefaultClientTest {
    @Before
    public void setUp() throws Exception {
        System.out.println("GetCardAuthInfoRequestTest start");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("GetCardAuthInfoRequestTest end");
    }

    @Test
    public void getCardAuthInfo() throws Exception {
        GetCardAuthInfoRequest request = new GetCardAuthInfoRequest();
        GetCardAuthInfoResponse response = client.execute(request);

        TestCase.assertNotNull("response is null", response);
        TestCase.assertNotNull("code is null", response.getCode());
        TestCase.assertNotNull("message is null", response.getMessage());

        System.out.println(JSON.toJSONString(response));
    }

    @Test
    public void getCardAuthInfo_normal() throws Exception {
        GetCardAuthInfoRequest request = new GetCardAuthInfoRequest();
        request.setCardId("89860117750035486415");
        GetCardAuthInfoResponse response = client.execute(request);

        TestCase.assertNotNull("response is null", response);
        TestCase.assertNotNull("code is null", response.getCode());
        TestCase.assertNotNull("message is null", response.getMessage());

        System.out.println(JSON.toJSONString(response));
    }
}