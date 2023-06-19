public class Java15_1{
 public static void main(String args[]){

  System.out.println("Ciclo con for:");
  for(int i = 1;i<=10;i++){
   if(i==10){
    System.out.print(i);
   }else{
    System.out.print(i+", ");
   }
  }

  System.out.println("\nCiclo con while:");
  int c = 1;
  while(c<11){
   if(c==10){
    System.out.print(c);
   }else{
    System.out.print(c+", ");
   }
   c++;
  }

  System.out.println("\nCiclo con do-while:");
  c = 1;
  do{
   if(c==10){
    System.out.print(c);
   }else{
    System.out.print(c+", ");
   }
   c++;
  }while(c<11);
 }
}