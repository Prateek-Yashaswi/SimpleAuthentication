package com.auth.SimpleAuthentication.implementation;

import com.auth.SimpleAuthentication.service.UserRepository;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
public class ChangePasswordImpl {
    private final UserRepository userRepository;

    public ChangePasswordImpl(@Lazy UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public String changePassword(String userName, String oldPassword, String newPassword){
        if(userRepository.findByUserName(userName)==null)
            return "User not found";

        if(userRepository.findByUserName(userName).getPassword().equals(oldPassword)){
            int id = userRepository.findByUserName(userName).getId();
            userRepository.updatePassword(id, newPassword);
            return "Password Changed Successfully";
        }
        else
            return "Incorrect Old Password Entered";
    }
}
