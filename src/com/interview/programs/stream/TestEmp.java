package com.interview.programs.stream;

import java.util.*;

import java.util.stream.Collectors;

class Employee{
    int empId;
    String empName;
    String dept;
    long salary;

    public Employee(int empId, String empName, String dept, long salary) {
        this.empName = empName;
        this.empId = empId;
        this.dept=dept;
        this.salary=salary;

    }

    public int getEmpId() {
        return empId;
    }

    public String getDept() {
        return dept;
    }

    public String getEmpName() {
        return empName;
    }

    public long getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                '}';
    }
}

public class TestEmp {
    public static void main(String[] args) {

        List<Employee> employeesList = Arrays.asList(
                new Employee(102, "Suraj","HR",10000),
                new Employee(105, "Raju","HR",100000),
                new Employee(101, "Sagar","IT",20000),
                new Employee(104, "Ashwini","IT",25000),
                new Employee(103, "Santosh","Finance",50000));

       /*Map<String, Optional<Employee>> highestPaid =  employeesList.stream()
                       .collect(Collectors.groupingBy(Employee::getDept, Collectors.maxBy(Comparator.comparing(Employee::getSalary))));*/

       /* Map<String,List<String>> map = employeesList.stream().collect(Collectors.groupingBy(Employee::getDept, Collectors.mapping(Employee::getEmpName, Collectors.toList())));*/

        Map<String,List<Employee>> highestEarningDepartment = employeesList.stream().collect(Collectors.groupingBy(Employee::getDept, Collectors.filtering(e->e.getSalary()>20000, Collectors.toList())));

        System.out.println(highestEarningDepartment);

        //System.out.println(map);
       /* map.forEach((dept, employee)->
                System.out.println(
                        dept + " -> " +
                                employee.map(e -> e.getEmpName() + " : " + e.getSalary())
                                        .orElse("No employee")))    ;*/

    }
}

