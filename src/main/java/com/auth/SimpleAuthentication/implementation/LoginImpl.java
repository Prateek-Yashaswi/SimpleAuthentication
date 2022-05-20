package com.auth.SimpleAuthentication.implementation;

import com.auth.SimpleAuthentication.model.UserData;
import com.auth.SimpleAuthentication.service.UserRepository;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
public class LoginImpl {
    private final UserRepository userRepository;

    public LoginImpl(@Lazy UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public String loginUser(String userName, String password){
        UserData userData = userRepository.findByUserName(userName);
        if(userData==null)
            return "Username Doesn't Exist";
        if(userData.getPassword().equals(password))
            return "Login Successful";
        else
            return "Incorrect Password";
    }
}
