package com.ztwj;

import java.util.Arrays;
import java.util.List;

/**
 * Description: ztwj-iot-java-sdk
 *
 * @author : fire
 * @date : 2023/3/17 15:46
 */
public final class DefaultParams {
    // support TEST or IDC
    public static final String ENV_NAME = "TEST";
    // public static final String ENV_NAME = "IDC";

    // params
    private static final String url;
    private static final String appKey;
    private static final String secret;

    private static final String iccid;
    private static final String msisdn;
    private static final String imsi;
    private static final List<String> iccid_lst;

    // init
    static {
        if (ENV_NAME.equals("TEST")) { // TEST
            url = "http://api.toptolink.cn/api";
            appKey = "40516350";
            secret = "36bf39e7da6f454cb0d92f04bbf034c0";

            iccid = "89860442192070068079";
            msisdn= "";
            imsi = "";
            iccid_lst = Arrays.asList("","");
        } else { // IDC
            url = "https://api.toptolink.com/api";
            appKey = "11130";
            secret = "584f39238ef44bf8b19a862ff7fc5b09";

            iccid = "89860442192070068078";
            msisdn= "";
            imsi = "";
            iccid_lst = Arrays.asList("","");
        }
    }

    // real used value
    public static final String URL = url;
    public static final String APPKEY = appKey;
    public static final String SECRET = secret;

    public final static String ICCID = iccid;
    public final static String MSISDN = msisdn;
    public final static String IMSI = imsi;
    public final static List<String> ICCIC_LST = iccid_lst;
}
