import java.util.Scanner;

public class java9{
public static void main(String args[]){

   Scanner s = new Scanner(System.in);

   
   System.out.println("\nBienvenido al sistema vacacional de Coca-Cola Company\n");

   System.out.println("Ingrese el nombre del trabajador");
   String nombre = s.nextLine();

   System.out.println("Indique cuantos años de servicio posee "+nombre);
   int tiempo = s.nextInt();

   System.out.println("Indique a que departamento pertenece "+nombre);
   System.out.println("1: Atención al Cliente");
   System.out.println("2: Logística");
   System.out.println("3: Gerencia");
   int dep = s.nextInt();


   if(dep == 1){
    if(tiempo <= 1){
     System.out.println(nombre+" tiene 6 días de vacaciones");
    }else if(tiempo >=2 && tiempo <=6){
     System.out.println(nombre+" tiene 14 días de vacaciones");
    }else if(tiempo >= 7){
     System.out.println(nombre+" tiene 20 días de vacaciones");
    }
   }else if(dep == 2){
    if(tiempo <= 1){
     System.out.println(nombre+" tiene 7 días de vacaciones");
    }else if(tiempo >=2 && tiempo <=6){
     System.out.println(nombre+" tiene 15 días de vacaciones");
    }else if(tiempo >= 7){
     System.out.println(nombre+" tiene 22 días de vacaciones");
    }
   }else if(dep == 3){
    if(tiempo <= 1){
     System.out.println(nombre+" tiene 10 días de vacaciones");
    }else if(tiempo >=2 && tiempo <=6){
     System.out.println(nombre+" tiene 20 días de vacaciones");
    }else if(tiempo >= 7){
     System.out.println(nombre+" tiene 30 días de vacaciones");
    }
   }else{
    System.out.println("La clave del departamento no es valida, por favor intente de nuevo");
   }
 }
}