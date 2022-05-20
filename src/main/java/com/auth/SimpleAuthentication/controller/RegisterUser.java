package com.auth.SimpleAuthentication.controller;

import com.auth.SimpleAuthentication.implementation.RegisterImpl;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class RegisterUser {
    private final RegisterImpl register;
    @PutMapping("/register")
    public String registerUser(@RequestParam String userName,
                               @RequestParam String password){
        if(register.addUser(userName,password))
            return "Registration Successful";
        return "Username Already Exists";
    }
}
