package com.Mov.Services;

import com.Mov.Dao.FilmDAO;
import com.Mov.model.Film;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FilmServiceImpl implements  FilmService{

    @Autowired
    private FilmDAO filmDAO;
    @Override
    public List<Film> getAllMovies() {
        return filmDAO.findAll();
    }

    @Override
    public Film getMovieById(int idFilm) {
        return filmDAO.findById(idFilm).orElse(null);
    }

    @Override
    public Film saveMovie(Film film) {
        return filmDAO.save(film);
    }

    @Override
    public void deleteMovie(int idFilm) {
        filmDAO.deleteById(idFilm);
    }


    @Override
    public Film updateMovie(int idFilm, Film film) {
        Optional<Film> existingMovie = filmDAO.findById(idFilm);
        if (existingMovie.isPresent()) {
            Film updatedMovie = existingMovie.get();
            updatedMovie.setTitre(film.getTitre());
            updatedMovie.setDateSortie(film.getDateSortie());
            updatedMovie.setActeurs(film.getActeurs());
            updatedMovie.setDateSortie(film.getDateSortie());
            updatedMovie.setNote(film.getNote());
            return filmDAO.save(updatedMovie);
        } else {
            return null;
        }
    }
}
