/*
   * Creado por BlockWizard
   * Version 1.0
   * Creado el dia 06/07/23
*/
package ejemplouno;

import java.util.Scanner;

public class EjemploUno {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); 
        String palabra = "", palabraInvertida = "";
        int longitudPalabra = 0;
        
        System.out.println("Ingrese una palabra: ");
        palabra = s.nextLine();
        
        //cuenta los caracteres de la palabra ingresada
        longitudPalabra = palabra.length();
        
        while (longitudPalabra != 0) {
           
            palabraInvertida += palabra.substring(longitudPalabra - 1, longitudPalabra);
            longitudPalabra--;
            
        }
        
        System.out.println(palabraInvertida);
    }
    
}
