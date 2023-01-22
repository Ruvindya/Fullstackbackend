package com.codewithRuvi.Fullstackbackend.controller;

import com.codewithRuvi.Fullstackbackend.model.User;
import com.codewithRuvi.Fullstackbackend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping("/User")
    User newUser(@RequestBody User newUser){
        return userRepository.save(newUser);

    }
}
