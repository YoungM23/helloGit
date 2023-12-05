package com.atguigu.util;

import org.apache.commons.io.FileUtils;

import java.io.*;

/**
 * 文件工具类
 * @author 一小只
 */
public class FileOperationUtil {

    /**
     *	删除文件，不论是文件夹亦或是文件
     * @param file  文件 （"C:\\Users\\33\\Desktop\\测试删除"）
     */
    public static void deleteFile(File file) {
        try {
            if (file.isDirectory()) { //如果是 文件夹
                FileUtils.deleteDirectory(file);
            } else if (file.isFile()) {//如果是文件 
                file.delete();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     *	文件设置只读
     */
    public static void setReadOnly(File file) {
        // mark this file as read only, since jdk 1.2
        file.setReadOnly();
    }

    /**
     *	还原操作，将此文件标记为可写
     */
    public static void setWritable(File file) {
        // revert the operation, mark this file as writable, since jdk 1.6
        if (!file.canWrite()) file.setWritable(true);
    }

    /**
     * 将文件转换成Byte数组
     * @param pathStr  文件坐标
     * @return Byte数组
     */
    public static byte[] getBytesByFile(String pathStr) {
        File file = new File(pathStr);
        try {
            FileInputStream fis = new FileInputStream(file);
            ByteArrayOutputStream bos = new ByteArrayOutputStream(1000);
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
        }
        return null;
    }

    /**
     * 将Byte数组转换成文件
     * @param bytes  Byte数组
     * @param filePath  文件坐标
     * @param fileName  文件名称
     */
    public static void getFileByBytes(byte[] bytes, String filePath, String fileName) {
        BufferedOutputStream bos = null;
        FileOutputStream fos = null;
        File file = null;
        try {
            File dir = new File(filePath);
            if (!dir.exists()) {// 判断文件目录是否存在
                dir.mkdirs();
            }
            file = new File(filePath + fileName);
            fos = new FileOutputStream(file);
            bos = new BufferedOutputStream(fos);
            bos.write(bytes);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (bos != null) {
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
