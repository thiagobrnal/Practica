package clases;

import java.util.Scanner;

public class ConConstructor {

    public ConConstructor(){
        Scanner s = new Scanner(System.in);
        String nombre = "";
        
        System.out.println("Ingrese su nombre");
        nombre = s.nextLine();
        
        System.out.println("Su nombre es "+nombre);
    }
}
