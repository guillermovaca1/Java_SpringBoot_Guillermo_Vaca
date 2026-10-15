package com.example.java_spring_guillermo_vaca.repository;

import com.example.java_spring_guillermo_vaca.model.Registro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegistroRepository extends JpaRepository<Registro, Long> {
}