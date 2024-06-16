package com.Mov.Dao;

import com.Mov.model.Serie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SerierDAO  extends JpaRepository<Serie, Integer> {
}
