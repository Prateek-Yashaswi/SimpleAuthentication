package com.auth.SimpleAuthentication.controller;

import com.auth.SimpleAuthentication.implementation.LoginImpl;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class LoginUser {
    private final LoginImpl login;
    @GetMapping("/login")
    public String loginUser(@RequestParam String userName,
                            @RequestParam String password){
        return login.loginUser(userName,password);
    }
}
