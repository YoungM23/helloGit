package com.atguigu.util;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


import java.io.UnsupportedEncodingException;
/**
 * @author zqh
 * @date 2023-01-03 14:47
 */
public class MD5Util {

    public static String getMd5Code(String pwd) throws NoSuchAlgorithmException {
            MessageDigest md = MessageDigest.getInstance("MD5");// 生成一个MD5加密计算摘要
            md.update(pwd.getBytes());// 计算md5函数
            /**
             * digest()最后确定返回md5 hash值，返回值为8位字符串。
             * 因为md5 hash值是16位的hex值，实际上就是8位的字符
             * BigInteger函数则将8位的字符串转换成16位hex值，用字符串来表示；得到字符串形式的hash值
             * 一个byte是八位二进制，也就是2位十六进制字符（2的8次方等于16的2次方）
             */
            String hashedPwd = new BigInteger(1, md.digest()).toString(16);// 16是表示转换为16进制数
            return hashedPwd;
    }

    /**
     * 中核建中-对接HR系统用过
     * @param unencodeStr
     * @return
     */
    public static String getMD5OfStr(String unencodeStr) {
        MessageDigest messageDigest = null;
        try {
            messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.reset();
            messageDigest.update(unencodeStr.getBytes("UTF-8"));
        } catch (NoSuchAlgorithmException e) {
            System.out.println("NoSuchAlgorithmException caught!");
            System.exit(-1);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        byte[] byteArray = messageDigest.digest();
        StringBuffer md5StrBuff = new StringBuffer();
        for (int i = 0; i < byteArray.length; i++) {
            if (Integer.toHexString(0xFF & byteArray[i]).length() == 1) {
                md5StrBuff.append("0").append(Integer.toHexString(0xFF & byteArray[i]));
            } else {
                md5StrBuff.append(Integer.toHexString(0xFF & byteArray[i]));
            }
        }
        return md5StrBuff.toString();
    }
}
