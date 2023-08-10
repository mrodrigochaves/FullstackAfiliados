package com.mrodrigochaves.backend.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mrodrigochaves.backend.model.Users;
import com.mrodrigochaves.backend.service.UsersService;

@RestController
@RequestMapping("/users")
public class UsersController {

    private final UsersService usersService;

    public UsersController(UsersService usersService){
        this.usersService = usersService;
    }
    
    @GetMapping("/users/all")
    public List<Users> getAllUsers(){
        return usersService.getAll();
            
    }

    @PostMapping("/users/create") 
    public Users createUser(@RequestBody Users users) {
        return usersService.createUser(users);
    }
}
