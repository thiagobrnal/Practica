public class Java16{
 public static void main(String args[]){

  int a = 0, b = 1, aux = 0,i;
 
  System.out.println("Serie con for: ");
  for(i = 1; i<=10;i++){
   if(i<10){
    System.out.print(a + ", ");
   }else{
    System.out.print(a);
   }
    aux = a + b;
    a = b;
    b = aux;
  }

 a = 0; b = 1; aux = 0; i = 1;
 System.out.println("\nSerie con while: ");
 while(i<11){
  if(i<10){
    System.out.print(a + ", ");
   }else{
    System.out.print(a);
   }
    aux = a + b;
    a = b;
    b = aux;
   i++;
 }

 a = 0; b = 1; aux = 0; i = 1;
 System.out.println("\nSerie con do-while: ");
 do{
  if(i<10){
    System.out.print(a + ", ");
   }else{
    System.out.print(a);
   }
    aux = a + b;
    a = b;
    b = aux;
   i++;
 }while(i<11);
 }
}