package com.ytc.controller;

import com.ytc.model.User;
import com.ytc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("login")
    public User login(@RequestBody User user){
        User u = userService.login(user);
        System.out.println(u);
        return u;
    }
}
