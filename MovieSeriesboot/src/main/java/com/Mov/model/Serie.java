package com.Mov.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Serie {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  int idSirie;
    private  String  titre;
    private String description;
    private  String dateDebut;
    private  String  dateFin;
    private String acteurs;


}