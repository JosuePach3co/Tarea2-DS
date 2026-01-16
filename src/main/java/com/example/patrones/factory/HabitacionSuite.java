package com.example.patrones.factory;

import com.example.enums.TipoHabitacion;

public class HabitacionSuite extends Habitacion {
    public HabitacionSuite(int idHotel, int numero) {
        super(idHotel, numero, TipoHabitacion.SUITE);
    }

    @Override
    public double calcularPrecio() {
        return 180.00;
    }

    @Override
    public void mostrarDetalles() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}