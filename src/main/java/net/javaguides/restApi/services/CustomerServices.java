package net.javaguides.restApi.services;

import net.javaguides.restApi.models.Customer;
import net.javaguides.restApi.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
    public class CustomerServices {
        CustomerRepository customerRepository;
        @Autowired
        public CustomerServices(CustomerRepository customerRepository){this.customerRepository = customerRepository;}
        public List<Customer> getAllCustomer(){
        return customerRepository.findAll();
    }

        public Optional<Customer> findById(int id) {
        return customerRepository.findById(id);
    }

        public Customer save(Customer cus) { return customerRepository.save(cus);}



    }
