package com.ztwj.query;

import com.alibaba.fastjson.JSON;
import com.ztwj.DefaultClientTest;
import com.ztwj.requests.query.GetPackageRechargeListRequest;
import com.ztwj.responses.query.GetPackageRechargeListResponse;
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
public class GetPackageRechargeListRequestTest extends DefaultClientTest {
    @Before
    public void setUp() throws Exception {
        System.out.println("GetPackageRechargeListRequestTest start");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("GetPackageRechargeListRequestTest end");
    }

    @Test
    public void getPackageRechargeList() throws Exception {
        GetPackageRechargeListRequest request = new GetPackageRechargeListRequest();
        GetPackageRechargeListResponse response = client.execute(request);

        TestCase.assertNotNull("response is null", response);
        TestCase.assertNotNull("code is null", response.getCode());
        TestCase.assertNotNull("message is null", response.getMessage());

        System.out.println(JSON.toJSONString(response));
    }

    @Test
    public void getPackageRechargeList_normal() throws Exception {
        GetPackageRechargeListRequest request = new GetPackageRechargeListRequest();
        request.setOrderNo("1553755869737154359");
        GetPackageRechargeListResponse response = client.execute(request);

        TestCase.assertNotNull("response is null", response);
        TestCase.assertNotNull("code is null", response.getCode());
        TestCase.assertNotNull("message is null", response.getMessage());

        System.out.println(JSON.toJSONString(response));
    }
}