package org.example.crud2.service;

import org.example.crud2.model.Employee;
import org.example.crud2.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Employee getEmployeeById(Long id) {
        return (Employee) employeeRepository.findById(id).orElse(null);
    }

    public Employee createEmployee(Employee employee) {
        return (Employee) employeeRepository.save(employee);
    }

    public Employee updateEmployee(Employee employee) {
        return (Employee) employeeRepository.save(employee);
    }

    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }
    public Employee getEmployeeByEmail(String email) {
        return employeeRepository.findByEmail(email);
    }

    public Employee updateEmployee(Long id, Employee employee) {
        Employee existingEmployee = (Employee) employeeRepository.findById(id).orElse(null);
        return existingEmployee;
    }
}
