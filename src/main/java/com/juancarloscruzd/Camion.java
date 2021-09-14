package com.juancarloscruzd;

public class Camion extends Vehiculo {

    Camion(double consumo, double capacidad, double cantidad){
        super(consumo, capacidad, cantidad);
    }

    @Override
    public String reabastecer(double liters) {

        double freeSpace = this.capacidad - this.cantidad;

        if (liters > freeSpace)
        {
            return "Automovil no se puede reabastecer el tanque, esta lleno";
        } else {
            this.cantidad += (liters * 0.95);
            return "La cantidad de combustible del vehiculo es: "+ this.cantidad;
        }

    }

    @Override
    public String imprimirViaje(double viaje) {

        double consumoViaje = viaje * consumo;
        double remanenteFuel = 1 * (capacidad / 100) + (cantidad - 1) * (capacidad / 100) * 0.95 - consumoViaje;

        if(remanenteFuel > 0) {
            return "El camion viajo: " + viaje + " Km y aun tiene " + String.format("%.2f", remanenteFuel) + " de combustible";
        } else {
            return "Camion necesita reabastecmiento de combustible";
        }
    }
}
