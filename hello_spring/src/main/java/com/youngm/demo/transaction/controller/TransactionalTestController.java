package com.youngm.demo.transaction.controller;

import com.youngm.demo.transaction.TransactionalTestService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author zqh
 * @date 2022-05-12 16:08
 */
@RestController
@RequestMapping("/test")
public class TransactionalTestController {
    
    @Resource
    private TransactionalTestService transactionalTestService;
    
    @GetMapping("/tran")
    public void testTran(){
        transactionalTestService.doStation();
    }
}
