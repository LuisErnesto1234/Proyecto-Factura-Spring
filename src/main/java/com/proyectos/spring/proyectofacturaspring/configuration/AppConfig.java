package com.proyectos.spring.proyectofacturaspring.configuration;

import com.proyectos.spring.proyectofacturaspring.models.ItemFactura;
import com.proyectos.spring.proyectofacturaspring.models.Producto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.Arrays;
import java.util.List;

@Configuration
@PropertySource(value = "classpath:/data.properties", encoding = "UTF-8")
public class AppConfig {

    @Value("${producto.nombre1}")
    private String nombre1;
    @Value("${producto.precio1}")
    private double precio1;

    @Value("${producto.nombre2}")
    private String nombre2;
    @Value("${producto.precio2}")
    private double precio2;

    @Bean
    List<ItemFactura> itemFacturas(){
        Producto p1 = new Producto(nombre1, precio1);
        Producto p2 = new Producto(nombre2, precio2);

        return Arrays.asList(new ItemFactura(p1, 5), new ItemFactura(p2, 3));
    }

    @Bean
    Producto productoDestacado(){
        return new Producto("Pasta Dental", 12.1);
    }

}
