package com.alura.hotel.one.service;

import com.alura.hotel.one.model.Login;
import com.alura.hotel.one.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService implements IloginService{
    @Autowired
    private LoginRepository loginRepository;
    @Override
    public Login encontrarLogin(Login login) {
        return loginRepository.getReferenceById(login.getId());
    }

    @Override
    public void agregarLogin(Login login) {
        loginRepository.save(login);

    }
}
