package com.example.patrones.decorator;

public class prueba {

    public static void main(String[] args) {

        ServicioTuristico paquete = new PaqueteBasico();

        paquete = new DesayunoDecorator(paquete);
        paquete = new TransporteAeropuertoDecorator(paquete);

        System.out.println("Descripción final: " + paquete.getDescripcion());
        System.out.println("Costo total: $" + paquete.getCosto());
    }
}
