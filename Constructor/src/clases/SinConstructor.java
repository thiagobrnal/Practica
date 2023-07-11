
package clases;

import java.util.Scanner;


public class SinConstructor {
    
    private Scanner s = new Scanner(System.in);
    String nombre = "";
    
    public void PedirNombre(){
        System.out.println("Ingrese su nombre");
        nombre = s.nextLine();
        
    }
    
    public void Imprimir(){
        System.out.println("Tu nombre es "+ nombre);
    }
}
