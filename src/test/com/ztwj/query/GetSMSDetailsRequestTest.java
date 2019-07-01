package com.ztwj.query;

import com.alibaba.fastjson.JSON;
import com.ztwj.DefaultClientTest;
import com.ztwj.requests.query.GetSmsDetailsRequest;
import com.ztwj.responses.query.GetSmsDetailsResponse;
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
public class GetSMSDetailsRequestTest extends DefaultClientTest {
    @Before
    public void setUp() throws Exception {
        System.out.println("GetSMSDetailsRequestTest start");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("GetSMSDetailsRequestTest end");
    }

    @Test
    public void getSMSDetails() throws Exception {
        GetSmsDetailsRequest request = new GetSmsDetailsRequest();
        GetSmsDetailsResponse response = client.execute(request);

        TestCase.assertNotNull("response is null", response);
        TestCase.assertNotNull("code is null", response.getCode());
        TestCase.assertNotNull("message is null", response.getMessage());

        System.out.println(JSON.toJSONString(response));
    }
}