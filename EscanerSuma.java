import java.util.Scanner;

public class EscanerSuma{
  public static void main(String args[]){
   
   Scanner s = new Scanner(System.in);
   String nombre = "";
   int num1= 0, num2 = 0, res = 0;

   System.out.println("Cual es tu nombre: ");
   nombre = s.nextLine();

   System.out.println("Ingrese el primer numero para la suma:");
   num1 = s.nextInt();

   System.out.println("Ingrese el segundo numero para la suma:");
   num2 = s.nextInt();

   res = num1 + num2;
   System.out.println("Hola "+nombre+" el resultado de la suma es: "+res);
 }
}