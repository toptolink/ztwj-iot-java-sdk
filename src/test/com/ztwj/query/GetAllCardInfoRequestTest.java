package com.ztwj.query;

import com.alibaba.fastjson.JSON;
import com.ztwj.DefaultClientTest;
import com.ztwj.consts.CardIdType;
import com.ztwj.consts.Operator;
import com.ztwj.requests.query.*;
import com.ztwj.responses.query.*;
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
public class GetAllCardInfoRequestTest extends DefaultClientTest {
    @Before
    public void setUp() throws Exception {
        System.out.println("GetAllCardInfoRequestTest start");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("GetAllCardInfoRequestTest end");
    }

    @Test
    public void getAllCardInfo() throws Exception {
        GetAllCardInfoRequest request = new GetAllCardInfoRequest();
        GetAllCardInfoResponse response = client.execute(request);

        TestCase.assertNotNull("response is null", response);
        TestCase.assertNotNull("code is null", response.getCode());
        TestCase.assertNotNull("message is null", response.getMessage());

        System.out.println(JSON.toJSONString(response));
    }

    @Test
    public void getAllCardInfo_normal() throws Exception {
        GetAllCardInfoRequest request = new GetAllCardInfoRequest();
        request.setOperator(Operator.MOBILE);
        request.setPageNum("1");
        GetAllCardInfoResponse response = client.execute(request);

        TestCase.assertNotNull("response is null", response);
        TestCase.assertNotNull("code is null", response.getCode());
        TestCase.assertNotNull("message is null", response.getMessage());

        System.out.println(JSON.toJSONString(response));
    }
}