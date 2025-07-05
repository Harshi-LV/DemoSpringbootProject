package net.javaguides.springboot.service;

import net.javaguides.springboot.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    Employee createEmployee(Employee employee);
    Employee getEmployeeById(long id);
    Employee updateEmployee(long id, Employee employeeDetails);
    void deleteEmployee(long id);
}

