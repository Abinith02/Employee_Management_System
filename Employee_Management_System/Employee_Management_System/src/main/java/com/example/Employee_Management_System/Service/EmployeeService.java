package com.example.Employee_Management_System.Service;

import com.example.Employee_Management_System.Model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getByEmployees();

    void saveEmployee(Employee employee);
    Employee getEmployeeById(long id);
    void deleteEmployeeById(long id);
}
