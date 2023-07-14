public class Java15_2{
 public static void main(String args[]){


  System.out.println("Ciclo for: ");
   int a = 100, b = 0;
  for(int i = 1; i<=10;i++){
   if(!(i==10)){
    if(i % 2 == 0){
     a--;
     System.out.print(a+", ");
    }else{
     b++;
     System.out.print(b+", ");
    }
   }else{
    if(i % 2 == 0){
     a--;
     System.out.print(a);
    }else{
     b++;
     System.out.print(b);
    }
   }
  }

  System.out.println("");
  System.out.println("\nCiclo while: ");
  int c = 1;
  while(c<=10){
   if(!(c==10)){
    if(c % 2 == 0){
     a--;
     System.out.print(a+", ");
    }else{
     b++;
     System.out.print(b+", ");
    }
   }else{
    if(c % 2 == 0){
     a--;
     System.out.print(a);
    }else{
     b++;
     System.out.print(b);
    }
   }
   c++;
  }


  System.out.println("");
  System.out.println("\nCiclo do-while: ");
  c = 1;
  do{
   if(!(c==10)){
    if(c % 2 == 0){
     a--;
     System.out.print(a+", ");
    }else{
     b++;
     System.out.print(b+", ");
    }
   }else{
    if(c % 2 == 0){
     a--;
     System.out.print(a);
    }else{
     b++;
     System.out.print(b);
    }
   }
   c++;
  }while(c<=10);


 }
}