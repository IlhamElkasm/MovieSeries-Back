package com.Mov.controller;

import com.Mov.Services.FavoriFilmService;
import com.Mov.model.FavoriFilm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/favoriteFilm")
public class FavoriteFilmController {

        @Autowired
        private FavoriFilmService favoriFilmService;

        @PostMapping("/add")
        public FavoriFilm addFavoriteFilm(@RequestParam int userId, @RequestParam int filmId) {
            return favoriFilmService.addFavoriteFilm(userId, filmId);
        }

        @GetMapping("/user/{userId}")
        public List<FavoriFilm> getFavoriteFilmsByUser(@PathVariable int userId) {
            return favoriFilmService.getFavoriteFilmsByUser(userId);
        }
    @GetMapping
    public List<FavoriFilm> getAllFavoriteFilm() {
        return favoriFilmService.getAllFavoriteFilm();
    }


}
