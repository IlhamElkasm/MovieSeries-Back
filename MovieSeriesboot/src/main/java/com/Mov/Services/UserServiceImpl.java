package com.Mov.Services;

import com.Mov.Dao.UserDAO;
import com.Mov.model.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserDAO userDAO;
    @Override
    public Utilisateur saveUser(Utilisateur user) {
        return userDAO.save(user);

    }

    @Override
    public List<Utilisateur> getAllUser() {
        return userDAO.findAll();
    }
}
