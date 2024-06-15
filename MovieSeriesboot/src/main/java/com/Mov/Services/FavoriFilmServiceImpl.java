package com.Mov.Services;

import com.Mov.Dao.FavoriteFilmDAO;
import com.Mov.Dao.FilmDAO;
import com.Mov.Dao.UserDAO;
import com.Mov.model.FavoriFilm;
import com.Mov.model.Film;
import com.Mov.model.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FavoriFilmServiceImpl implements FavoriFilmService {

    @Autowired
    private FavoriteFilmDAO favoriteFilmDAO;
    @Autowired
    private FilmDAO filmDAO;
    @Autowired
    private UserDAO userDAO;

    @Override
    public FavoriFilm addFavoriteFilm(int idUser, int idFilm) {
        Utilisateur user = userDAO.findById(idUser).orElseThrow(() -> new RuntimeException("User not found"));
        Film film = filmDAO.findById(idFilm).orElseThrow(() -> new RuntimeException("Film not found"));

        FavoriFilm favoriFilm = new FavoriFilm();
        favoriFilm.setUser(user);
        favoriFilm.setFilms(film);

        return favoriteFilmDAO.save(favoriFilm);
    }

    @Override
    public List<FavoriFilm> getFavoriteFilmsByUser(int idUser) {
        Utilisateur user = userDAO.findById(idUser)
                .orElseThrow(() -> new RuntimeException("User not found"));
        return favoriteFilmDAO.findByUser(user);
    }

    @Override
    public List<FavoriFilm> getAllFavoriteFilm() {
        return favoriteFilmDAO.findAll();
    }
}
