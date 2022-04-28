package com.atguigu.webservice;

import java.net.MalformedURLException;
import java.net.URL;

import java.util.ArrayList;
import java.util.Date;
import java.text.DateFormat;
import org.apache.axis.client.Call;
import org.apache.axis.client.Service;
import javax.xml.namespace.QName;
//import javax.xml.ws.Service;
import java.lang.Integer;
import java.util.List;
import javax.xml.rpc.ParameterMode;


public class Test {
    public static void main(String[] args) throws MalformedURLException {

        int a =1;
        String b ="22";
        Object c ="abc";
        
        if (c instanceof String){
            System.out.println(c);
            Class<?> aClass = c.getClass();
            System.out.println(aClass);

        }

//        //创建WSDL文件的URL
//        URL wsdlDocumentLocation=new URL("http://127.0.0.1:12345/weather?wsdl");
//        //创建服务名称
//        //1.namespaceURI - 命名空间地址
//        //2.localPart - 服务视图名
//        QName serviceName=new QName("http://127.0.0.1:12345/","WeatherInterfaceImplPort");
//        Service service=Service.create(wsdlDocumentLocation, serviceName);
//
//   

    }
}
