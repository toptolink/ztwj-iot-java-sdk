package com.ztwj.whitelist;

import com.alibaba.fastjson.JSON;
import com.ztwj.DefaultClientTest;
import com.ztwj.requests.whitelist.DeleteWhitelistContactRequest;
import com.ztwj.responses.whitelist.DeleteWhitelistContactResponse;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @Description 白名单单个新增接口  单元测试
 * @Author zhengjiongda
 * @Date 2020/12/14 11:55
 * @Version 1.0
 **/
public class DeleteWhitelistContactRequestTest extends DefaultClientTest {


    @Before
    public void setUp() throws Exception {
        System.out.println("DeleteWhitelistContactRequestTest start");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("DeleteWhitelistContactRequestTest end");
    }

    @Test
    public void deleteWhitelistContactRequestTest() throws Exception {
        DeleteWhitelistContactRequest request = new DeleteWhitelistContactRequest();
        request.setIccid("89860800112070073957");
        request.setWhiteMsisdn("18826138716");
        DeleteWhitelistContactResponse response = client.execute(request);

        TestCase.assertNotNull("response is null", response);
        TestCase.assertNotNull("code is null", response.getCode());
        TestCase.assertNotNull("message is null", response.getMessage());

        System.out.println(JSON.toJSONString(response));
    }

}
