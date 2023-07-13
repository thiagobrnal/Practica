
package listas_tipo_pila;

import javax.swing.JOptionPane;


public class Pila {
    
    private Nodo ultimoValIn;
    int tamano = 0;
    String lista = "";
    
    public Pila(){
        ultimoValIn = null;
        tamano = 0;
        lista = "";
    }
    
    
    //Metodo para saber si la pila esta vacia
    public boolean pilaVacia(){
        return ultimoValIn == null;
    }
    
    //Metodo para insertar un nodo en la pila
    public void insertNodo(int nodo){
        Nodo nuevoNodo = new Nodo(nodo);
        nuevoNodo.siguiente = ultimoValIn;
        ultimoValIn = nuevoNodo;
        tamano++;
    }
    
    //Metodo para eliminar un nodo de la pila
    public int eliminarNodo(){
        int aux = ultimoValIn.informacion;
        ultimoValIn = ultimoValIn.siguiente;
        tamano--;
        return aux;
    }
    
    //Metodo para conocer cual es el ultimo valor ingresado
    public int mostrarUltValIngresado(){
        return ultimoValIn.informacion;
    }
    
    //Metodo para conocer el tamaño de la Pila
    public int tamanoPila(){
        return tamano;
    }
    
    //Metodo para vaciar la Pila
    public void vaciarPila(){
        while (!pilaVacia()) {            
            eliminarNodo();
        }
    }
    
    //Mostrar para mostrar el contenido de la pila
    public void mostrarValores(){
        Nodo recorrido = ultimoValIn;
        
        while (recorrido != null) {            
            lista += recorrido.informacion + "\n";
            recorrido = recorrido.siguiente;
        }
        JOptionPane.showMessageDialog(null, lista);
        lista = "";
    }
}
