package cod.metodos.salida;

import cod.metodos.salida.InterfacesMetodosComunes;

public class PorTerminal implements InterfacesMetodosComunes {
    private String msg;

    public PorTerminal(String msg) {
        this.msg = msg;
    }


    @Override
    public void visualiza() {
        System.out.println("Sale por terminal "+msg);
    }
}
