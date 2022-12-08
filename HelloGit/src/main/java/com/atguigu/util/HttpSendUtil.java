package com.atguigu.util;


import java.io.IOException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

/**
 * HTTP工具类
 *
 */
public class HttpSendUtil {

    /**
     * 使用apache的HttpClient发送http
     *
     * @param wsdlURL     请求URL
     * @param contentType 如:application/json;charset=utf8
     * @param content     数据内容
     */
    public static String doHttpPostByHttpClient(final String wsdlURL, final String contentType, final String content)
            throws ClientProtocolException, IOException {
        // 获得Http客户端(可以理解为:你得先有一个浏览器;注意:实际上HttpClient与浏览器是不一样的)
        CloseableHttpClient httpClient = HttpClientBuilder.create().build();
        // 创建Post请求
        HttpPost httpPost = new HttpPost(wsdlURL);
        StringEntity entity = new StringEntity(content.toString(), "UTF-8");
        // 将数据放入entity中
        httpPost.setEntity(entity);
        httpPost.setHeader("Content-Type", contentType);
        // 响应模型
        CloseableHttpResponse response = null;
        String result = null;
        try {
            // 由客户端执行(发送)Post请求
            response = httpClient.execute(httpPost);
            // 从响应模型中获取响应实体
            // 注意:和doHttpPostByRestTemplate方法用的不是同一个HttpEntity
            org.apache.http.HttpEntity responseEntity = response.getEntity();
            System.out.println("响应ContentType为:" + responseEntity.getContentType());
            System.out.println("响应状态为:" + response.getStatusLine());
            if (responseEntity != null) {
                result = EntityUtils.toString(responseEntity);
                System.out.println("响应内容为:" + result);
            }
        } finally {
            // 释放资源
            if (httpClient != null) {
                httpClient.close();
            }
            if (response != null) {
                response.close();
            }
        }
        return result;
    }
}
