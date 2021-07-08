package com.ztwj.query;

import com.alibaba.fastjson.JSON;
import com.ztwj.DefaultClientTest;
import com.ztwj.consts.CardIdType;
import com.ztwj.consts.IccidLenType;
import com.ztwj.requests.query.GetSingleCardNumberRequest;
import com.ztwj.responses.query.GetSingleCardNumberResponse;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @Description 单个码号查询单元测试
 * @Author zhengjiongda
 * @Date 2020/12/14 11:38
 * @Version 1.0
 **/
public class GetSingleCardNumberRequestTest  extends DefaultClientTest {

    @Before
    public void setUp() throws Exception {
        System.out.println("GetSingleCardNumberRequestTest start");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("GetSingleCardNumberRequestTest end");
    }

    @Test
    public void getSingleCardNumberRequestTest() throws Exception {
        GetSingleCardNumberRequest request = new GetSingleCardNumberRequest();
        request.setCardId("898602F2191871564623");
        request.setIccidLenType(IccidLenType.ICCIDLEN_20);
        request.setType(CardIdType.CARDID_ICCID);
        GetSingleCardNumberResponse response = client.execute(request);

        TestCase.assertNotNull("response is null", response);
        TestCase.assertNotNull("code is null", response.getCode());
        TestCase.assertNotNull("message is null", response.getMessage());

        System.out.println(JSON.toJSONString(response));
    }

}
