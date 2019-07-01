package com.ztwj.query;

import com.alibaba.fastjson.JSON;
import com.ztwj.DefaultClientTest;
import com.ztwj.requests.query.GetCardPwdListByUserRequest;
import com.ztwj.responses.query.GetCardPwdListByUserResponse;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Description: ztwj-iot-java-sdk
 *
 * @author : fire
 * @date : 2019/5/24 11:04
 */
public class GetCardPwdListByUserRequestTest extends DefaultClientTest {
    @Before
    public void setUp() throws Exception {
        System.out.println("GetCardPwdListByUserRequestTest start");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("GetCardPwdListByUserRequestTest end");
    }

    @Test
    public void getCardPwdListByUser() throws Exception {
        GetCardPwdListByUserRequest request = new GetCardPwdListByUserRequest();
        GetCardPwdListByUserResponse response = client.execute(request);

        TestCase.assertNotNull("response is null", response);
        TestCase.assertNotNull("code is null", response.getCode());
        TestCase.assertNotNull("message is null", response.getMessage());

        System.out.println(JSON.toJSONString(response));
    }
}