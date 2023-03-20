package com.ztwj.poolop;

import com.alibaba.fastjson.JSON;
import com.ztwj.DefaultClientTest;
import com.ztwj.requests.poolop.PoolopQueryCardOrderRechargesRequest;
import com.ztwj.responses.poolop.PoolopQueryCardOrderRechargesResponse;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Description: ztwj-iot-java-sdk
 *
 * @author : fire
 * @date : 2023/3/17 13:54
 */
public class PoolopQueryCardOrderRechargesTest extends DefaultClientTest {
    @Before
    public void setUp() throws Exception {
        System.out.println("PoolopQueryCardOrderRechargesTest start");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("PoolopQueryCardOrderRechargesTest end");
    }

    @Test
    public void queryPackages() throws Exception {
        PoolopQueryCardOrderRechargesRequest request = new PoolopQueryCardOrderRechargesRequest();
        request.setOrderNo("98765432100111100");
        PoolopQueryCardOrderRechargesResponse response = client.execute(request);

        TestCase.assertNotNull("response is null", response);
        TestCase.assertNotNull("code is null", response.getCode());
        TestCase.assertNotNull("message is null", response.getMessage());

        System.out.println(JSON.toJSONString(response));
    }
}
