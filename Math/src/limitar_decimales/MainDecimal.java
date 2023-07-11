
package limitar_decimales;

import java.text.DecimalFormat;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class MainDecimal {
    public static void main(String[] args) {
        
        double numero = 2;
        double raiz = Math.sqrt(numero);
        
        //imprime con punto
        System.out.println("La raiz cuadrrada de "+numero+" es "+raiz);
        
        //imprime con coma
        //Utlzamos la clase Decima Format
        DecimalFormat df = new DecimalFormat("#.000");
        System.out.println("La raiz cuadrrada de "+numero+" es "+df.format(raiz));
        
        //imprime con coma
        //Utilizando String Format
        System.out.println("La raiz cuadrrada de "+numero+" es "+ String.format("%.2f", raiz));
        
        //imprime con punto
        //Utilizando la clase Math.round
        //dependiendo de los 0 es la cantidad de numeros despues  de la coma
        System.out.println("La raiz cuadrrada de "+numero+" es "+ (double)Math.round(raiz * 10000d) / 10000);
    
        //Utilizando la clase BigDecimal
        /*
         * import java.math.BigDecimal;
         * import java.math.RoundingMode;
        */
        //imprime con punto
        BigDecimal bd = new BigDecimal(raiz);
        bd = bd.setScale(4, RoundingMode.HALF_UP);
        System.out.println("La raiz cuadrrada de "+numero+" es "+ bd.doubleValue());
    }
}
