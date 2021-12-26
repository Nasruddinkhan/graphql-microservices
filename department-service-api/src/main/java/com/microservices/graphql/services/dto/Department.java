package com.microservices.graphql.services.dto;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private Long id;
    private Integer organizationId;
    private String name;
    private List<Employee> employees = new ArrayList<>();

    public Department() {

    }

    public Department(Integer organizationId, String name) {
        super();
        this.organizationId = organizationId;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(Integer organizationId) {
        this.organizationId = organizationId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "Department [id=" + id + ", organizationId=" + organizationId + ", name=" + name + "]";
    }
}
