package com.juancarloscruzd;

public abstract class Vehiculo {

    double consumo;
    double capacidad;
    double cantidad;

    Vehiculo(double consumo, double capacidad, double cantidad){
        this.consumo = consumo;
        this.capacidad = capacidad;
        this.cantidad = cantidad;
    }

    abstract String imprimirViaje(double viaje);
    abstract String reabastecer(double liters);
}
