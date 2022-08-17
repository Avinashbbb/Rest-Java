package net.javaguides.restApi.Controller;

import net.javaguides.restApi.models.Building;
import net.javaguides.restApi.services.BuildingServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/building")
    public class BuildingController {
        BuildingServices buildingServices;
        @Autowired
        public BuildingController(BuildingServices buildingServices){ this.buildingServices = buildingServices;}

        @GetMapping(value = "/allbuilding")
        public List<Building> getAllBuilding(){
            return buildingServices.getAllBuilding();
        }

        @GetMapping(value = "/{id}")
        public Optional<Building> findUserById(@PathVariable("id")int id) {
            Optional<Building> bul = buildingServices.findById(id);
            return bul;
        }


}
