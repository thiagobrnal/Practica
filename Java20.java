import java.util.Scanner;
public class Java20{
 public static void main(String args[]){

  Scanner s = new Scanner(System.in);
  int longitud = 0;

  System.out.print("Cuantos nuemeros desea ingresar: ");
  longitud = s.nextInt();

  int numeros[] = new int[longitud];

  for(int i = 0; i < numeros.length; i++){
   System.out.println("Ingrese el valor #"+(i + 1));
   numeros[i] = s.nextInt();
  }

  for(int i = 0; i < numeros.length; i++){
   System.out.print("["+numeros[i]+"]");
   
  }
 }
}