package com.proyectos.spring.proyectofacturaspring.controllers;

import com.proyectos.spring.proyectofacturaspring.models.Cliente;
import com.proyectos.spring.proyectofacturaspring.models.Factura;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/factura")
public class FacturaController {

    private Factura factura;

    public FacturaController(Factura factura) {
        this.factura = factura;
    }

    @GetMapping
    public Factura getFactura(){
        Factura factura1 = new Factura();
        Cliente c = new Cliente();
        c.setNombre(factura.getCliente().getNombre());
        c.setApellido(factura.getCliente().getApellido());
        factura1.setCliente(c);
        factura1.setMensaje(factura.getMensaje());
        factura1.setItemFacturas(factura.getItemFacturas());

        return factura1;
    }

}
