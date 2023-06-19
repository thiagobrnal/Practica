import java.util.Scanner;

public class java11{
 public static void main(String args[]){

  Scanner s = new Scanner(System.in);

  int numUno = 5, numDos = 5, resultado = 0, op;
  
  System.out.println("Ingrese la operacion");
  System.out.println("1: suma");
  System.out.println("2: resta");
  System.out.println("3: multiplicacion");
  System.out.println("4: division");
  op = s.nextInt();

  switch(op){
   
   case 1: 
    resultado = numUno + numDos;
    System.out.println("El resultado de la suma es: "+resultado);
   break;

   case 2:
    resultado = numUno - numDos;
    System.out.println("El resultado de la resta es: "+resultado);
   break;

   case 3:
    resultado = numUno * numDos;
    System.out.println("El resultado de la multiplicación es: "+resultado);
   break;

   case 4:
    resultado = numUno / numDos;
    System.out.println("El resultado de la division es: "+resultado);
   break;

   default:
    System.out.println("La operacion no esta en las opciones");
   break;
  }
 
 }
}