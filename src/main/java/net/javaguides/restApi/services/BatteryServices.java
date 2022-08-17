package net.javaguides.restApi.services;

import net.javaguides.restApi.models.Battery;
import net.javaguides.restApi.repository.BatteryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
    public class BatteryServices {
        BatteryRepository batteryRepository;
        @Autowired
        public BatteryServices(BatteryRepository batteryRepository){
            this.batteryRepository = batteryRepository;
        }
            public List<Battery> getAllBattery(){return batteryRepository.findAll();}
            public Optional<Battery> findById(int id) {
        return batteryRepository.findById(id);
    }
    }

