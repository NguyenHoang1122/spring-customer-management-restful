package com.springcustomermanagementrestful.controller;

import com.springcustomermanagementrestful.model.Customer;
import com.springcustomermanagementrestful.repository.ICustomerRepository;
import com.springcustomermanagementrestful.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CustomerController {
    @Autowired
    private ICustomerService iCustomerService;

    @GetMapping("/customers")
    public Iterable<Customer> findAll() {
        return iCustomerService.findAll();
    }
}
