package com.juancarloscruzd;

import org.junit.Assert;
import org.testng.annotations.Test;

public class CamionTest {

    @Test
    public void ShouldPrintCannotRefuel() {
        Camion  mercedes = new Camion(12.0, 40.0, 40.0);
        Assert.assertEquals("Automovil no se puede reabastecer el tanque, esta lleno", mercedes.reabastecer(12));
    }

    @Test
    public void ShouldPrintCanRefuel() {
        Camion komatzu = new Camion(10.0, 40.0, 00.0);
        Assert.assertEquals("La cantidad de combustible del vehiculo es: 11.399999999999999", komatzu.reabastecer(12));
    }

    @Test
    public void shouldPrintNeedUssage() {
        Camion mercedes = new Camion(5.0, 40.0, 40.0);

        Assert.assertEquals("El camion viajo: 2.0 Km y aun tiene 5.22 de combustible", mercedes.imprimirViaje(2));
    }

    @Test
    public void shouldPrintNeedRefuel() {
        Camion mercedes = new Camion(10.0, 40.0, 00.0);
        Assert.assertEquals("Camion necesita reabastecmiento de combustible", mercedes.imprimirViaje(2));
    }

    @Test
    public void RefuelWithZeroLiters(){
        Camion mercedes = new Camion(10.0, 40.0, 00.0);
        Assert.assertEquals("Debe reabastecer el camion con algo de gasolina, intente con un valor mayor a cero", mercedes.reabastecer(0));
    }

    @Test
    public void RefuelWithNegativeValueForLiters(){
        Camion mercedes = new Camion(10.0, 40.0, 00.0);
        Assert.assertEquals("Debe reabastecer el camion con algo de gasolina, intente con un valor mayor a cero", mercedes.reabastecer(-1));
    }

    @Test
    public void DriveWithZeroKm(){
        Camion mercedes = new Camion(10.0, 40.0, 40.0);
        Assert.assertEquals("El camion no puede moverse si no ingresa un valor mayor a cero", mercedes.imprimirViaje(0));
    }

    @Test
    public void DriveWithNegativeKm(){
        Camion mercedes = new Camion(10.0, 40.0, 40.0);
        Assert.assertEquals("El camion no puede moverse si no ingresa un valor mayor a cero", mercedes.imprimirViaje(-1));
    }

    // Caso: 80 camiones recargando 40 litros al mismo tiempo
    @Test(invocationCount = 80, threadPoolSize = 80)
    public void ShouldPrintCanRefuelOnStress() {
        Camion komatzu = new Camion(10.0, 40.0, 00.0);
        Assert.assertEquals("La cantidad de combustible del vehiculo es: 38.0", komatzu.reabastecer(40));
    }
}
