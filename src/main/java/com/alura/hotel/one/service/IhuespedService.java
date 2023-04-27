package com.alura.hotel.one.service;

import com.alura.hotel.one.model.Huesped;

import java.util.List;

public interface IhuespedService {

    public List<Huesped> listarHuesped();

    public void agregarHuesped(Huesped huesped);
    public void eliminarHuesped(Huesped huesped);
    public Huesped buscarHuesped(Huesped huesped);

}
