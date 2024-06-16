package com.Mov.Services;

import com.Mov.Dao.SerierDAO;
import com.Mov.model.Film;
import com.Mov.model.Serie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SerieServiceImpl implements SerieService {

    @Autowired
    private SerierDAO serierDAO;


    @Override
    public List<Serie> getAllSerie() {
        return serierDAO.findAll();
    }

    @Override
    public Serie getSerieById(int idSerie) {
        return serierDAO.findById(idSerie).orElse(null);

    }

    @Override
    public Serie saveSerie(Serie serie) {
        return serierDAO.save(serie);
    }

    @Override
    public void deleteSerie(int idSerie) {
        serierDAO.deleteById(idSerie);
    }

    @Override
    public Serie updateSerie(int idSerie, Serie serie) {
        Optional<Serie> existingSerie = serierDAO.findById(idSerie);
        if (existingSerie.isPresent()) {
            Serie updatedSerie = existingSerie.get();
            updatedSerie.setTitre(serie.getTitre());
            updatedSerie.setDescription(serie.getDescription());
            updatedSerie.setActeurs(serie.getActeurs());
            updatedSerie.setDateDebut(serie.getDateDebut());
            updatedSerie.setDateFin(serie.getDateFin());
            return serierDAO.save(updatedSerie);
        } else {
            return null;
        }
    }
}
