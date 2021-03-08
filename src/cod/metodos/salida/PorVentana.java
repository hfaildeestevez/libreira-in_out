package cod.metodos.salida;

import cod.metodos.salida.InterfacesMetodosComunes;

import javax.swing.*;

public class PorVentana implements InterfacesMetodosComunes {
    private String msg;

    public PorVentana(String msg) {
        this.msg = msg;
    }

    @Override
    public void visualiza() {
        JOptionPane.showMessageDialog(null,"Sale por la ventana "+ msg);
    }
}
