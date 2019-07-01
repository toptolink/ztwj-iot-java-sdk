package com.ztwj.query;

import com.alibaba.fastjson.JSON;
import com.ztwj.DefaultClientTest;
import com.ztwj.requests.query.GetCardMemberDetailsExtRequest;
import com.ztwj.responses.query.GetCardMemberDetailsExtResponse;
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
public class GetCardMemberDetailsExtRequestTest extends DefaultClientTest {
    @Before
    public void setUp() throws Exception {
        System.out.println("GetCardMemberDetailsExtRequestTest start");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("GetCardMemberDetailsExtRequestTest end");
    }

    @Test
    public void getCardMemberDetailsExt() throws Exception {
        GetCardMemberDetailsExtRequest request = new GetCardMemberDetailsExtRequest();
        GetCardMemberDetailsExtResponse response = client.execute(request);

        TestCase.assertNotNull("response is null", response);
        TestCase.assertNotNull("code is null", response.getCode());
        TestCase.assertNotNull("message is null", response.getMessage());

        System.out.println(JSON.toJSONString(response));
    }

    @Test
    public void getCardMemberDetailsExt_normal() throws Exception {
        GetCardMemberDetailsExtRequest request = new GetCardMemberDetailsExtRequest();
        request.setCardIds("89860117750035486415,89860117750035486423,89860117750035486431");
        //request.setCardIds("89860117750035486415,89860117750035486423,89860117750035486431");
        //request.setCardIds("89860117750035486415,89860117750035486423,89860117750035486431");
        request.setOperator("2");
        GetCardMemberDetailsExtResponse response = client.execute(request);

        TestCase.assertNotNull("response is null", response);
        TestCase.assertNotNull("code is null", response.getCode());
        TestCase.assertNotNull("message is null", response.getMessage());

        System.out.println(JSON.toJSONString(response));
    }
}