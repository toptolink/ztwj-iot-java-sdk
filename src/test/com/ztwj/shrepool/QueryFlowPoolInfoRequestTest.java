package com.ztwj.shrepool;

import com.alibaba.fastjson.JSON;
import com.ztwj.DefaultClientTest;
import com.ztwj.requests.shrepool.QueryFlowPoolInfoRequest;
import com.ztwj.responses.sharepool.QueryFlowPoolInfoResponse;
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
public class QueryFlowPoolInfoRequestTest extends DefaultClientTest {
    @Before
    public void setUp() throws Exception {
        System.out.println("QueryFlowPoolInfoRequestTest start");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("QueryFlowPoolInfoRequestTest end");
    }

    @Test
    public void queryFlowPoolInfo() throws Exception {
        QueryFlowPoolInfoRequest request = new QueryFlowPoolInfoRequest();
        QueryFlowPoolInfoResponse response = client.execute(request);

        TestCase.assertNotNull("response is null", response);
        TestCase.assertNotNull("code is null", response.getCode());
        TestCase.assertNotNull("message is null", response.getMessage());

        System.out.println(JSON.toJSONString(response));
    }
}