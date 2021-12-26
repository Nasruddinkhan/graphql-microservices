package com.microservices.graphql.services.fetcher;

import com.microservices.graphql.services.dto.Department;

import java.util.ArrayList;
import java.util.List;

public class DataDto {
    private DataDto(){}
    public static List<Department> departments = new ArrayList<>();

    static {
        departments.add(new Department(1, "Development"));
        departments.add(new Department(1, "Operations"));
        departments.add(new Department(2, "Development"));
        departments.add(new Department(2, "Operations"));
    }
}
