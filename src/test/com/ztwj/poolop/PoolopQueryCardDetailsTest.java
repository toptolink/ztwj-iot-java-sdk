/*
 * Copyright (c) 2023. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.ztwj.poolop;

import com.alibaba.fastjson.JSON;
import com.ztwj.DefaultClientTest;
import com.ztwj.DefaultParams;
import com.ztwj.requests.poolop.PoolopQueryCardDetailsRequest;
import com.ztwj.responses.poolop.PoolopQueryCardDetailsResponse;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Description: ztwj-iot-java-sdk
 *
 * @author : fire
 * @date : 2023/3/17 10:32
 */
public class PoolopQueryCardDetailsTest extends DefaultClientTest {
    @Before
    public void setUp() throws Exception {
        System.out.println("PoolopQueryCardDetailsTest start");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("PoolopQueryCardDetailsTest end");
    }

    @Test
    public void queryCardDetails() throws Exception {
        PoolopQueryCardDetailsRequest request = new PoolopQueryCardDetailsRequest();
        request.setCardId(DefaultParams.ICCID);
        PoolopQueryCardDetailsResponse response = client.execute(request);

        TestCase.assertNotNull("response is null", response);
        TestCase.assertNotNull("code is null", response.getCode());
        TestCase.assertNotNull("message is null", response.getMessage());

        System.out.println(JSON.toJSONString(response));
    }
}
