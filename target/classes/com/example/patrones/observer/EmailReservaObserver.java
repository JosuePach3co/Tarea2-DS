package com.example.patrones.observer;

import com.example.interfaces.Notificador;
import com.example.usuarios_y_roles.Usuario;

public class EmailReservaObserver implements ReservaObserver {

    private Notificador notificador;

    public EmailReservaObserver(Notificador notificador) {
        this.notificador = notificador;
    }

    @Override
    public void onReservaCreada(String mensaje, Usuario usuario) {
        notificador.enviar(mensaje, usuario);
    }

    @Override
    public void onReservaCancelada(String mensaje, Usuario usuario) {
        notificador.enviar(mensaje, usuario);
    }
}
