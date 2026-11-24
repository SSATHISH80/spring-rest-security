package com.satz.springrestsecurity.controller;

import com.satz.springrestsecurity.model.Customer;
import com.satz.springrestsecurity.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class HomeController {

    @Autowired
    CustomerService customerService;

    @RequestMapping(method = RequestMethod.GET)
    public String homePage() {

return  "Hello this home pageRequestMapping";
    }

    @PostMapping("/register")
    public void addUser(@RequestBody Customer user) {
customerService.save(user);

    }
}
