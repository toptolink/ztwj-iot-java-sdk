package com.ztwj.flowpool;

import com.alibaba.fastjson.JSON;
import com.ztwj.DefaultClientTest;
import com.ztwj.requests.flowpool.AddCardsToPoolRequest;
import com.ztwj.responses.flowpool.AddCardsToPoolResponse;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Description: ztwj-iot-java-sdk
 *
 * @author : fire
 * @date : 2019/5/24 10:58
 */
public class AddCardsToPoolRequestTest extends DefaultClientTest {
    @Before
    public void setUp() throws Exception {
        System.out.println("AddCardsToPoolRequestTest start");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("AddCardsToPoolRequestTest end");
    }

    @Test
    public void addCardsToPool() throws Exception {
        AddCardsToPoolRequest request = new AddCardsToPoolRequest();
        AddCardsToPoolResponse response = client.execute(request);

        TestCase.assertNotNull("response is null", response);
        TestCase.assertNotNull("code is null", response.getCode());
        TestCase.assertNotNull("message is null", response.getMessage());

        System.out.println(JSON.toJSONString(response));
    }
}