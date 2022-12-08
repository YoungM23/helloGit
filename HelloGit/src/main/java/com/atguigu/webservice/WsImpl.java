package com.atguigu.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * @author zqh
 * @date 2022-10-26 14:25
 */
@WebService
public class WsImpl implements WsApi{
    @Override
    @WebMethod
    public String getWords(@WebParam(name="FromName",targetNamespace = "http://com.atguigu.webservice.WsImpl.getWords") String FromName) {
        return FromName + " says : hello world!";
    }
}
