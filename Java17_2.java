import java.util.Scanner;

public class Java17_2{
 public static void main(String args[]){
  
  Scanner s = new Scanner(System.in);

  String usuario = "", pass = "";

  while(!("user".equals(usuario)) || !("123".equals(pass))){
   System.out.println("Ingrese el usuario");
    usuario = s.nextLine();
   System.out.println("\nIngrese la contraseña");
    pass = s.nextLine();
   
    if(!("user".equals(usuario)) || !("123".equals(pass))){
     System.out.println("\nnombre de usuario o password incorrecto\n");
    }
  }

  System.out.println("\nInicio de sesion correcto");
 }
}