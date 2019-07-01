package com.ztwj.query;

import com.alibaba.fastjson.JSON;
import com.ztwj.DefaultClientTest;
import com.ztwj.requests.query.GetCardInfoByImeiRequest;
import com.ztwj.responses.query.GetCardInfoByImeiResponse;
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
public class GetCardInfoByImeiRequestTest extends DefaultClientTest {
    @Before
    public void setUp() throws Exception {
        System.out.println("GetCardInfoByImeiRequestTest start");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("GetCardInfoByImeiRequestTest end");
    }

    @Test
    public void getCardInfoByImei() throws Exception {
        GetCardInfoByImeiRequest request = new GetCardInfoByImeiRequest();
        GetCardInfoByImeiResponse response = client.execute(request);

        TestCase.assertNotNull("response is null", response);
        TestCase.assertNotNull("code is null", response.getCode());
        TestCase.assertNotNull("message is null", response.getMessage());

        System.out.println(JSON.toJSONString(response));
    }

    @Test
    public void getCardInfoByImei_normal() throws Exception {
        GetCardInfoByImeiRequest request = new GetCardInfoByImeiRequest();
        request.setImei("9900092654137400");
        GetCardInfoByImeiResponse response = client.execute(request);

        TestCase.assertNotNull("response is null", response);
        TestCase.assertNotNull("code is null", response.getCode());
        TestCase.assertNotNull("message is null", response.getMessage());

        System.out.println(JSON.toJSONString(response));
    }
}