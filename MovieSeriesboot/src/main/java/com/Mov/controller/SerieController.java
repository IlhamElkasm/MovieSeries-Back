package com.Mov.controller;


import com.Mov.Services.SerieService;
import com.Mov.model.Film;
import com.Mov.model.Serie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/serie")
public class SerieController {

    @Autowired
    private SerieService serieService;

    @GetMapping
    public List<Serie> getAllSerie() {
        return serieService.getAllSerie();
    }

    @GetMapping("/{idSerie}")
    public Serie getSerieById(@PathVariable int idSerie) {
        return serieService.getSerieById(idSerie);
    }

    @PostMapping
    public Serie saveSerie(@RequestBody Serie serie) {
        return serieService.saveSerie(serie);
    }


    @DeleteMapping("/{idSerie}")
    public void deleteSerie(@PathVariable int idSerie) {
        serieService.deleteSerie(idSerie);
    }


    @PutMapping("/{idSerie}")
    public Serie updateSerie(@PathVariable int idSerie, @RequestBody Serie serie) {
        return serieService.updateSerie(idSerie,serie);
    }
}
