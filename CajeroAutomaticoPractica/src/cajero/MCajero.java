
package cajero;

import funciones.*;



public class MCajero {
    
    public static void main(String[] args) {
        CajeroAutomatico cliente = new Consultar();
        cliente.setSaldo(5000);
        cliente.Operaciones();
    }
    
}
