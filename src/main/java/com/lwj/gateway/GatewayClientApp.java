package com.lwj.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 各个服务实例
 * @author linwenjie
 *
 */
@SpringBootApplication
public class GatewayClientApp 
{
    public static void main( String[] args ){
        SpringApplication.run(GatewayClientApp.class, args);
    }
}
