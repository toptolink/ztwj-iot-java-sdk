package com.ztwj.whitelist;

import com.alibaba.fastjson.JSON;
import com.ztwj.DefaultClientTest;
import com.ztwj.requests.whitelist.AddWhitelistContactRequest;
import com.ztwj.responses.whitelist.AddWhitelistContactResponse;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @Description 白名单单个新增接口  单元测试
 * @Author zhengjiongda
 * @Date 2020/12/14 11:53
 * @Version 1.0
 **/
public class AddWhitelistContactRequestTest extends DefaultClientTest {

    @Before
    public void setUp() throws Exception {
        System.out.println("AddWhitelistContactRequestTest start");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("AddWhitelistContactRequestTest end");
    }

    @Test
    public void addWhitelistContactRequestTest() throws Exception {
        AddWhitelistContactRequest request = new AddWhitelistContactRequest();
        request.setIccid("89860800112070073957");
        request.setContact("zjd");
        request.setWhiteMsisdn("18826138716");
        AddWhitelistContactResponse response = client.execute(request);

        TestCase.assertNotNull("response is null", response);
        TestCase.assertNotNull("code is null", response.getCode());
        TestCase.assertNotNull("message is null", response.getMessage());

        System.out.println(JSON.toJSONString(response));
    }
}
