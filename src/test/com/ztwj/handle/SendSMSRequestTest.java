package com.ztwj.handle;

import com.alibaba.fastjson.JSON;
import com.ztwj.DefaultClientTest;
import com.ztwj.requests.handle.SendSmsRequest;
import com.ztwj.responses.handle.SendSmsResponse;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Description: ztwj-iot-java-sdk
 *
 * @author : fire
 * @date : 2019/5/24 11:02
 */
public class SendSMSRequestTest extends DefaultClientTest {
    @Before
    public void setUp() throws Exception {
        System.out.println("SendSMSRequestTest start");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("SendSMSRequestTest end");
    }

    @Test
    public void sendSMS() throws Exception {
        SendSmsRequest request = new SendSmsRequest();
        SendSmsResponse response = client.execute(request);

        TestCase.assertNotNull("response is null", response);
        TestCase.assertNotNull("code is null", response.getCode());
        TestCase.assertNotNull("message is null", response.getMessage());

        System.out.println(JSON.toJSONString(response));
    }
}