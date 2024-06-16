package com.Mov.Dao;

import com.Mov.model.FavoriSirie;
import com.Mov.model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FavoriteSerieDAO extends JpaRepository<FavoriSirie, Integer> {
    List<FavoriSirie> findByUser(Utilisateur user);
}
