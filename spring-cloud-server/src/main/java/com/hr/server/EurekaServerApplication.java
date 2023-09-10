package com.hr.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author huangran <huangran@hr.com>
 * Created on 2022-11-20
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {

    public static void main(String[] args){
        SpringApplication.run(EurekaServerApplication.class, args);
    }

}
