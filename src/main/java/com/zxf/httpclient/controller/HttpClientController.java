package com.zxf.httpclient.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/http")
public class HttpClientController {


    @RequestMapping("/test")
    public String test(){
        return "123";
    }




}
