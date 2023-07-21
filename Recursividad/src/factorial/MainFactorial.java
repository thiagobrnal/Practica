package factorial;

import java.util.Scanner;

public class MainFactorial {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.print("introduce el numero para calcular el factorial: ");
        int numero = s.nextInt();
        
        RecursividadFactorial recursividad = new RecursividadFactorial();
        int factorial = recursividad.Factorial(numero);
        System.out.println("El factorial de "+numero+ " es "+factorial);
    }
}
