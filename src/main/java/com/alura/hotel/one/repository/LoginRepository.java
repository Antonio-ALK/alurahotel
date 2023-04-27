package com.alura.hotel.one.repository;

import com.alura.hotel.one.model.Login;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginRepository extends JpaRepository<Login, Long> {
}
