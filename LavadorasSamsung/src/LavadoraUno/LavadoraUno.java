package LavadoraUno;

import Library.LLFunciones;
import java.util.Scanner;

public class LavadoraUno {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("¿Cuantós kilos de ropa va a ingresar?");
        int k =s.nextInt();
        
        System.out.println("¿De que color es la ropa?");
        System.out.println("1: Ropa blanca");
        System.out.println("2: Ropa a color");
        int tRopa =s.nextInt();
        
        LLFunciones mensajero = new LLFunciones(k, tRopa);
        mensajero.CicloFinalizado();
    }
}
