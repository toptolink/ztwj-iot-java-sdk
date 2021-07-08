package com.ztwj.whitelist;

import com.alibaba.fastjson.JSON;
import com.ztwj.DefaultClientTest;
import com.ztwj.requests.whitelist.GetWhitelistContactRequest;
import com.ztwj.responses.whitelist.GetWhitelistContactResponse;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @Description 白名单查询接口单元测试
 * @Author zhengjiongda
 * @Date 2020/12/14 11:51
 * @Version 1.0
 **/
public class GetWhitelistContactRequestTest extends DefaultClientTest {

    @Before
    public void setUp() throws Exception {
        System.out.println("GetWhitelistContactRequestTest start");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("GetWhitelistContactRequestTest end");
    }

    @Test
    public void getWhitelistContactRequestTest() throws Exception {
        GetWhitelistContactRequest request = new GetWhitelistContactRequest();
        request.setIccid("89860800112070073957");
        GetWhitelistContactResponse response = client.execute(request);

        TestCase.assertNotNull("response is null", response);
        TestCase.assertNotNull("code is null", response.getCode());
        TestCase.assertNotNull("message is null", response.getMessage());

        System.out.println(JSON.toJSONString(response));
    }

}
