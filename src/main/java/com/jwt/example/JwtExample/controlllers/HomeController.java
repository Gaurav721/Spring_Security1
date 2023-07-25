package com.jwt.example.JwtExample.controlllers;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.jwt.example.JwtExample.model.User;
import com.jwt.example.JwtExample.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeController {
    @Autowired
    private UserService userService;
    @GetMapping("/users")
    public List<User> getUser(){
                System.out.println("Hello world");
                return userService.getUsers();
    }
}
