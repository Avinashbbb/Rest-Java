package net.javaguides.restApi.Controller;

import net.javaguides.restApi.models.Intervention;
import net.javaguides.restApi.services.ElevatorServices;
import net.javaguides.restApi.services.InterventionServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/intervention")
    public class InterventionController {
        InterventionServices interventionServices;
        @Autowired
        public InterventionController(InterventionServices interventionServices){
            this.interventionServices = interventionServices;
        }
        @GetMapping(value = "/allintervntions")
        public List<Intervention> getAllElevator(){ return interventionServices.getAllIntervention();}

        @GetMapping(value = "/{id}")
        public Optional<Intervention> findUserById(@PathVariable("id")int id){
            Optional<Intervention> inte = interventionServices.findById(id);
            return inte;
        }
    }
