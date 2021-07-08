package com.ztwj.whitelist;

import com.alibaba.fastjson.JSON;
import com.ztwj.DefaultClientTest;
import com.ztwj.requests.whitelist.GetWhitelistOperateRecordRequest;
import com.ztwj.responses.whitelist.GetWhitelistOperateRecordResponse;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @Description 白名单操作记录 单元测试
 * @Author zhengjiongda
 * @Date 2020/12/14 11:57
 * @Version 1.0
 **/
public class GetWhitelistOperateRecordRequestTest extends DefaultClientTest {

    @Before
    public void setUp() throws Exception {
        System.out.println("GetWhitelistOperateRecordRequestTest start");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("GetWhitelistOperateRecordRequestTest end");
    }

    @Test
    public void getWhitelistOperateRecordRequestTest() throws Exception {
        GetWhitelistOperateRecordRequest request = new GetWhitelistOperateRecordRequest();
        request.setIccid("89860800112070073957");
        GetWhitelistOperateRecordResponse response = client.execute(request);

        TestCase.assertNotNull("response is null", response);
        TestCase.assertNotNull("code is null", response.getCode());
        TestCase.assertNotNull("message is null", response.getMessage());

        System.out.println(JSON.toJSONString(response));
    }
}
