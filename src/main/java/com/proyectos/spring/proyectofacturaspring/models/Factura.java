package com.proyectos.spring.proyectofacturaspring.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import java.util.List;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Component
@RequestScope
//@JsonIgnoreProperties({"targetSource", "advisors"})
public class Factura {

    @Autowired
    private Cliente cliente;

    @Value("${factura.mensaje}")
    private String mensaje;

    @Autowired
    private List<ItemFactura> itemFacturas;


    @PostConstruct
    public void init(){
        System.out.println("Inicializando los datos...");
        cliente.setNombre(cliente.getNombre().concat(" Ernesto"));
        mensaje = mensaje.concat(" literalmente :V");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Eliminando la instancia");
    }

    public double getTotal(){
        return itemFacturas.stream().mapToDouble(ItemFactura::getImporte)
                .sum();
    }
}
