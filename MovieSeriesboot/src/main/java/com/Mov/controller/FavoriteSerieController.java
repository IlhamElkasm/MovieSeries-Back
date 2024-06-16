package com.Mov.controller;

import com.Mov.Services.FavoriSerieService;
import com.Mov.model.FavoriSirie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/FavoriteSerie")
public class FavoriteSerieController {

    @Autowired
    private FavoriSerieService favoriSerieService;

    @PostMapping("/add")
    public FavoriSirie addFavoriteSirie(@RequestBody Map<String, Integer> payload) {
        int idUser = payload.get("idUser");
        int idSirie = payload.get("idSirie");
        return favoriSerieService.addFavoriteSirie(idUser,idSirie);
    }

    @GetMapping("/user/{userId}")
    public List<FavoriSirie> getFavoriteFilmsByUser(@PathVariable int userId) {
        return favoriSerieService.getFavoriteSerieByUser(userId);
    }
    @GetMapping
    public List<FavoriSirie> getAllFavoriteSerie() {
        return favoriSerieService.getAllFavoriteSerie();
    }
}
