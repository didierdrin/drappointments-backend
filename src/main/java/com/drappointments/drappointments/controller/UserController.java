package com.drappointments.drappointments.controller;

import com.drappointments.drappointments.model.User;
import com.drappointments.drappointments.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;  // Changed from UserService to userService

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUser();  // Changed method name to match the service
    }

    @PostMapping
    public User addUser(@RequestBody User user) {
        return userService.addUser(user);
    }
}