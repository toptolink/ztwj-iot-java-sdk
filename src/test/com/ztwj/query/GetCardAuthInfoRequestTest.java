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
    private long start;
    private long end;
    private long index = 0;

    @Before
    public void setUp() throws Exception {
        start=System.currentTimeMillis();
        System.out.println("GetCardAuthInfoRequestTest start");
    }

    @After
    public void tearDown() throws Exception {
        end=System.currentTimeMillis();
        System.out.println("GetCardAuthInfoRequestTest end");

        System.out.println("total used: " + (end - start));
    }

    @Test
    public void getCardAuthInfo() throws Exception {
        for (int i = 0; i < 1000; i++) {
            new Thread(new Runnable() {
                public void run() {
                    getAuth();
                    System.out.println("runnable " + (index++));
                }
            }).run();
        }
    }

    private void getAuth() {
        GetCardAuthInfoRequest request = new GetCardAuthInfoRequest();
        request.setCardId("89860619050025536672");
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