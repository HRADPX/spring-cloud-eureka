package com.hr.client.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author huangran <huangran@hr.com>
 * Created on 2022-11-20
 */
@RestController
@RequestMapping("/hello")
public class EurekaController {

    @RequestMapping("/world")
    public String hello(String s) {
        return "client:" +  s;
    }
}
