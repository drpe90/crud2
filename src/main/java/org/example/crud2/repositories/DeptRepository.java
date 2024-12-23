package org.example.crud2.repositories;

import org.example.crud2.model.Dept;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeptRepository extends JpaRepository<Dept, Long> {
}
