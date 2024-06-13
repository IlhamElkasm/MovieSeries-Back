package com.Mov.controller;

import com.Mov.Dao.UserDAO;
import com.Mov.model.Film;
import com.Mov.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserDAO userDAO;

    @GetMapping
    public List<User> getAllFilms(){
        return userDAO.findAll();
    }

    @PostMapping
    public User createFilm(@RequestBody User user){
        return userDAO.save(user);
    }
}
