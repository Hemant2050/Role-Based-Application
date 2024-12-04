package com.RBAC.services;
import java.util.*;
import org.springframework.stereotype.Service;

import com.RBAC.models.User;

@Service
public class userService {
    private List<User> store = new ArrayList<>();

    public userService(){
        store.add(new User(UUID.randomUUID().toString(), "Hemant Jadhav", "hemant@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(), "Anushka Saksena", "anushka@gamil.com"));
        store.add(new User(UUID.randomUUID().toString(), "Mrunal Thakur", "mrunal@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(), "Saket Shinde", "saket@gmail.com"));
    }

    public List<User> getUser(){
        return this.store;
    }

}
