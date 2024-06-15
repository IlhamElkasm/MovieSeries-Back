package com.Mov.Dao;


import com.Mov.model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDAO extends JpaRepository<Utilisateur, Integer> {
}
