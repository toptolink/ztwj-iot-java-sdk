package com.ztwj.handle;

import com.alibaba.fastjson.JSON;
import com.ztwj.DefaultClientTest;
import com.ztwj.requests.handle.ChangeCardSwitchRequest;
import com.ztwj.responses.handle.ChangeCardSwitchResponse;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Description: ztwj-iot-java-sdk
 *
 * @author : fire
 * @date : 2019/5/24 11:01
 */
public class ChangeCardSwitchRequestTest extends DefaultClientTest {
    @Before
    public void setUp() throws Exception {
        System.out.println("ChangeCardSwitchRequestTest start");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("ChangeCardSwitchRequestTest end");
    }

    @Test
    public void changeCardSwitch() throws Exception {
        ChangeCardSwitchRequest request = new ChangeCardSwitchRequest();
        ChangeCardSwitchResponse response = client.execute(request);

        TestCase.assertNotNull("response is null", response);
        TestCase.assertNotNull("code is null", response.getCode());
        TestCase.assertNotNull("message is null", response.getMessage());

        System.out.println(JSON.toJSONString(response));
    }
}