package com.atguigu.util;

import com.atguigu.git.HelloGit;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
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
        final Base64.Decoder decoder = Base64.getDecoder();
        final Base64.Encoder encoder = Base64.getEncoder();
//        final String text = "字串文字";
        byte[] textByte = new byte[0];
        
//            textByte = text.getBytes("UTF-8");

            String fileString = getFileString(fileLocation);
            textByte = fileString.getBytes("UTF-8");
        


//编码
        final String encodedText = encoder.encodeToString(textByte);
//        System.out.println(encodedText);
        return encodedText;
//解码
//        try {
//            System.out.println(new String(decoder.decode(encodedText), "UTF-8"));
//        } catch (UnsupportedEncodingException e) {
//            e.printStackTrace();
//        }

    }

    /**
     * 获取文件流
     * @param fileLocation 文件路径
     * @return
     */
    private static String getFileString(String fileLocation){

        FileInputStream fis = null;
        try {
            fis = new FileInputStream(fileLocation);
            StringBuilder sb = new StringBuilder();
            int temp = 0;
            //当temp等于-1时，表示已经到了文件结尾，停止读取
            while ((temp = fis.read()) != -1) {
                sb.append((char) temp);
            }

            return sb.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

        return "";
    }
    
}
