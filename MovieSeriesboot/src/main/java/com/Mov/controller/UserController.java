package com.Mov.controller;

import com.Mov.Dao.UserDAO;
import com.Mov.Services.UserService;
import com.Mov.model.Film;

import com.Mov.model.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<Utilisateur> getAllUser(){
        return userService.getAllUser();
    }

    @PostMapping
    public Utilisateur AddUser(@RequestBody Utilisateur user){
        return userService.saveUser(user);
    }
}
