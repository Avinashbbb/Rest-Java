package net.javaguides.restApi.services;

import net.javaguides.restApi.models.Intervention;
import net.javaguides.restApi.repository.InterventionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
    public class InterventionServices {
    private InterventionRepository interventionRepository;

    @Autowired
    public InterventionServices(InterventionRepository interventionRepository) {
        this.interventionRepository = interventionRepository;
    }

    public List<Intervention> getAllIntervention() {
        return interventionRepository.findAll();
    }

    public Optional<Intervention> findById(int id) {
        return interventionRepository.findById(id);
    }


    public Intervention save(Intervention intr) {
        return interventionRepository.save(intr);
    }

    public void deleteById(int id){
        interventionRepository.deleteById(id);
    }
}
