package com.Mov.Services;

import com.Mov.Dao.FavoriteSerieDAO;
import com.Mov.Dao.SerierDAO;
import com.Mov.Dao.UserDAO;
import com.Mov.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FavoriSerieServiceImpl  implements FavoriSerieService{

    @Autowired
    private FavoriteSerieDAO favoriteSerieDAO;
    @Autowired
    private SerierDAO serierDAO;
    @Autowired
    private UserDAO userDAO;

    @Override
    public FavoriSirie addFavoriteSirie(int idUser, int idSirie) {
        Utilisateur user = userDAO.findById(idUser).orElseThrow(() -> new RuntimeException("User not found"));
        Serie serie = serierDAO.findById(idSirie).orElseThrow(() -> new RuntimeException("Film not found"));

        FavoriSirie favoriSirie = new FavoriSirie();
        favoriSirie.setUser(user);
        favoriSirie.setSeries(serie);

        return favoriteSerieDAO.save(favoriSirie);
    }

    @Override
    public List<FavoriSirie> getFavoriteSerieByUser(int idUser) {
        Utilisateur user = userDAO.findById(idUser)
                .orElseThrow(() -> new RuntimeException("User not found"));
        return favoriteSerieDAO.findByUser(user);
    }

    @Override
    public List<FavoriSirie> getAllFavoriteSerie() {
        return favoriteSerieDAO.findAll();
    }
}
