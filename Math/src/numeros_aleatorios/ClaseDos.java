
package numeros_aleatorios;

import java.util.Random;

public class ClaseDos {
    public static void main(String[] args) {
        
        int aleatorio = 0;
        
        Random r = new Random();
        
        //La multiplicacion dice hasta que numero genrera la aleatoriedad
        aleatorio = (int)(r.nextDouble() * 100);
        
        System.out.println(aleatorio);
        
        aleatorio = (int)(r.nextInt() * 100);
        System.out.println(aleatorio);
    }
}
