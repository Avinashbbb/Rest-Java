package net.javaguides.restApi.Controller;

import net.javaguides.restApi.models.Elevator;
import net.javaguides.restApi.models.User;
import net.javaguides.restApi.services.ElevatorServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/elevator")


public class ElevatorController {
    ElevatorServices elevatorServices;
    @Autowired
    public ElevatorController(ElevatorServices elevatorServices){
        this.elevatorServices = elevatorServices;
    }

    @GetMapping(value = "/allelevators")
    public List<Elevator> getAllElevator(){
        return elevatorServices.getAllElevator();
    }

    @GetMapping(value = "/{id}")
    public Optional<Elevator> findUserById(@PathVariable("id")int id){
        Optional<Elevator> ele = elevatorServices.findById(id);
        return ele;
    }

}
