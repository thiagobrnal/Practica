package LavadoraUno;

import Library.LLFunciones;
import java.util.Scanner;

public class LavadoraUno {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("�Cuant�s kilos de ropa va a ingresar?");
        int k =s.nextInt();
        
        System.out.println("�De que color es la ropa?");
        System.out.println("1: Ropa blanca");
        System.out.println("2: Ropa a color");
        int tipoDeRopa =s.nextInt();
        
        LLFunciones mensajero = new LLFunciones(k, tipoDeRopa);
        mensajero.setTipoDeRopa(2);
        System.out.println("El tipo de ropa es: "+ mensajero.getTipoDeRopa());
        mensajero.CicloFinalizado();    
    }
}
