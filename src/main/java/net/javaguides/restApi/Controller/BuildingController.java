package net.javaguides.restApi.Controller;

import net.javaguides.restApi.models.Battery;
import net.javaguides.restApi.models.Building;
import net.javaguides.restApi.models.Customer;
import net.javaguides.restApi.models.User;
import net.javaguides.restApi.services.BuildingServices;
import net.javaguides.restApi.services.CustomerServices;
import net.javaguides.restApi.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@RestController
@RequestMapping("/building")
    public class BuildingController {
        BuildingServices buildingServices;
        UserServices userServices;
        CustomerServices customerServices;
        @Autowired
        public BuildingController(BuildingServices buildingServices, UserServices userServices , CustomerServices customerServices){
            this.buildingServices = buildingServices;
            this.userServices = userServices;
            this.customerServices = customerServices;
        }

        @GetMapping(value = "/allbuilding")
        public List<Building> getAllBuilding(){
            return buildingServices.getAllBuilding();
        }

        @GetMapping(value = "/{id}")
        public Optional<Building> findUserById(@PathVariable("id")int id) {
            Optional<Building> bul = buildingServices.findById(id);
            return bul;
        }

        @GetMapping(value = "/buildingbattery/{id}")
        public List<Battery> findbuildingBybuilding(@PathVariable("id")int id) {
            Optional<Building> bul = buildingServices.findById(id);
            return bul.get().getBatteries();
        }

        @RequestMapping(value = "/currentuser", method = RequestMethod.GET)
        @ResponseBody

            public List<Building> currentUserName(Principal principal) {

            String usrEmail = principal.getName();
            Optional<User> usr = userServices.findByEmail(usrEmail);
            int usrid = usr.get().getId();
            List<Customer> customers = customerServices.getAllCustomer();

            List<Building> customerBuilding = null;
            for (int i = 0; i < customers.size(); i++) {
                if (Objects.equals(customers.get(i).getUserId(), Integer.toString(usrid))) {
                    System.out.println(customers.get(i).getUserId() == Integer.toString(usrid));
                    customerBuilding = customers.get(i).getBuildings();
                }
            }
            return customerBuilding;
        }


}
