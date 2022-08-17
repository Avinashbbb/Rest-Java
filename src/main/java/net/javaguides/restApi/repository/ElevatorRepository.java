package net.javaguides.restApi.repository;

import net.javaguides.restApi.models.Elevator;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
    public interface ElevatorRepository extends JpaRepository<Elevator, Integer> {
        Optional<Elevator> findById(int id);
    }

