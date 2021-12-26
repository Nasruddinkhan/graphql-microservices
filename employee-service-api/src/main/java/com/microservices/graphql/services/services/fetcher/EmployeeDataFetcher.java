package com.microservices.graphql.services.services.fetcher;

import com.microservices.graphql.services.services.DataDto;
import com.microservices.graphql.services.services.model.Employee;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsQuery;
import com.netflix.graphql.dgs.InputArgument;

import java.util.List;
import java.util.stream.Collectors;

@DgsComponent
public class EmployeeDataFetcher {
    @DgsQuery
    public List<Employee> employees(@InputArgument Integer departmentId) {
        if(departmentId == null) {
            return DataDto.employees;
        }
        return  DataDto.employees.stream().filter(s -> s.getDepartmentId().equals(departmentId)).collect(Collectors.toUnmodifiableList());
    }
}
