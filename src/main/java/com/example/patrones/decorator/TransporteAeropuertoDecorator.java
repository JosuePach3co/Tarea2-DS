package com.example.patrones.decorator;

public class TransporteAeropuertoDecorator extends ServicioDecorator {

    public TransporteAeropuertoDecorator(ServicioTuristico servicio) {
        super(servicio);
    }

    @Override
    public String getDescripcion() {
        return servicio.getDescripcion() + " + Transporte aeropuerto-hotel";
    }

    @Override
    public double getCosto() {
        return servicio.getCosto() + 15.0;
    }
}
