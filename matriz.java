import java.util.Scanner;
public class matriz{
public static void main(String args[]){

 Scanner s = new Scanner(System.in);
 int rank[][] = new int[10][2];
 int dato, j, aux, aux1;
  
 for(int i = 0; i<10;i++){
  System.out.println("Ingrese el numero en la posicion "+i+ " del vector");
   dato = s.nextInt();
   rank[i][0] = i+1;
   rank[i][1] = dato;
 }

 for(int i = 0; i<10;i++){
  System.out.print("["+rank[i][0]+"]");
  System.out.println("["+rank[i][1]+"]");
 }

 System.out.println("");

 for(int i = 1;i<rank.length;i++){
  aux = rank[i][1];
  aux1 = rank[i][0];
  j = i - 1;
  while((aux < rank[j][1]) && (j>0)){
   rank[j+1][1] = rank[j][1];
   rank[j+1][0] = rank[j][0];
   j--;
  }
  rank[j+1][1] = aux;
  rank[j+1][0] = aux1;
 }

 for(int i = 0; i<10;i++){
  System.out.print("["+rank[i][0]+"]");
  System.out.println("["+rank[i][1]+"]");
 }
 

}
}