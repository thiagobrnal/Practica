public class Java21{
 public static void main(String args[]){

  int matriz[][] = new int[2][2];

  matriz [0][0] = 5;
  matriz [0][1] = 2;
  matriz [1][0] = 2;
  matriz [1][1] = 5;

 for(int i = 0;i<=1;i++){
  for(int j = 0;j<=1;j++){
   System.out.print("["+matriz[i][j]+"]");
  }
 System.out.println("");
 }
 }
}