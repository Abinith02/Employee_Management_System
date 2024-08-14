package com.example.Employee_Management_System.Service;

import com.example.Employee_Management_System.Model.Employee;
import com.example.Employee_Management_System.Repo.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getByEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public void saveEmployee(Employee employee) {
        this.employeeRepository.save(employee);
    }

    @Override
    public Employee getEmployeeById(long id) {
        Optional<Employee> optional= employeeRepository.findById(id);
        Employee employee=null;
        if(optional.isPresent()){
            employee=optional.get();
        }else{
            throw new RuntimeException("Employee Not Found For Id ::" +id);
        }
        return employee;
    }

    @Override
    public void deleteEmployeeById(long id) {
        this.employeeRepository.deleteById(id);
    }

}
