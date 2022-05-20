package com.auth.SimpleAuthentication.implementation;

import com.auth.SimpleAuthentication.model.UserData;
import com.auth.SimpleAuthentication.service.UserRepository;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.function.Predicate;

@Service
public class RegisterImpl {
    private final UserRepository userRepository;

    public RegisterImpl(@Lazy UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public boolean addUser(String userName, String password){
        Predicate<UserData> checkUserNames = (user -> user.getUserName().equals(userName));
        long counter = userRepository.findAll().stream().filter(checkUserNames).count();
        if(counter== 0){
            UserData userData = new UserData(userName, password);
            userRepository.save(userData);
            return true;
        }

        return false;
    }
}
