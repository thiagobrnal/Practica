import java.util.Scanner;
public class Java18{
 public static void main(String args[]){

  Scanner s = new Scanner(System.in);

  String palabraOrig = "", palabraSub = "";  
  int tam = 0, desde = 0, hasta = 0;

  System.out.print("Ingerese una cadena de caracteres: ");
  palabraOrig = s.nextLine();

  tam = palabraOrig.length();

  System.out.println("La cadena de caracteres "+palabraOrig+ " posee "+tam+ " caracteres.");

 

  System.out.print("Desde que caracter desea obtener la nueva cadena: ");
  desde = s.nextInt();
  System.out.print("Hasta que caracter desea obtener la nueva cadena: ");
  hasta = s.nextInt();

  palabraSub = palabraOrig.substring(desde, hasta);
  System.out.println("La nueva cadena es: "+palabraSub);
 }
}