package com.ztwj.query;

import com.alibaba.fastjson.JSON;
import com.ztwj.DefaultClientTest;
import com.ztwj.requests.query.GetPackageListRequest;
import com.ztwj.responses.query.GetPackageListResponse;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Description: ztwj-iot-java-sdk
 *
 * @author : fire
 * @date : 2019/5/24 11:05
 */
public class GetPackageListRequestTest extends DefaultClientTest {
    @Before
    public void setUp() throws Exception {
        System.out.println("GetPackageListRequestTest start");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("GetPackageListRequestTest end");
    }

    @Test
    public void getPackageList() throws Exception {
        GetPackageListRequest request = new GetPackageListRequest();
        GetPackageListResponse response = client.execute(request);

        TestCase.assertNotNull("response is null", response);
        TestCase.assertNotNull("code is null", response.getCode());
        TestCase.assertNotNull("message is null", response.getMessage());

        System.out.println(JSON.toJSONString(response));
    }

    @Test
    public void getPackageList_normal() throws Exception {
        GetPackageListRequest request = new GetPackageListRequest();
        request.setCardId("89860117750035486423");
        GetPackageListResponse response = client.execute(request);

        TestCase.assertNotNull("response is null", response);
        TestCase.assertNotNull("code is null", response.getCode());
        TestCase.assertNotNull("message is null", response.getMessage());

        System.out.println(JSON.toJSONString(response));
    }
}