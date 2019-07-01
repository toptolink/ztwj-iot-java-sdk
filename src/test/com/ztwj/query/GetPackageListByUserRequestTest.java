package com.ztwj.query;

import com.alibaba.fastjson.JSON;
import com.ztwj.DefaultClientTest;
import com.ztwj.requests.query.GetPackageListByUserRequest;
import com.ztwj.responses.query.GetPackageListByUserResponse;
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
public class GetPackageListByUserRequestTest extends DefaultClientTest {
    @Before
    public void setUp() throws Exception {
        System.out.println("GetPackageListByUserRequestTest start");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("GetPackageListByUserRequestTest end");
    }

    @Test
    public void getPackageListByUser() throws Exception {
        GetPackageListByUserRequest request = new GetPackageListByUserRequest();
        GetPackageListByUserResponse response = client.execute(request);

        TestCase.assertNotNull("response is null", response);
        TestCase.assertNotNull("code is null", response.getCode());
        TestCase.assertNotNull("message is null", response.getMessage());

        System.out.println(JSON.toJSONString(response));
    }
}