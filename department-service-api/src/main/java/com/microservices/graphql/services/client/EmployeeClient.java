package com.microservices.graphql.services.client;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "employee-service-api")
public class EmployeeClient {
}
