package com.ztwj.query;

import com.alibaba.fastjson.JSON;
import com.ztwj.DefaultClientTest;
import com.ztwj.consts.CardIdType;
import com.ztwj.consts.Operator;
import com.ztwj.requests.query.GetBatchAllCardNumberRequest;
import com.ztwj.responses.query.GetBatchAllCardNumberResponse;
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
public class GetBatchAllCardNumberRequestTest extends DefaultClientTest {
    @Before
    public void setUp() throws Exception {
        System.out.println("GetBatchAllCardNumberRequestTest start");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("GetBatchAllCardNumberRequestTest end");
    }

    @Test
    public void getBatchAllCardNumber() throws Exception {
        GetBatchAllCardNumberRequest request = new GetBatchAllCardNumberRequest();
        GetBatchAllCardNumberResponse response = client.execute(request);

        TestCase.assertNotNull("response is null", response);
        TestCase.assertNotNull("code is null", response.getCode());
        TestCase.assertNotNull("message is null", response.getMessage());

        System.out.println(JSON.toJSONString(response));
    }

    @Test
    public void getBatchAllCardNumber_normal() throws Exception {
        GetBatchAllCardNumberRequest request = new GetBatchAllCardNumberRequest();
        request.setCardIds("89860617030017577373,89860617030060725507");
        request.setOperator(Operator.UNION);
        request.setType(CardIdType.CARDID_ICCID);
        GetBatchAllCardNumberResponse response = client.execute(request);

        TestCase.assertNotNull("response is null", response);
        TestCase.assertNotNull("code is null", response.getCode());
        TestCase.assertNotNull("message is null", response.getMessage());

        System.out.println(JSON.toJSONString(response));
    }
}