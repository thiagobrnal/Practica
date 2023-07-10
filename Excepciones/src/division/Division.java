package division;

import java.util.Scanner;

public class Division {

    public static void main(String[] args) {

        try {
            //codigo inicial
            Scanner s = new Scanner(System.in);
            int val1, val2, res;

            System.out.println("Ingrese el primer valor");
            val1 = s.nextInt();
            System.out.println("Ingrese el segundo valor");
            val2 = s.nextInt();

            res = val1 / val2;

            System.out.println("Divisón es igual a: " + res);
        } catch (Exception e) {
            //comportamiento de error no previsto
            System.out.println("Error!!" + e);
        } finally{
            System.out.println("Operacion Concluida");
        }

    }
}
