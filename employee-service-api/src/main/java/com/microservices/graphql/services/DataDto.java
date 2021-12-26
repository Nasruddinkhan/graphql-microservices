package com.microservices.graphql.services;

import com.microservices.graphql.services.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class DataDto {
    private DataDto(){}
    public static List<Employee> employees = new ArrayList<>();

    static {
        employees.add(new Employee(1L, 1L, "John Smith", 34, "Analyst", 3000));
        employees.add(new Employee(1L, 1L, "Darren Hamilton", 37, "Manager", 5000));
        employees.add(new Employee(1L, 1L, "Tom Scott", 26, "Developer", 4500));
        employees.add(new Employee(1L, 2L, "Anna London", 39, "Analyst", 2500));
        employees.add(new Employee(1L, 2L, "Patrick Dempsey", 27, "Developer", 5000));
        employees.add(new Employee(2L, 3L, "Kevin Price", 38, "Developer", 6000));
        employees.add(new Employee(2L, 3L, "Ian Scott", 34, "Developer", 4500));
        employees.add(new Employee(2L, 3L, "Andrew Campton", 30, "Manager", 8000));
        employees.add(new Employee(2L, 4L, "Steve Franklin", 25, "Developer", 4000));
        employees.add(new Employee(2L, 4L, "Elisabeth Smith", 30, "Developer", 4000));
    }
}
