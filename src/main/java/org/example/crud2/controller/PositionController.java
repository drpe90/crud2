package org.example.crud2.controller;

import org.example.crud2.model.Position;
import org.example.crud2.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class PositionController {
    @Autowired
    private PositionService positionService;

    @GetMapping("/positions")
    public List<Position> getAllPositions() {
        return positionService.getAllPositions();
    }

    @GetMapping("/positions/{id}")
    public Position getPositionById(@PathVariable Long id) {
        return positionService.getPositionById(id);
    }

    @PostMapping("/positions")
    public Position createPosition(@RequestBody Position position) {
        return positionService.createPosition(position);
    }

    @PutMapping("/positions/{id}")
    public Position updatePosition(@PathVariable Long id, @RequestBody Position position) {
        return positionService.updatePosition(id, position);
    }

    @DeleteMapping("/positions/{id}")
    public void deletePosition(@PathVariable Long id) {
        positionService.deletePosition(id);
    }
}
