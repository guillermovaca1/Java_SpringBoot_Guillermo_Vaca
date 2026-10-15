package com.example.java_spring_guillermo_vaca.service;

import com.example.java_spring_guillermo_vaca.model.Registro;
import com.example.java_spring_guillermo_vaca.repository.RegistroRepository;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegistroService {

    private final RegistroRepository repository;

    public RegistroService(RegistroRepository repository) {
        this.repository = repository;
    }

    @Cacheable("registros")
    public List<Registro> obtenerTodosLosRegistros() {
        try {
            // Simula un retraso de 2 segundos en la base de datos
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        return repository.findAll();
    }

    public void guardarMasivamente(List<Registro> registros) {
        repository.saveAll(registros);
    }
}