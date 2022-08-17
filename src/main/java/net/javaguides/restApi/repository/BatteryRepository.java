package net.javaguides.restApi.repository;

import net.javaguides.restApi.models.Battery;
import net.javaguides.restApi.models.Building;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
    public interface BatteryRepository extends JpaRepository<Battery, Integer> {
        Optional<Battery> findById(int id);
    }
