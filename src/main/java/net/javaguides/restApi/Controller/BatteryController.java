package net.javaguides.restApi.Controller;

import net.javaguides.restApi.models.Battery;
import net.javaguides.restApi.models.Colum;
import net.javaguides.restApi.services.BatteryServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/battery")
    public class BatteryController {
        BatteryServices batteryServices;
        @Autowired
        public BatteryController(BatteryServices batteryServices){ this.batteryServices = batteryServices;}

        @GetMapping(value = "/allbatterys")
        public List<Battery> getAllBattery(){
            return batteryServices.getAllBattery();
        }

        @GetMapping(value = "/{id}")
        public Optional<Battery> findUserById(@PathVariable("id")int id) {
            Optional<Battery> bat = batteryServices.findById(id);
            return bat;
        }

        @GetMapping(value = "/batterycolumn/{id}")
        public List<Colum> findColumnbyBattery(@PathVariable("id")int id){
            Optional<Battery> bat = batteryServices.findById(id);
            return bat.get().getColums();
        }
    }
