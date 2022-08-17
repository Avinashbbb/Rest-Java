package net.javaguides.restApi.Controller;

import net.javaguides.restApi.models.User;
import net.javaguides.restApi.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")

public class UserController {


    UserServices userServices;
//    @Autowired
    public UserController(UserServices userServices){
        this.userServices = userServices;
    }
//    @GetMapping(value = "/allusers")
//    public List<User> getAllUsers(){
//        return userServices.getAllUser();
//    }


}
