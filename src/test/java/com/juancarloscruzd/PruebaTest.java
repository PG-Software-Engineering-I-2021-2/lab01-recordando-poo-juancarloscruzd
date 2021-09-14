package com.juancarloscruzd;


import org.junit.Assert;
import org.testng.annotations.Test;

import java.util.logging.Logger;

public class PruebaTest {

    static final Logger logger = Logger.getLogger(PruebaTest.class.getName());

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

    //for test coverage only
    @Test
    public void BoostrapApplicationMain(){
        Prueba p = new Prueba();
        Prueba.main(null);
    }

    @Test
    public void BoostrapApplication(){
        Prueba.start();
    }

}
