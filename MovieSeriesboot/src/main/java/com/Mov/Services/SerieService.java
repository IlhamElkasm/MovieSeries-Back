package com.Mov.Services;

import com.Mov.model.Film;
import com.Mov.model.Serie;

import java.util.List;

public interface SerieService {

    List<Serie> getAllSerie();
    Serie getSerieById(int idSerie);
    Serie saveSerie(Serie serie);
    void deleteSerie(int idSerie);
    public Serie updateSerie(int idSerie, Serie serie);
}
