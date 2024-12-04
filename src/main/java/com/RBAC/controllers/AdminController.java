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
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private userService UserService;


    @GetMapping()
    public String getAdmin(){
        System.out.println("Hello Admin");
        return "Hello Admin";
    }

    @GetMapping("/current-admin")
    public String getLoggedInUser(Principal principal){
        return principal.getName();
    }
}

// http://localhost:8081/admin/user