
package listas_tipo_pila;

import javax.swing.JOptionPane;


public class Main {
    public static void main(String[] args) {
        int option = 0,nodo = 0; 
        Pila pila = new Pila();
        
        do {
            try {
                
                option = Integer.parseInt(JOptionPane.showInputDialog(null, 
                        "Menu de Opciones\n\n"+
                        "1. Insertar un Nodo\n"+
                        "2. Eliminar un nodo\n"+
                        "3. ¿La Pila esta vacia?\n"+
                        "4. ¿Cual es el ultimo valor ingresado en la Pila?\n"+
                        "5. ¿Cuantos nodos tiene la pila?\n"+
                        "6. Vaciar Pila\n"+
                        "7. Mostrar contenido de la Pila\n"+
                        "8. Salir\n\n"));
                
                
                switch (option) {
                    case 1:
                        nodo = Integer.parseInt(JOptionPane.showInputDialog(null, 
                                "Por favor ingrese el valor a guardar en el nodo"));
                                pila.insertNodo(nodo);
                        break;
                        
                    case 2:
                        if (!pila.pilaVacia()) {
                            JOptionPane.showMessageDialog(null, "Se ah eliminado un nodo con el valor "+ pila.eliminarNodo());
                        }else{
                            JOptionPane.showMessageDialog(null, "La pila esta vacia");
                        }
                        break;
                        
                    case 3:
                        if (pila.pilaVacia()) {
                             JOptionPane.showMessageDialog(null, "La pila esta vacia");
                        }else{
                             JOptionPane.showMessageDialog(null, "La pila NO esta vacia");
                        }
                        
                        break;
                        
                    case 4:
                        if (!pila.pilaVacia()) {
                            JOptionPane.showMessageDialog(null, "El  ultimo valor ingresado en la pila es "+
                                                                            pila.mostrarUltValIngresado());
                        }else{
                            JOptionPane.showMessageDialog(null, "La pila esta vacia");
                        }
                        
                        break;
                        
                    case 5:
                        JOptionPane.showMessageDialog(null, "La pila contiene "+pila.tamanoPila()+ " nodos.");
                        break;
                        
                    case 6:
                        if (!pila.pilaVacia()) {
                            pila.vaciarPila();
                            JOptionPane.showMessageDialog(null, "Se ha vaciado la pila correctamente");
                        }else{
                            JOptionPane.showMessageDialog(null, "La pila esta vacia");
                        }
                        
                        break;
                        
                    case 7:
                        pila.mostrarValores();
                        break;
                        
                    case 8:
                        option = 8;
                        break;
                        
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion incorrecta, vuelva a intetar nuevamente.");
                        break;
                }
                
            } catch (NumberFormatException e) {
                
            }
        } while (option != 8);
    }
}
