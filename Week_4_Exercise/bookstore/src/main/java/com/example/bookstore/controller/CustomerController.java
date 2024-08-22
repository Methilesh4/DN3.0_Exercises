package com.example.bookstore.controller;

import com.example.bookstore.model.Customer;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @PostMapping
    public Customer createCustomer(@RequestBody Customer customer) {
        // Implementation here
    }

    @PostMapping("/register")
    public String registerCustomer(@RequestParam String name, @RequestParam String email) {
        // Implementation here
    }
}
