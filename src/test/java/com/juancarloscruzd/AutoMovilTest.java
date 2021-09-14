package com.juancarloscruzd;

import org.junit.Assert;
import org.testng.annotations.Test;

public class AutoMovilTest {

    @Test
    public void ShouldPrintCannotRefuel() {
        Automovil nissan = new Automovil(12.0, 40.0, 40.0);
        Assert.assertEquals("Automovil no se puede reabastecer el tanque, esta lleno", nissan.reabastecer(12));
    }

    @Test
    public void ShouldPrintCanRefuel() {
        Automovil nissan = new Automovil(10.0, 40.0, 00.0);
        Assert.assertEquals("La cantidad de combustible del vehiculo es: 12.0", nissan.reabastecer(12));
    }


    @Test
    public void shouldPrintNeedUssage() {
        Automovil nissan = new Automovil(10.0, 40.0, 40.0);
        Assert.assertEquals("El vehiculo viajo: 2.0 Km y aun tiene 20.0 de combustible", nissan.imprimirViaje(2));
    }

    @Test
    public void shouldPrintNeedRefuel() {
        Automovil nissan = new Automovil(10.0, 40.0, 00.0);
        Assert.assertEquals("Vehiculo necesita reabastecmiento de combustible", nissan.imprimirViaje(2));
    }
}
