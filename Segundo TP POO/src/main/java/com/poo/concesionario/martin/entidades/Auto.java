package com.poo.concesionario.martin.entidades;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Auto extends Vehiculo {
    private int puertas;

    public Auto( String marca, String modelo, double precio, int puertas) {
        super(marca, modelo, precio);
        this.puertas = puertas;
    }

    @Override
    public String obtenerDetalle() {
        return "Marca: " + marca + " // Modelo: " + modelo + " // Puertas: " + puertas + " // Precio: $"
                + precio;
    }

    @Override
    public String toString() {
        return obtenerDetalle();
    }

}