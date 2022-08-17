package net.javaguides.restApi.services;

import net.javaguides.restApi.models.Elevator;
import net.javaguides.restApi.repository.ElevatorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service

public class ElevatorServices {
    private ElevatorRepository elevatorRepository;
    @Autowired
    public ElevatorServices(ElevatorRepository elevatorRepository){
        this.elevatorRepository = elevatorRepository;
    }


    public List<Elevator> getAllElevator(){
        return elevatorRepository.findAll();
    }


    public Optional<Elevator> findById(int id) {
        return elevatorRepository.findById(id);
    }

}
