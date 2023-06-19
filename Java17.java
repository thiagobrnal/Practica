import java.util.Scanner;

public class Java17{
 public static void main(String args[]){

  Scanner s = new Scanner(System.in);

  System.out.print("Ingrese un nombre: ");
  String nombre1 = s.nextLine();

  System.out.print("Ingrese otro nombre: ");
  String nombre2 = s.nextLine();

  if(nombre1.equalsIgnoreCase(nombre2)){
   System.out.println("\nLos nombres son iguales");
  }else{
   System.out.println("\nLos nombres son distintos");
  }

 }
}