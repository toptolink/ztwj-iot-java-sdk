package com.ztwj.poolop;

import com.alibaba.fastjson.JSON;
import com.ztwj.DefaultClientTest;
import com.ztwj.requests.poolop.PoolopQueryPackagesRequest;
import com.ztwj.responses.poolop.PoolopQueryPackagesResponse;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Description: ztwj-iot-java-sdk
 *
 * @author : fire
 * @date : 2023/3/17 13:55
 */
public class PoolopQueryPackagesTest extends DefaultClientTest {
    @Before
    public void setUp() throws Exception {
        System.out.println("PoolopQueryPackagesTest start");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("PoolopQueryPackagesTest end");
    }

    @Test
    public void queryPackages() throws Exception {
        for(int i = 0; i< 1; i++) {
            MyThread thread = new MyThread();
            thread.start();
            System.out.println("i = " + i);
        }

        Thread.sleep(1000000);
    }

    public class MyThread extends Thread {
        public void run() {
            PoolopQueryPackagesRequest request = new PoolopQueryPackagesRequest();
            PoolopQueryPackagesResponse response = client.execute(request);

            TestCase.assertNotNull("response is null", response);
            TestCase.assertNotNull("code is null", response.getCode());
            TestCase.assertNotNull("message is null", response.getMessage());

            System.out.println(JSON.toJSONString(response));
        }
    }
}
