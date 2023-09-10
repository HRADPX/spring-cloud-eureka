package com.hr.client1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author huangran <huangran@hr.com>
 * Created on 2022-11-20
 */
@SpringBootApplication
@EnableEurekaClient
public class ClientApplication {

    public static void main(String[] args){
        SpringApplication.run(ClientApplication.class, args);
    }

}
