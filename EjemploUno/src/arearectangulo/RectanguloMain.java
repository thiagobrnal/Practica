
package arearectangulo;

import java.util.Scanner;


public class RectanguloMain {
    
    public static void main(String[] args) {
    
        Scanner s = new Scanner(System.in);
        
        System.out.println("Ingrese la base del rectangulo; ");
        int vBase = s.nextInt();
        
        System.out.println("Ingrese la altura del rectangulo; ");
        int vAlt = s.nextInt();
        
        Rectangulo valores = new Rectangulo(vBase, vAlt);
        valores.Imprimir();
    
    }
    
    
    
}
