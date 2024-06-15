package com.Mov.Services;

import com.Mov.model.Utilisateur;

import java.util.List;

public interface UserService {
    Utilisateur saveUser(Utilisateur user);
    List<Utilisateur> getAllUser();


}
