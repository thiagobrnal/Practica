
package sistema;

import funciones.Boleta;
import java.util.Scanner;


public class SistemaPeluqueria {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int numV;
        float importe;
        
        Boleta mensajero = new Boleta();
        
        System.out.println("ingrese un vendedor");
        numV = s.nextInt();
        System.out.println("ingrese un importe");
        importe = s.nextFloat();
        
        mensajero.Agregar(numV, importe);
        System.out.println(mensajero.acu1);
    }
}
