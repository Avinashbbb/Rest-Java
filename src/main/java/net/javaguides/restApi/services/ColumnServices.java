package net.javaguides.restApi.services;

import net.javaguides.restApi.models.Colum;
import net.javaguides.restApi.repository.ColumnRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ColumnServices {
    ColumnRepository columnRepository;
    @Autowired
    public ColumnServices(ColumnRepository columnRepository){
        this.columnRepository = columnRepository;
    }
    public List<Colum> getAllColumn(){
        return columnRepository.findAll();
    }
    public Optional<Colum> findById(int id) {
        return columnRepository.findById(id);
    }
}
