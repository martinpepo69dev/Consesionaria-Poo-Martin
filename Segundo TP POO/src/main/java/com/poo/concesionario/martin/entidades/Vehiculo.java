package com.poo.concesionario.martin.entidades;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public abstract class Vehiculo implements IDetalleVehiculo {
    public String marca;
    public String modelo;
    public double precio;

    @Override
    public int compareTo(Vehiculo otro) {

        int compMarca = this.marca.compareTo(otro.marca);
        if (compMarca != 0)
            return compMarca;

        int compModelo = this.modelo.compareTo(otro.modelo);
        if (compModelo != 0)
            return compModelo;

        return Double.compare(this.precio, otro.precio);
    }
}