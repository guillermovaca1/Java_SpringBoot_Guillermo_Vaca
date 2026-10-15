package com.example.java_spring_guillermo_vaca.controller;

import com.example.java_spring_guillermo_vaca.model.Registro;
import com.example.java_spring_guillermo_vaca.service.RegistroService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
@CrossOrigin(origins = "*")
public class TestController {

    private final RegistroService service;

    public TestController(RegistroService service) {
        this.service = service;
    }

    @Bean
    public CommandLineRunner initData() {
        return args -> {
            System.out.println("Insertando 100,000 registros, por favor espera...");
            List<Registro> lote = new ArrayList<>();
            for (int i = 0; i < 100000; i++) {
                lote.add(new Registro("Item " + i, "Valor " + i));
            }
            service.guardarMasivamente(lote);
            System.out.println("Carga masiva finalizada.");
        };
    }

    @GetMapping("/test-tiempo")
    public String probarTiempoDeAcceso() {
        long inicio = System.currentTimeMillis();

        List<Registro> resultado = service.obtenerTodosLosRegistros();

        long fin = System.currentTimeMillis();
        long tiempoTotal = fin - inicio;

        return String.format("Se obtuvieron %d registros en %d ms.", resultado.size(), tiempoTotal);
    }
}