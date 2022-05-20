package com.auth.SimpleAuthentication.controller;

import com.auth.SimpleAuthentication.implementation.ChangePasswordImpl;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class ChangePassword {
    private final ChangePasswordImpl changePassword;

    @PutMapping("/changePassword")
    public String changePassword(@RequestParam String userName,
                                 @RequestParam String oldPassword,
                                 @RequestParam String newPassword){
        return changePassword.changePassword(userName,oldPassword,newPassword);
    }
}
