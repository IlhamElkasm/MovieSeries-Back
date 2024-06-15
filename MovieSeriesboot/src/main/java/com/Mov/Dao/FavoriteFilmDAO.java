package com.Mov.Dao;

import com.Mov.model.FavoriFilm;
import com.Mov.model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FavoriteFilmDAO extends JpaRepository<FavoriFilm, Integer> {
    List<FavoriFilm> findByUser(Utilisateur user);

}
