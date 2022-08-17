package net.javaguides.restApi.services;

import net.javaguides.restApi.models.User;
import net.javaguides.restApi.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public abstract class UserServices {
    private  UserRepository userRepository;
    @Autowired
    public UserServices(UserRepository userRepository){
        this.userRepository = userRepository;
    }


    public List<User> getAllUser(){
        return userRepository.findAll();
    }


    public Optional<User> findById(int id) {
        return userRepository.findById(id);
    }


    public Optional<User> findByEmail(String email) {
        return userRepository.findByEmail(email);
    }
}
