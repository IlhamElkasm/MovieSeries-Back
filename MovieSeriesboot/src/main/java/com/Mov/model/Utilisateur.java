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
public class Utilisateur {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idUser;
    private String userName;
    private String password;

}