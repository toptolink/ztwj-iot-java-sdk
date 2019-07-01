package com.ztwj.query;

import com.alibaba.fastjson.JSON;
import com.ztwj.DefaultClientTest;
import com.ztwj.requests.query.GetCardDetailsRequest;
import com.ztwj.responses.query.GetCardDetailsResponse;
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
public class GetCardDetailsRequestTest extends DefaultClientTest {
    @Before
    public void setUp() throws Exception {
        System.out.println("GetCardDetailsRequestTest start");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("GetCardDetailsRequestTest end");
    }

    @Test
    public void getCardDetails() throws Exception {
        GetCardDetailsRequest req = new GetCardDetailsRequest();
        GetCardDetailsResponse response = client.execute(req);

        TestCase.assertNotNull("response is null", response);
        TestCase.assertNotNull("code is null", response.getCode());
        TestCase.assertNotNull("message is null", response.getMessage());

        System.out.println(JSON.toJSONString(response));
    }

    @Test
    public void getCardDetails_normal() throws Exception {
        GetCardDetailsRequest req = new GetCardDetailsRequest();
        req.setCardId("89860117750035486415");
        GetCardDetailsResponse response = client.execute(req);

        TestCase.assertNotNull("response is null", response);
        TestCase.assertNotNull("code is null", response.getCode());
        TestCase.assertNotNull("message is null", response.getMessage());

        System.out.println(JSON.toJSONString(response));
    }
}