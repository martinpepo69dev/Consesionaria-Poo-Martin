package com.poo.concesionario.martin.entidades;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

interface IDetalleVehiculo extends Comparable<Vehiculo> {

    public int compareTo(Vehiculo otro);

    String obtenerDetalle();

    static Vehiculo obtenerVehiculoMasCaro(Collection<Vehiculo> vehiculos) {
        return Collections.max(vehiculos, Comparator.comparingDouble(Vehiculo::getPrecio));
    }

    static Vehiculo obtenerVehiculoMasBarato(Collection<Vehiculo> vehiculos) {
        return Collections.min(vehiculos, Comparator.comparingDouble(Vehiculo::getPrecio));
    }

    static Vehiculo obtenerVehiculoConLetraY(Collection<Vehiculo> vehiculos) {
        return vehiculos.stream()
                .filter(v -> v.getModelo().toUpperCase().contains("Y"))
                .findFirst()
                .orElse(null);
    }
}