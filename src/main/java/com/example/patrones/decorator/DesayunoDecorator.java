package com.example.patrones.decorator;

public class DesayunoDecorator extends ServicioDecorator {

    public DesayunoDecorator(ServicioTuristico servicio) {
        super(servicio);
    }

    @Override
    public String getDescripcion() {
        return servicio.getDescripcion() + " + Desayuno incluido";
    }

    @Override
    public double getCosto() {
        return servicio.getCosto() + 8.0; // costo del desayuno
    }
}
