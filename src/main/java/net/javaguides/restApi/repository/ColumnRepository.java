package net.javaguides.restApi.repository;

import net.javaguides.restApi.models.Colum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
    public interface ColumnRepository extends JpaRepository<Colum , Integer> {
        Optional<Colum> findById(int id);
    }
