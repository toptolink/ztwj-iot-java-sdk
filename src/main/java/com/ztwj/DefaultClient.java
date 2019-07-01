package com.ztwj;

import com.alibaba.fastjson.JSON;
import com.ztwj.requests.BaseRequest;
import com.ztwj.responses.BaseResponse;
import com.ztwj.utils.HttpUtil;
import com.ztwj.utils.Sha1DigestUtil;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.*;

/**
 * 默认客户端
 *
 * @author LIUSF
 * @date 2019-03-27 18:32:06
 */
public final class DefaultClient implements ZtwjApiClient {
    private static final String TYPE_NAME_PREFIX = "class ";
    private static final String DEFAULT_URL = "https://api.toptolink.com/api";
    private static final String DEFAULT_VERSION = "v1";

    private String url;
    private String appKey;
    private String secret;
    private String version;

    public DefaultClient(String appKey, String secret) {
        this(DEFAULT_URL, appKey, secret);
    }

    public DefaultClient(String url, String appKey, String secret) {
        this(url, appKey, secret, DEFAULT_VERSION);
    }

    public DefaultClient(String url, String appKey, String secret, String version) {
        this.url = url;
        this.appKey = appKey;
        this.secret = secret;
        this.version = version;
    }

    public <T extends BaseResponse> T execute(BaseRequest<T> request) {
        assertNotEmpty(url, appKey, secret, version);
        Type type = ((ParameterizedType) request.getClass().getGenericSuperclass()).getActualTypeArguments()[0];

        String className = type.toString();
        if (className.startsWith(TYPE_NAME_PREFIX)) {
            className = className.substring(TYPE_NAME_PREFIX.length());
        }
        try {
            Map<String, Object> params = new HashMap<String, Object>(16);
            Field[] fs = request.getClass().getDeclaredFields();
            for (Field f : fs) {
                f.setAccessible(true);
                Object val = f.get(request);
                if (val == null) {
                    f.setAccessible(false);
                    continue;
                }
                params.put(f.getName(), val);
                f.setAccessible(false);
            }

            params.put("timestamp", System.currentTimeMillis() / 1000);
            params.put("appKey", appKey);
            params.put("nonce", (int) ((Math.random() * 9 + 1) * 10000));

            String sign = Sha1DigestUtil.getSign(getParamsString(params));
            params.put("sign", sign);
            String uri = UriRegister.getUri(request.getClass().getName());
            String fullUrl = getFullUrl(uri);
            String result = HttpUtil.post(fullUrl, params);
            Class clazz = this.getClass().getClassLoader().loadClass(className);
            return (T) JSON.parseObject(result, clazz);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    private String getFullUrl(String uri) {
        StringBuilder builder = new StringBuilder();
        builder.append(url);
        if (!url.endsWith("/")) {
            builder.append("/");
        }
        builder.append(version);
        if (!uri.startsWith("/")) {
            builder.append("/");
        }
        builder.append(uri);
        return builder.toString();
    }

    private void assertNotEmpty(String url, String appKey, String secret, String version) {
        if (emptyString(url)) {
            throw new IllegalArgumentException("url 不能为空");
        }
        if (emptyString(appKey)) {
            throw new IllegalArgumentException("appKey 不能为空");
        }
        if (emptyString(secret)) {
            throw new IllegalArgumentException("secret 不能为空");
        }
        if (emptyString(version)) {
            throw new IllegalArgumentException("version 不能为空");
        }
    }

    private boolean emptyString(String obj) {
        return obj == null || "".equals(obj) || "".equals(obj.trim());
    }

    private String getParamsString(Map<String, Object> paramValues) {
        StringBuilder sb = new StringBuilder();
        List<String> paramNames = new ArrayList<String>(paramValues.size());
        paramNames.addAll(paramValues.keySet());

        Collections.sort(paramNames);

        sb.append(secret);
        for (String paramName : paramNames) {
            sb.append(paramName).append(paramValues.get(paramName));
        }
        sb.append(secret);
        return sb.toString();
    }
}
