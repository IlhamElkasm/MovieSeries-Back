package com.Mov.controller;

import com.Mov.Dao.FilmDAO;
import com.Mov.model.Film;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Films")
public class FilmController {

    @Autowired
    private FilmDAO filmDAO;

    @GetMapping
    public List<Film> getAllFilms(){
        return filmDAO.findAll();
    }

    @PostMapping
    public Film createFilm(@RequestBody Film films){
        return filmDAO.save(films);
    }


}
