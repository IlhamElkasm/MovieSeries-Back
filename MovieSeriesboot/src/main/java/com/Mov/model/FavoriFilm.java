package com.Mov.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FavoriFilm {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idFavoriF;

    @ManyToOne
    @JoinColumn(name = "idFilm")
    private Film films;


    @ManyToOne
    @JoinColumn(name = "idUser")
    private Utilisateur user;
}