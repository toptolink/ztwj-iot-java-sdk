package com.ztwj.handle;

import com.alibaba.fastjson.JSON;
import com.ztwj.DefaultClientTest;
import com.ztwj.requests.handle.RechargeCardPwdRequest;
import com.ztwj.responses.handle.RechargeCardPwdResponse;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runners.Parameterized;

import java.util.Collection;

import static org.junit.Assert.*;

/**
 * Description: ztwj-iot-java-sdk
 *
 * @author : fire
 * @date : 2019/5/24 11:01
 */
public class RechargeCardPwdRequestTest extends DefaultClientTest {
    @Before
    public void setUp() throws Exception {
        System.out.println("RechargeCardPwdRequestTest start");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("RechargeCardPwdRequestTest end");
    }

    @Test
    public void rechargeCardPwd() throws Exception {
        RechargeCardPwdRequest request = new RechargeCardPwdRequest();
        RechargeCardPwdResponse response = client.execute(request);

        TestCase.assertNotNull("response is null", response);
        TestCase.assertNotNull("code is null", response.getCode());
        TestCase.assertNotNull("message is null", response.getMessage());

        System.out.println(JSON.toJSONString(response));
    }
}