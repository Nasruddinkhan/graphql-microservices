package com.microservices.graphql.services.fetcher;

import com.microservices.graphql.services.dto.Department;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsQuery;

import javax.xml.crypto.Data;
import java.util.List;
import java.util.stream.Collectors;

@DgsComponent
public class DepartmentDataFetcher {

    @DgsQuery
    public List<Department> departmentByOrganizationId(Integer organizationId){
        System.out.println("organizationId = " + organizationId);
      List<Department> departments =  DataDto.departments.stream()
                .filter(department -> department.getOrganizationId().equals(organizationId)).collect(Collectors.toList());
        System.out.println("departments.size() = " + departments.size()); 
      return departments;
    }
}
