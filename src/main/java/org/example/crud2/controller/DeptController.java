package org.example.crud2.controller;

import org.example.crud2.model.Dept;
import org.example.crud2.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class DeptController {
    @Autowired
    private DeptService deptService;

    @GetMapping("/depts")
    public ResponseEntity<List<Dept>> getAllDepts() {
        List<Dept> depts = deptService.getAllDepts();
        return ResponseEntity.ok(depts);
    }

    @GetMapping("/depts/{id}")
    public ResponseEntity<Dept> getDeptById(@PathVariable Long id) {
        Dept dept = deptService.getDeptById(id);
        return ResponseEntity.ok(dept);
    }

    @PostMapping("/depts")
    public ResponseEntity<Dept> createDept(@RequestBody Dept dept) {
        Dept createdDept = deptService.createDept(dept);
        return ResponseEntity.created(null).body(createdDept);
    }

    @PutMapping("/depts")
    public ResponseEntity<Dept> updateDept(@RequestBody Dept dept) {
        Dept updatedDept = deptService.updateDept(dept);
        return ResponseEntity.ok(updatedDept);
    }

    @DeleteMapping("/depts/{id}")
    public ResponseEntity<Void> deleteDept(@PathVariable Long id) {
        deptService.deleteDept(id);
        return ResponseEntity.noContent().build();
    }
}
