package net.javaguides.restApi.Controller;



import net.javaguides.restApi.models.Building;
import net.javaguides.restApi.models.Colum;
import net.javaguides.restApi.models.Customer;
import net.javaguides.restApi.models.User;
import net.javaguides.restApi.services.CustomerServices;
import net.javaguides.restApi.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@RestController
@RequestMapping("/customer")
    public class CustomerController {
        CustomerServices customerServices;
        UserServices userServices;
        @Autowired
            public CustomerController(CustomerServices customerServices,UserServices userServices){
            this.customerServices = customerServices;
            this.userServices = userServices;
        }

        @GetMapping(value = "/allcustomers")
            public List<Customer> getAllCustomer(){
            return customerServices.getAllCustomer();
        }
        @GetMapping(value = "/{id}")
            public Optional<Customer> findUserById(@PathVariable("id")int id){
                Optional<Customer> cus = customerServices.findById(id);
                return cus;
            }

        @PostMapping(value="/post")
        public Customer addCustomer(@Validated @RequestBody Customer cus){
            return customerServices.save(cus);
        }

        @RequestMapping(value = "/currentuser",method = RequestMethod.GET)
        @ResponseBody
        public Customer currentCustomer(Principal principal){
            String usrEmail = principal.getName();
            Optional<User> usr = userServices.findByEmail(usrEmail);
            int usrid = usr.get().getId();
            List<Customer> customers = customerServices.getAllCustomer();
            Customer customer = null;
            for (int i = 0; i < customers.size(); i++) {
                if (Objects.equals(customers.get(i).getUserId(), Integer.toString(usrid))) {

                    customer = customers.get(i);
                }
            }
            return customer;
        }
    }
