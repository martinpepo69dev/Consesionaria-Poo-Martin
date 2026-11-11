package com.poo.concesionario.martin.tests;

import java.util.ArrayList;
import java.util.List;

import com.poo.concesionario.martin.entidades.Auto;
import com.poo.concesionario.martin.entidades.Moto;
import com.poo.concesionario.martin.entidades.Vehiculo;

public class TestConcesionario {
        public static void main(String[] args) {

                List<Vehiculo> listaVehiculos = new ArrayList<>();

                listaVehiculos.add(new Auto("Peugeot", "206", 200000.0, 4));
                listaVehiculos.add(new Moto("Honda", "Titan", 60000.0, "125cc"));
                listaVehiculos.add(new Auto("Peugeot", "208", 250000.0, 5));
                listaVehiculos.add(new Moto("Yamaha", "YBR", 80500.50, "160cc"));

                System.out.println(" ");
                listaVehiculos.forEach(System.out::println);

                System.out.println(" ");
                System.out.println(
                                "=============================");
                System.out.println(" ");

                Vehiculo vehiculoMasCaro = listaVehiculos.stream()
                                .max((v1, v2) -> Double.compare(v1.getPrecio(), v2.getPrecio()))
                                .orElse(null);
                System.out.println(
                                "Vehículo más caro: " + vehiculoMasCaro.getMarca() + " " + vehiculoMasCaro.getModelo());

                Vehiculo vehiculoMasBarato = listaVehiculos.stream()
                                .min((v1, v2) -> Double.compare(v1.getPrecio(), v2.getPrecio()))
                                .orElse(null);
                System.out
                                .println("Vehículo más barato: " + vehiculoMasBarato.getMarca() + " "
                                                + vehiculoMasBarato.getModelo());

                for (Vehiculo v : listaVehiculos) {
                        if (v.getModelo().toUpperCase().contains("Y")) {
                                System.out.println("Vehículos que contienen 'Y': " + v);
                        }
                }

                System.out.println(" ");
                System.out.println(
                                "=============================");
                System.out.println(" ");
                System.out.println("Vehículos ordenados por precio de mayor a menor:");
                listaVehiculos.stream()
                                .sorted((v1, v2) -> Double.compare(v2.getPrecio(), v1.getPrecio()))
                                .map(v -> v.getMarca() + " " + v.getModelo())
                                .forEach(System.out::println);

                System.out.println(" ");
                System.out.println(
                                "=============================");
                System.out.println(" ");

                System.out.println("Vehículos ordenados por orden natural (marca, modelo, precio):");
                listaVehiculos.stream()
                                .sorted()
                                .forEach(System.out::println);
        }
}
