package com.ztwj.shrepool;

import com.alibaba.fastjson.JSON;
import com.ztwj.DefaultClientTest;
import com.ztwj.requests.shrepool.QuerySharedPoolListRequest;
import com.ztwj.responses.sharepool.QuerySharedPoolListResponse;
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
public class QuerySharedPoolListRequestTest extends DefaultClientTest {
    @Before
    public void setUp() throws Exception {
        System.out.println("QuerySharedPoolListRequestTest start");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("QuerySharedPoolListRequestTest end");
    }

    @Test
    public void querySharedPoolList() throws Exception {
        QuerySharedPoolListRequest request = new QuerySharedPoolListRequest();
        QuerySharedPoolListResponse response = client.execute(request);

        TestCase.assertNotNull("response is null", response);
        TestCase.assertNotNull("code is null", response.getCode());
        TestCase.assertNotNull("message is null", response.getMessage());

        System.out.println(JSON.toJSONString(response));
    }
}