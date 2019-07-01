package com.ztwj.query;

import com.alibaba.fastjson.JSON;
import com.ztwj.DefaultClientTest;
import com.ztwj.requests.query.GetCardFlowDataByPeriodRequest;
import com.ztwj.responses.query.GetCardFlowDataByPeriodResponse;
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
public class GetCardFlowDataByPeriodRequestTest extends DefaultClientTest {
    @Before
    public void setUp() throws Exception {
        System.out.println("GetCardFlowDataByPeriodRequestTest start");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("GetCardFlowDataByPeriodRequestTest end");
    }

    @Test
    public void getCardFlowDataByPeriod() throws Exception {
        GetCardFlowDataByPeriodRequest request = new GetCardFlowDataByPeriodRequest();
        GetCardFlowDataByPeriodResponse response = client.execute(request);

        TestCase.assertNotNull("response is null", response);
        TestCase.assertNotNull("code is null", response.getCode());
        TestCase.assertNotNull("message is null", response.getMessage());

        System.out.println(JSON.toJSONString(response));
    }

    @Test
    public void getCardFlowDataByPeriod_normal() throws Exception {
        GetCardFlowDataByPeriodRequest request = new GetCardFlowDataByPeriodRequest();
        request.setCardId("89860117750035486415");
        request.setStartTime("2019-03-10");
        request.setEndTime("2019-05-01");
        GetCardFlowDataByPeriodResponse response = client.execute(request);

        TestCase.assertNotNull("response is null", response);
        TestCase.assertNotNull("code is null", response.getCode());
        TestCase.assertNotNull("message is null", response.getMessage());

        System.out.println(JSON.toJSONString(response));
    }

}