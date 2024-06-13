package com.Mov.Dao;

import com.Mov.model.Film;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmDAO extends JpaRepository<Film, Integer> {
}
