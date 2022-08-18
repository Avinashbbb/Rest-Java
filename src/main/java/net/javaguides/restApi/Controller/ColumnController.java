package net.javaguides.restApi.Controller;

import net.javaguides.restApi.models.Colum;
import net.javaguides.restApi.models.Elevator;
import net.javaguides.restApi.services.ColumnServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/column")
public class ColumnController {
    ColumnServices columnServices;
    @Autowired
    public ColumnController(ColumnServices columnServices){
        this.columnServices = columnServices;
    }

    @GetMapping(value = "/allcolumns")
    public List<Colum> getAllColumn(){
        return columnServices.getAllColumn();
    }

    @GetMapping(value = "/{id}")
    public Optional<Colum> findUserById(@PathVariable("id")int id){
        Optional<Colum> col = columnServices.findById(id);
        return col;
    }

    @GetMapping(value = "/columnelevator/{id}")
    public List<Elevator> findElevatorbyColumn(@PathVariable("id")int id){
        Optional<Colum> col = columnServices.findById(id);
        return col.get().getElevators();
    }

}
