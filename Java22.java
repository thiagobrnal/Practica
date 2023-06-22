import java.util.Scanner;
public class Java22{
 public static void main(String args[]){

  Scanner s = new Scanner(System.in);
  int f = 0, c = 0, contador = 1;

  System.out.print("Ingrese la cantidad de filas: ");
   f = s.nextInt();
  System.out.print("Ingrese la cantidad de columnas: ");
   c = s.nextInt();

  int numeros[][] = new int[f][c];
  
  for(int i = 0;i<f;i++){
   for(int j = 0;j<c;j++){
    numeros[i][j] = contador;
    contador++;
    if(contador<=10){
    System.out.print("[0"+numeros[i][j]+"]");
    }else{
    System.out.print("["+numeros[i][j]+"]");
    }
   }
   System.out.println("");
  }

 }
}