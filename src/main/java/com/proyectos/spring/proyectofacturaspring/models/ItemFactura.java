package com.proyectos.spring.proyectofacturaspring.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
public class ItemFactura {
    private Producto producto;
    private Integer cantidad;

    public double getImporte(){
        return producto.getPrecio() * cantidad;
    }
}
