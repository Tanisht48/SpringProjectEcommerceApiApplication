package com.geekster.Spring.Project.Ecommerce.API.Controller;

import com.geekster.Spring.Project.Ecommerce.API.Model.Address;
import com.geekster.Spring.Project.Ecommerce.API.Model.User;
import com.geekster.Spring.Project.Ecommerce.API.Service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AddressController {

    @Autowired
    AddressService addressService;
    //Get
    @GetMapping("addresses")
    public List<Address> getAddresses()
    {
        return  addressService.getAddresses();
    }
    @GetMapping("address/{Id}")
    public Optional<Address> getAddress(@PathVariable Integer Id)
    {
        return addressService.getAddress(Id);
    }
    //Post
    @PostMapping("address")
    public String addAddress(@RequestBody Address address)
    {
        return addressService.addAddress(address);
    }
    @PostMapping("addresses")
    public String addListOfUsers(@RequestBody List<Address> address) {return addressService.addListOfUsers(address);}

    @DeleteMapping("address/{id}")
    public String deleteAddressById(@PathVariable Integer id){return addressService.deleteAddressById(id);}
}
