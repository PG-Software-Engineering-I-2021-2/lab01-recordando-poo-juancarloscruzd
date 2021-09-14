package com.juancarloscruzd;

public class Automovil extends Vehiculo {

    Automovil(double consumo, double capacidad, double cantidad){
        super(consumo, capacidad, cantidad);
    }

    @Override
    public String reabastecer(double liters) {
        if (liters <= 0 ) {
            return "Debe reabastecer el automovil con algo de gasolina, intente con un valor mayor a cero";
        }

        double freeSpace = this.capacidad - this.cantidad;

        if (liters > freeSpace)
        {
            return "Automovil no se puede reabastecer el tanque, esta lleno";

        }
        else{
            this.cantidad += liters;
            return "La cantidad de combustible del vehiculo es: "+ this.cantidad;
        }

    }

    @Override
    public String imprimirViaje(double viaje) {
        double consumoViaje = viaje * consumo;
        double remanenteFuel = cantidad - consumoViaje;

        if (viaje <= 0){
            return "El automovil no puede moverse si no ingresa un valor mayor a cero";
        }

        if(remanenteFuel > 0) {
            return "El vehiculo viajo: " + viaje + " Km y aun tiene " + remanenteFuel + " de combustible";
        } else {
            return "Vehiculo necesita reabastecmiento de combustible";
        }
    }
}
