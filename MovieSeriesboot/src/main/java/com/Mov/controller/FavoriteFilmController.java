package com.Mov.controller;

import com.Mov.Services.FavoriFilmService;
import com.Mov.model.FavoriFilm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/favoriteFilm")
public class FavoriteFilmController {

        @Autowired
        private FavoriFilmService favoriFilmService;

    @PostMapping("/add")
    public FavoriFilm addFavoriteFilm(@RequestBody Map<String, Integer> payload) {
        int idUser = payload.get("idUser");
        int idFilm = payload.get("idFilm");
        return favoriFilmService.addFavoriteFilm(idUser, idFilm);
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
