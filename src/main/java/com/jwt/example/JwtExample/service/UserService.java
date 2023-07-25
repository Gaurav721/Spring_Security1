package com.jwt.example.JwtExample.service;

import com.jwt.example.JwtExample.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    public UserService() {
        store.add(new User(UUID.randomUUID().toString(),"Gaurav","gaurav@123"));
        store.add(new User(UUID.randomUUID().toString(),"chintan","chint@123"));
        store.add(new User(UUID.randomUUID().toString(),"Himanshu","him@123"));
    }

    private List<User> store=new ArrayList<>();

    public List<User> getUsers(){
        return this.store;
    }
}
