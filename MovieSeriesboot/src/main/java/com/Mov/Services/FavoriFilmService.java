package com.Mov.Services;

import com.Mov.model.FavoriFilm;
import com.Mov.model.Utilisateur;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface FavoriFilmService {
   FavoriFilm addFavoriteFilm(int idUser, int idFilm);
   List<FavoriFilm> getFavoriteFilmsByUser(int idUser);
   List<FavoriFilm> getAllFavoriteFilm();

}
