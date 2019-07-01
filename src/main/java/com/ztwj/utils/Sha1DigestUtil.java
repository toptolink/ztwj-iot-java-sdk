package com.ztwj.utils;

import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @author LIUSF
 * @date 2019-03-27 18:32:06
 */
public class Sha1DigestUtil {

    private Sha1DigestUtil(){}

    public static String getSign(String data) throws IOException, NoSuchAlgorithmException {
        byte[] sha1Digest = getSHA1Digest(data);
        return byte2hex(sha1Digest);
    }

    private static byte[] getSHA1Digest(String data) throws IOException, NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA-1");
        return md.digest(data.getBytes("UTF-8"));
    }

    /**
     * 二进制转十六进制字符串
     *
     * @param bytes
     * @return
     */
    private static String byte2hex(byte[] bytes) {
        StringBuilder sign = new StringBuilder();
        for (byte b : bytes) {
            String hex = Integer.toHexString(b & 0xFF);
            if (hex.length() == 1) {
                sign.append("0");
            }
            sign.append(hex.toUpperCase());
        }
        return sign.toString();
    }
}
