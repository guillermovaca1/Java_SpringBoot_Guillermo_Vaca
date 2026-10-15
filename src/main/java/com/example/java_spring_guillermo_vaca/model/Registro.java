package com.example.java_spring_guillermo_vaca.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Registro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descripcion;
    private String valor;

    public Registro() {}

    public Registro(String descripcion, String valor) {
        this.descripcion = descripcion;
        this.valor = valor;
    }

    // Getters y Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
    public String getValor() { return valor; }
    public void setValor(String valor) { this.valor = valor; }
}