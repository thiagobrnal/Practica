
package clases;


public class Pila {
    
    private Nodo ultValorIngresado;
    
    public Pila(){
        ultValorIngresado = null;
        
    }
    
    //Metodo para insertar dentro de la pila
    public void Insertar(char valor){
        Nodo nuevoNodo = new Nodo();
        nuevoNodo.informacion = valor;
        
        if (ultValorIngresado == null) {
            
            nuevoNodo.siguiente = null;
            ultValorIngresado = nuevoNodo;
            
        }else{
            
            nuevoNodo.siguiente = ultValorIngresado;
            ultValorIngresado = nuevoNodo;
        }
    }
    
    //Metodo para extraer de la pila
    public char Extraer(){
        if (ultValorIngresado != null) {
            
            char informacion = ultValorIngresado.informacion;
            ultValorIngresado = ultValorIngresado.siguiente;
            return informacion;
            
        }else{
            return Character.MAX_VALUE;
        }
    }
    
    //Metodo para saber si la pila esta vacia
    public boolean PilaVacia(){
        return ultValorIngresado == null;
    }
}
