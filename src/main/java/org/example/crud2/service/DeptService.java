package org.example.crud2.service;

import org.example.crud2.model.Dept;
import org.example.crud2.repositories.DeptRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptService {
    @Autowired
    private DeptRepository deptRepository;

    public List<Dept> getAllDepts() {
        return deptRepository.findAll();
    }

    public Dept getDeptById(Long id) {
        return deptRepository.findById(id).orElse(null);
    }

    public Dept createDept(Dept dept) {
        return deptRepository.save(dept);
    }

    public Dept updateDept(Dept dept) {
        return deptRepository.save(dept);
    }

    public void deleteDept(Long id) {
        deptRepository.deleteById(id);
    }
}
