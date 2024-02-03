package com.poc.springkubedockerapp.controller;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.poc.springkubedockerapp.dto.User;
@RestController
public class Controller {

    @GetMapping("/users")
    public String getUser(){
        User user = new User("dev", "admin");
        return user.name();
    }
}
