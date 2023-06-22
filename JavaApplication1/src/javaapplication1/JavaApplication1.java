
package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String nombre = s.nextLine();
        System.out.println("\nHola " + nombre + "\n");
        
        System.out.println("Ingrese su edad");
        int edad = s.nextInt();
        System.out.println("\nEl año que viene vas a tener " + (edad + 1) + "\n");
        
        System.out.println("Ingrese a cuanto cotiza el dolar");
        float cotizacion = s.nextFloat();
        System.out.println("\nEl dolar esta a: " + cotizacion + "\n");
    }
    
}
