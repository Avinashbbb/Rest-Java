package net.javaguides.restApi.Controller;

import net.javaguides.restApi.models.User;
import net.javaguides.restApi.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")

public class UserController {


    UserServices userServices;
    @Autowired
    public UserController(UserServices userServices){
        this.userServices = userServices;
    }
    @GetMapping(value = "/allusers")
    public List<User> getAllUsers(){
        return userServices.getAllUser();
    }

    @GetMapping(value = "/{id}")
    public Optional<User> findUserById(@PathVariable("id")int id){
        Optional<User> usr = userServices.findById(id);
        return usr;
    }


}
