package Suma;

import java.util.Scanner;

public class SumaMain {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Ingrese el primer valor: ");
        int valorUno = s.nextInt();
        
        System.out.println("Ingrese el segundo valor: ");
        int valorDos = s.nextInt();
        
        Suma valores = new Suma(valorUno, valorDos);
        valores.Imrpimir();
    }
}
