package com.ztwj;

import com.alibaba.fastjson.JSON;
import com.ztwj.consts.CardIdType;
import com.ztwj.consts.Operator;
import com.ztwj.requests.query.*;
import com.ztwj.responses.query.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Description: ztwj-iot-java-sdk
 *
 * @author : fire
 * @date : 2019/5/17 18:32
 */
public class DefaultClientTest {
    protected static ZtwjApiClient client = new DefaultClient(
            DefaultParams.URL,
            DefaultParams.APPKEY,
            DefaultParams.SECRET);
}