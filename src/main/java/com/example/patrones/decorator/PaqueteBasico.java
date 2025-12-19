package com.example.patrones.decorator;

public class PaqueteBasico implements ServicioTuristico {

    @Override
    public String getDescripcion() {
        return "Paquete básico: Hospedaje estándar";
    }

    @Override
    public double getCosto() {
        return 50.0; // Precio base
    }
}
