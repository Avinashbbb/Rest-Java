package net.javaguides.restApi.Controller;



import net.javaguides.restApi.models.Colum;
import net.javaguides.restApi.models.Customer;
import net.javaguides.restApi.services.CustomerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/customer")
    public class CustomerController {
        CustomerServices customerServices;
        @Autowired
            public CustomerController(CustomerServices customerServices){
            this.customerServices = customerServices;
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
    }
