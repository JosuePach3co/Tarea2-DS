package com.example.patrones.factory;

import com.example.enums.TipoHabitacion;

public class HabitacionFamiliar extends Habitacion {
    public HabitacionFamiliar(int idHotel, int numero) {
        super(idHotel, numero, TipoHabitacion.FAMILIAR);
    }

    @Override
    public double calcularPrecio() {
        return 120.00;
    }

    @Override
    public void mostrarDetalles() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}