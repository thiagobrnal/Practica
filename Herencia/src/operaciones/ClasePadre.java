
package operaciones;
import java.util.Scanner;
        
public class ClasePadre {
    protected int val1, val2, resultado;
    Scanner s = new Scanner(System.in);
    
    //Este metodo pide los datos al usuario
    public void PedirDatos(){
        
        System.out.print("\nIngrese el primer valor: ");
        val1 = s.nextInt();
        
        System.out.print("Ingrese el segundo valor: ");
        val2 = s.nextInt();
    }
    
    //Este metodo muestra el resultado
    
    public void MostrarDatos(){
    
        System.out.println(resultado);
    }
}
