package com.Mov.Services;

import com.Mov.model.Film;

import java.util.List;

public interface FilmService {

    List<Film> getAllMovies();
    Film getMovieById(int idFilm);
    Film saveMovie(Film film);
    void deleteMovie(int idFilm);
    public Film updateMovie(int idFilm, Film film);
}
