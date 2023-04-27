package com.alura.hotel.one.service;

import com.alura.hotel.one.model.Login;

public interface IloginService {
    public Login encontrarLogin(Login login);
    public void agregarLogin(Login login);
}
