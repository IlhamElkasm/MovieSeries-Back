package com.Mov.Dao;

import com.Mov.model.FavoriSirie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FavoriteSerieDAO extends JpaRepository<FavoriSirie, Integer> {
}
