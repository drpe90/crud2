package org.example.crud2.repositories;

import org.example.crud2.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    Employee findByEmail(String email);
}
