package org.example.crud2.repositories;

import org.example.crud2.model.Position;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PositionRepository extends JpaRepository<Position, Long> {
}
