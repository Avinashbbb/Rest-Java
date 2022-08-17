package net.javaguides.restApi.services;

import net.javaguides.restApi.models.Building;

import net.javaguides.restApi.repository.BuildingRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BuildingServices {
    BuildingRepository buildingRepository;
    @Autowired
    public BuildingServices(BuildingRepository buildingRepository){
        this.buildingRepository = buildingRepository;
    }
    public List<Building> getAllBuilding(){
        return buildingRepository.findAll();
    }
    public Optional<Building> findById(int id) {
        return buildingRepository.findById(id);
    }
}
