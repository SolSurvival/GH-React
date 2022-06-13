package com.suzy.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.suzy.entity.User;
import com.suzy.repo.*;

@Service
public class UserService {

    @Autowired
    UserRepo userRepo;

    public User saveUser(User user){
        userRepo.save(user);

        return userRepo.save(user);
    }

    public User signInUser(String email, String pass){
        User user = userRepo.findByTheEmailAndPassword(email, pass);
        return user;
    }


}