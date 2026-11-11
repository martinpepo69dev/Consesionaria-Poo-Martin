package com.poo.concesionario.martin.entidades;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Moto extends Vehiculo {
    private String cilindrada;

    public Moto(String marca, String modelo, double precio, String cilindrada) {
        super(marca, modelo, precio);
        this.cilindrada = cilindrada;
    }

    @Override
    public String obtenerDetalle() {
        return "Marca: " + marca + " // Modelo: " + modelo + " // Cilindrada: " + cilindrada + " // Precio: $" + precio;
    }

    @Override
    public String toString() {
        return obtenerDetalle();
    }
}