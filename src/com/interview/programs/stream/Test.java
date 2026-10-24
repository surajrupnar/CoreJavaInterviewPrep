package com.interview.programs.stream;

import java.util.*;

import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import java.util.stream.Collectors;

class Employee {
    private int id;
    private String name;
    private String department;

    public Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Employee{id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}

public class Test {
    public static void main(String[] args) {

    List<Employee> employees = Arrays.asList(
            new Employee(1, "Rahul", "IT"),
            new Employee(2, "Priya", "HR"),
            new Employee(3, "Amit", "IT"),
            new Employee(4, "Sneha", "Finance"),
            new Employee(5, "Vijay", "HR"),
            new Employee(6, "Neha", "IT")
    );

    Map<String, List<Employee>> employeeList = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));

        employeeList.forEach((department, employeesList)->{
            System.out.println(department+" "+employeesList);
        });

        List<Employee> itEmployee = employeeList.get("IT");
        System.out.println("IT EMPLOYEE" +itEmployee);


    }
}
