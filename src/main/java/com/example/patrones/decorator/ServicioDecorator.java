package com.example.patrones.decorator;

public abstract class ServicioDecorator implements ServicioTuristico {

    protected ServicioTuristico servicio;

    public ServicioDecorator(ServicioTuristico servicio) {
        this.servicio = servicio;
    }

    @Override
    public String getDescripcion() {
        return servicio.getDescripcion();
    }

    @Override
    public double getCosto() {
        return servicio.getCosto();
    }
}
