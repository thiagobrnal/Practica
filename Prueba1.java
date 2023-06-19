import java.util.Scanner;

public class Prueba1{
 public static void main(String args[]){

 Scanner s = new Scanner(System.in);
 String contra;
 do{
	System.out.println("ingrese la contraseña: ");
	contra = s.nextLine();
	if(!("hola".equals(contra))){
	 System.out.println("Contraseña incorrecta");
	}
 }while(!("hola".equals(contra)));

 System.out.print("Bienvenido");
 }
}