package com.example.patrones.factory;

import com.example.enums.TipoHabitacion;

public class HabitacionEstandar extends Habitacion {
    public HabitacionEstandar(int idHotel, int numero) {
        super(idHotel, numero, TipoHabitacion.ESTANDAR);
    }

    @Override
    public double calcularPrecio() {
        return 80.0;
    }

    @Override
    public void mostrarDetalles() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}