package com.juancarloscruzd;

import java.util.logging.Logger;

public class Prueba {

    static final Logger logger = Logger.getLogger(Prueba.class.getName());

    public static void main(String[] args)
    {
        start();
    }

    public static void start() {
        Automovil subaru = new Automovil(0.9,100,10);
        String nissanDrive = subaru.imprimirViaje(4);
        logger.info(nissanDrive);

        Automovil toyota = new Automovil(0.9,100,10);
        String toyotaDrive = toyota.imprimirViaje(12);
        logger.info(toyotaDrive);

        Camion komatzu = new Camion(1.6,100,10);
        String komatzuDrive = komatzu.imprimirViaje(4);
        logger.info(komatzuDrive);
    }
}
