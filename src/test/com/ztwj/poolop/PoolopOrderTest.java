package com.ztwj.poolop;

import com.alibaba.fastjson.JSON;
import com.ztwj.DefaultClientTest;
import com.ztwj.DefaultParams;
import com.ztwj.requests.poolop.PoolopOrderRequest;
import com.ztwj.responses.poolop.PoolopOrderResponse;
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
public class PoolopOrderTest extends DefaultClientTest {
    @Before
    public void setUp() throws Exception {
        System.out.println("PoolopOrderTest start");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("PoolopOrderTest end");
    }

    @Test
    public void queryPackages() throws Exception {
        for (int i = 0; i< 1; i++) {
            MyThread thread = new MyThread();
            thread.start();
            System.out.println("i = " + i);
        }

        Thread.sleep(10000000);
    }

    public class MyThread extends Thread {
        public void run() {
            System.out.println("Thread start");
            PoolopOrderRequest request = new PoolopOrderRequest();
            request.setIccid(DefaultParams.ICCID);
            request.setOrderNo("98765432100111100");
            request.setPackageCode("ZT101463");
            request.setPackageType("1");
            PoolopOrderResponse response = client.execute(request);
            TestCase.assertNotNull("response is null", response);
            TestCase.assertNotNull("code is null", response.getCode());
            TestCase.assertNotNull("message is null", response.getMessage());

            System.out.println(JSON.toJSONString(response));
            System.out.println("Thread end");
        }
    }
}
