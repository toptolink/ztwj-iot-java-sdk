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
public abstract class DefaultClientTest {
    protected ZtwjApiClient client = new DefaultClient(
            "https://api.toptolink.com/api",
            "11130",
            "584f39238ef44bf8b19a862ff7fc5b09");
}