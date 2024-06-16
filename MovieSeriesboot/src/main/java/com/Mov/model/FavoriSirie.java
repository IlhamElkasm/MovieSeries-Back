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
public class FavoriSirie{

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private int idFavoriS;


        @ManyToOne
        @JoinColumn(name = "idSirie")
        private Serie series;

        @ManyToOne
        @JoinColumn(name = "idUser")
        private Utilisateur user;

}
