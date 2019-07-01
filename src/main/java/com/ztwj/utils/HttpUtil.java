package com.ztwj.utils;

import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.*;

/**
 * @author LIUSF
 * @date 2019-03-27 18:32:06
 */
public class HttpUtil {
    private static final Logger logger = LoggerFactory.getLogger(HttpUtil.class);

    /**
     * url 请求 paramUrl
     *
     * @param url    url请求地址
     * @param params url请求参数
     * @return
     * @time 2015年11月10日下午4:40:22
     * @packageName com.rom.utils
     */
    public static String post(String url, Map<String, Object> params) throws Exception {
        String result;
        RequestConfig config = RequestConfig.custom()
                .setConnectionRequestTimeout(10000).setConnectTimeout(10000)
                .setSocketTimeout(10000).build();

        HttpPost httpPost = new HttpPost(url);
        httpPost.setConfig(config);
        if (params != null) {
            // 参数格式为 键值对形式
            List<NameValuePair> formparams = new ArrayList<NameValuePair>();
            Set<String> keySet = params.keySet();
            Iterator<String> iterator = keySet.iterator();
            while (iterator.hasNext()) {
                String key = iterator.next();
                formparams.add(new BasicNameValuePair(key, String.valueOf(params.get(key))));
            }
            UrlEncodedFormEntity uefEntity = new UrlEncodedFormEntity(formparams, "UTF-8");
            httpPost.setEntity(uefEntity);
        }

        /** 设置进去 */
        CloseableHttpClient httpClient = HttpClients.custom().setDefaultRequestConfig(null).build();
        CloseableHttpResponse response;
        StringBuffer out;
        try {
            logger.info("url:{}, params:{}", url, params);
            response = httpClient.execute(httpPost);
            HttpEntity entity = response.getEntity();
            InputStream in = entity.getContent();
            out = new StringBuffer();
            byte[] b = new byte[4096];
            for (int n; (n = in.read(b)) != -1; ) {
                out.append(new String(b, 0, n));
            }
            result = out.toString();
            logger.info("result:{}", result);
            return result;
        } finally {
            try {
                if (httpClient != null) {
                    httpClient.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
