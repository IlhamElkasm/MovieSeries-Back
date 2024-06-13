package com.Mov.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Sirie {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idSirie;
    private String titre;
    private String description;
    private String dateDebut;
    private String dateFin;
    private String acteurs;

    @ManyToMany(mappedBy = "favoriteSiries")
    private Set<User> users;
}