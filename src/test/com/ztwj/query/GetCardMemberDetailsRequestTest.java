package com.ztwj.query;

import com.alibaba.fastjson.JSON;
import com.ztwj.DefaultClientTest;
import com.ztwj.requests.query.GetCardMemberDetailsRequest;
import com.ztwj.responses.query.GetCardMemberDetailsResponse;
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
public class GetCardMemberDetailsRequestTest extends DefaultClientTest {
    @Before
    public void setUp() throws Exception {
        System.out.println("GetCardMemberDetailsRequestTest start");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("GetCardMemberDetailsRequestTest end");
    }

    @Test
    public void getCardMemberDetails() throws Exception {
        GetCardMemberDetailsRequest request = new GetCardMemberDetailsRequest();
        GetCardMemberDetailsResponse response = client.execute(request);

        TestCase.assertNotNull("response is null", response);
        TestCase.assertNotNull("code is null", response.getCode());
        TestCase.assertNotNull("message is null", response.getMessage());

        System.out.println(JSON.toJSONString(response));
    }

    @Test
    public void getCardMemberDetails_normal() throws Exception {
        GetCardMemberDetailsRequest request = new GetCardMemberDetailsRequest();
        request.setCardIds("89860117750035486415,89860117750035486423,89860117750035486431");
        request.setOperator("2");
        GetCardMemberDetailsResponse response = client.execute(request);

        TestCase.assertNotNull("response is null", response);
        TestCase.assertNotNull("code is null", response.getCode());
        TestCase.assertNotNull("message is null", response.getMessage());

        System.out.println(JSON.toJSONString(response));
    }
}