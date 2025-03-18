package com.proyectos.spring.proyectofacturaspring.controllers;

import com.proyectos.spring.proyectofacturaspring.models.Cli;
import com.proyectos.spring.proyectofacturaspring.models.Cliente;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    private final Cli cliente;

    public ClienteController(Cli cliente) {
        this.cliente = cliente;
    }

    @GetMapping
    public String obtenerNombre() {
        return "El nombre del cliente es: " + cliente.getNombre();
    }

    @PostMapping("/{nuevoNombre}")
    public String cambiarNombre(@PathVariable String nuevoNombre) {
        cliente.setNombre(nuevoNombre);
        return "Nombre cambiado a: " + cliente.getNombre();
    }
}

