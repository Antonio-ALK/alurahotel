package com.alura.hotel.one.service;

import com.alura.hotel.one.model.Huesped;
import com.alura.hotel.one.repository.HuespedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HuespedService implements IhuespedService{
    @Autowired
    private HuespedRepository huespedRepository;
    @Override
    public List<Huesped> listarHuesped() {
        return huespedRepository.findAll();
    }

    @Override
    public void agregarHuesped(Huesped huesped) {
        huespedRepository.save(huesped);

    }

    @Override
    public void eliminarHuesped(Huesped huesped) {
        huespedRepository.delete(huesped);

    }

    @Override
    public Huesped buscarHuesped(Huesped huesped) {
        return huespedRepository.findById(huesped.getId()).orElse(null);
    }
}
