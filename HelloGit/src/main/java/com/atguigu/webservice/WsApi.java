package com.atguigu.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * @author zqh
 * @date 2022-10-26 14:20
 */
@WebService
public interface WsApi {
    
    @WebMethod
    String getWords( @WebParam(name="FromName",targetNamespace = "http://com.atguigu.webservice.WsImpl.getWords")String FromName);
}
