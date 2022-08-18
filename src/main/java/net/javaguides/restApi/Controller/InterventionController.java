package net.javaguides.restApi.Controller;

import net.javaguides.restApi.models.Intervention;
//import javax.validation.Valid;
import net.javaguides.restApi.services.InterventionNotFoundException;
import net.javaguides.restApi.services.InterventionServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

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
        @PostMapping(value= "/post")
        public Intervention addIntervention(@Validated @RequestBody Intervention intr ){
                return interventionServices.save(intr);
        }

        @DeleteMapping(value="/delete/{id}")
        public String deleteIntervention(@PathVariable("id")int id ){
            Intervention intr = interventionServices.findById(id).orElseThrow(()-> new InterventionNotFoundException("intervention with "+id+"is Not Found!"));
            interventionServices.deleteById(intr.getId());
            return "Student with ID : " +id+ " is deleted";
        }

        @PutMapping(value = "/put/{id}")
        public Intervention updateIntervention(@PathVariable("id")int id,@Validated @RequestBody Intervention newintr){
            Intervention intr = interventionServices.findById(id).orElseThrow(()-> new InterventionNotFoundException("Intervntion with "+ id + " is Not Found!"));

            intr.setBuilding_id(newintr.getBuilding_id());
            intr.setBatterie_id(newintr.getBatterie_id());
            intr.setColumn_id(newintr.getColumn_id());
            intr.setElevator_id(newintr.getElevator_id());
            intr.setReport(newintr.getReport());

            return interventionServices.save(intr);
        }
    }
