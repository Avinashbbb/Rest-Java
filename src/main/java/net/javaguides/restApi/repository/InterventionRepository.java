package net.javaguides.restApi.repository;

import net.javaguides.restApi.models.Elevator;
import net.javaguides.restApi.models.Intervention;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
    public interface InterventionRepository extends JpaRepository<Intervention, Integer> {
    Optional<Intervention> findById(int id);
    }
