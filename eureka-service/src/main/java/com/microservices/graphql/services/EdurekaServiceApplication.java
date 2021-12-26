package com.microservices.graphql.services;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EdurekaServiceApplication {
        public static void main(String[] args) {
            SpringApplication.run(EdurekaServiceApplication.class, args);
        }
}
