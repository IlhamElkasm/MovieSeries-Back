package com.Mov.Services;

import com.Mov.model.Film;

import java.util.List;

public interface FilmService {

    List<Film> getAllMovies();
    Film getMovieById(int id);
    Film saveMovie(Film film);
    void deleteMovie(int id);
    public Film updateMovie(int id, Film film);
}
