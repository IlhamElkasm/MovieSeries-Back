package com.Mov.Services;

import com.Mov.model.FavoriFilm;
import com.Mov.model.FavoriSirie;

import java.util.List;

public interface FavoriSerieService {

    FavoriSirie addFavoriteSirie(int idUser, int idSirie);
    List<FavoriSirie> getFavoriteSerieByUser(int idUser);

    List<FavoriSirie> getAllFavoriteSerie();
}
