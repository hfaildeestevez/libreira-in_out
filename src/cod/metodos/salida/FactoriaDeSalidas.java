package cod.metodos.salida;

public class FactoriaDeSalidas {
    /**
     *  para la salida
     */
    public static final int TERMINAL=1;
    public static final int VENTANA=2;
    public static final int IMPRESORA=3;

    /**
     *
     * @param type 1 Terminal, 2Ventana
     * @param msg  mensaje que introducimos para visualizar
     * @return devuelve un objeto de tipo interfaz tipo del objeto elejido
     */
    public static InterfacesMetodosComunes getProducto(int type, String msg){
        switch(type){
            case TERMINAL:
                return new PorTerminal(msg);
            case VENTANA:
                return new PorVentana(msg);
            case IMPRESORA:
                return new PorImpresora(msg);
            default:
                return null;
        }
    }
}
