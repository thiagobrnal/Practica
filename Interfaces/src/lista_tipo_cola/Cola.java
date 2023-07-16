package lista_tipo_cola;

import javax.swing.JOptionPane;

public class Cola {

    private Nodo inicioCola, finCola;
    String cola = "";
    
    public Cola (){
        inicioCola = null;
        finCola = null;
    }
    
    //Metodo para saber si la cola esta vacia
    public boolean ColaVacia(){
        if (inicioCola == null) {
            return true;
        } else {
            return false;
        }
    }
    
    //Metodo para insertar a la cola
    public void Insertar(int informacion){
        Nodo nuevoNodo = new Nodo();
        nuevoNodo.informacion = informacion;
        nuevoNodo.siguente = null;
        
        if (ColaVacia()) {
            inicioCola = nuevoNodo;
            finCola = nuevoNodo;
        } else {
            finCola.siguente = nuevoNodo;
            finCola = nuevoNodo;
        }
    }
    
    //Metodo para extraer de la cola
    public int Extraer(){
        if (!ColaVacia()) {
            int informacion = inicioCola.informacion;
            
            if (inicioCola == finCola) {
                inicioCola = null;
                finCola = null;
            } else {
                inicioCola = inicioCola.siguente;
            }
            return informacion;
        } else {
            return Integer.MAX_VALUE;
        }
    }
    
    //Metodo para mostrar el contenido de la cola
    public void MostrarContenido(){
        Nodo recorrido = inicioCola;
        String colaInvertida = "";
        
        while (recorrido != null) {
            cola += recorrido.informacion + " ";
            recorrido = recorrido.siguente;
        }
        
        String cadena[] = cola.split(" ");
        
        for (int i = cadena.length - 1; i >= 0; i--) {
            colaInvertida += " " + cadena[i];
        }
        
        JOptionPane.showMessageDialog(null,colaInvertida);
        cola = "";
    }
}
