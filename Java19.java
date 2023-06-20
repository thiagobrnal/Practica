import java.util.Scanner;

public class Java19{
 public static void main(String args[]){

  Scanner s = new Scanner(System.in);

  int vector[] = new int[5];
  int dato;

  for(int i = 0;i<=5-1;i++){
   System.out.println("Ingrese el numero en la posicion "+i+ " del vector");
   dato = s.nextInt();
   vector[i] = dato;
  }

  for(int i = 0;i<=5-1;i++){
   System.out.print("[" +vector[i]+ "]");
  }
 }
}