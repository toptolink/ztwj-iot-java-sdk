package com.ztwj.handle;

import com.alibaba.fastjson.JSON;
import com.ztwj.DefaultClientTest;
import com.ztwj.requests.handle.RechargeVoicePackageRequest;
import com.ztwj.responses.handle.RechargeVoicePackageResponse;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Description: ztwj-iot-java-sdk
 *
 * @author : fire
 * @date : 2019/5/24 11:02
 */
public class RechargeVoicePackageRequestTest extends DefaultClientTest {
    @Before
    public void setUp() throws Exception {
        System.out.println("RechargeVoicePackageRequestTest start");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("RechargeVoicePackageRequestTest end");
    }

    @Test
    public void rechargeVoicePackage() throws Exception {
        RechargeVoicePackageRequest request = new RechargeVoicePackageRequest();
        RechargeVoicePackageResponse response = client.execute(request);

        TestCase.assertNotNull("response is null", response);
        TestCase.assertNotNull("code is null", response.getCode());
        TestCase.assertNotNull("message is null", response.getMessage());

        System.out.println(JSON.toJSONString(response));
    }
}