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
@RequestMapping("/moderator")
public class ModeratorController {

    @Autowired
    private userService UserService;

    @GetMapping()
    public String getUser(){
        System.out.println("Hello moderator");
        return "Hello moderator";
    }

    @GetMapping("/current-moderator")
    public String getLoggedInUser(Principal principal){
        return principal.getName();
    }
}

// http://localhost:8081/admin/user