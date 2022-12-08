package com.atguigu.webservice;

import com.atguigu.util.HttpSendUtil;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.OMXMLBuilderFactory;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Iterator;

/**
 * @author zqh
 * @date 2022-10-15 14:52
 */
public class WebServiceTest {
    public static void main(String[] args) {

        // webservice的wsdl地址
        final String wsdlURL = "http://www.webxml.com.cn/WebServices/WeatherWebService.asmx?wsdl";
        // 设置编码。(因为是直接传的xml,所以我们设置为text/xml;charset=utf8)
        final String contentType = "text/xml;charset=UTF-8";


        StringBuffer xMLcontent = new StringBuffer("");
        xMLcontent.append("<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:web=\"http://WebXml.com.cn/\">\n");
        xMLcontent.append("   <soapenv:Header/>\n");
        xMLcontent.append("   <soapenv:Body>\n");
        xMLcontent.append("      <web:getSupportCity>\n");
        xMLcontent.append("         <web:byProvinceName>四川</web:byProvinceName>\n");
        xMLcontent.append("      </web:getSupportCity>\n");
        xMLcontent.append("   </soapenv:Body>\n");
        xMLcontent.append("</soapenv:Envelope>");

        // 调用工具类方法发送http请求
        String responseXML = null;
        try {
            responseXML = HttpSendUtil.doHttpPostByHttpClient(wsdlURL,contentType, xMLcontent.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }


        // 利用axis2的OMElement,将xml数据转换为OMElement
        OMElement omElement = OMXMLBuilderFactory
                .createOMBuilder(new ByteArrayInputStream(responseXML.getBytes()), "utf-8").getDocumentElement();

        // 根据responseXML的数据样式,定位到对应element,然后获得其childElements,遍历
        Iterator<OMElement> it = omElement.getFirstElement().getFirstElement().getFirstElement().getChildElements();
        while (it.hasNext()) {
            OMElement element = it.next();
            System.out.println("属性名:" + element.getLocalName() + "\t属性值:" + element.getText());
        }
    }
}
