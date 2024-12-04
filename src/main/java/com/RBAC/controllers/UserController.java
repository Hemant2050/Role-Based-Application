package com.RBAC.controllers;

import com.RBAC.models.User;
import com.RBAC.services.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.web.exchanges.HttpExchange.Principal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private userService UserService;

    @GetMapping()
    public String getUser(){
        System.out.println("Hello User");
        return "Hello User";
    }

    @GetMapping("/current-user")
    public String getLoggedInUser(Principal principal){
        return principal.getName();
    }
}

// http://localhost:8081/admin/user