package com.Mov.controller;

import com.Mov.Dao.FilmDAO;
import com.Mov.Services.FilmServiceImpl;
import com.Mov.model.Film;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Films")
public class FilmController {

        @Autowired
        private FilmServiceImpl filmService;

        @GetMapping
        public List<Film> getAllMovies() {
            return filmService.getAllMovies();
        }

        @GetMapping("/{id}")
        public Film getMovieById(@PathVariable int id) {
            return filmService.getMovieById(id);
        }

        @PostMapping
        public Film saveMovie(@RequestBody Film movie) {
            return filmService.saveMovie(movie);
        }


        @DeleteMapping("/{id}")
        public void deleteMovie(@PathVariable int id) {
            filmService.deleteMovie(id);
        }


    @PutMapping("/{id}")
    public Film updateMovie(@PathVariable int id, @RequestBody Film film) {
        return filmService.updateMovie(id, film);
    }
}
