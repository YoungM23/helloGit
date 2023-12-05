package com.atguigu.util;

import com.atguigu.git.HelloGit;

import java.io.*;
import java.util.Base64;

/**
 * @author zqh
 * @date 2022-12-26 11:02
 */
public class Base64Util {

    /**
     * 对文件进行base64编码
     * @param fileLocation 文件路径
     * @return
     * @throws UnsupportedEncodingException
     */
    public static String encode(String fileLocation) throws UnsupportedEncodingException {
        final Base64.Encoder encoder = Base64.getEncoder();
        byte[] bytesByFile = getBytesByFile(fileLocation);
        //编码
        final String encodedText = encoder.encodeToString(bytesByFile);
        return encodedText;
    }


    /**
     * 将文件转换成Byte数组
     * @param pathStr  文件坐标
     * @return Byte数组
     */
    public static byte[] getBytesByFile(String pathStr) {
        File file = new File(pathStr);
        FileInputStream fis = null;
        ByteArrayOutputStream bos = null;
        try {
            fis=new FileInputStream(file);
            bos = new ByteArrayOutputStream(1000);
            byte[] b = new byte[1000];
            int n;
            while ((n = fis.read(b)) != -1) {
                bos.write(b, 0, n);
            }
            fis.close();
            byte[] data = bos.toByteArray();
            bos.close();
            return data;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                bos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

        return null;
    }
}
