package polimorfismo;

import java.util.Scanner;

public abstract class Opeaciones {

    Scanner s = new Scanner(System.in);
    protected int val1, val2, res;

    public void PedirDatos() {

        System.out.print("insert the firs number: ");
        val1 = s.nextInt();

        System.out.print("insert the second number: ");
        val2 = s.nextInt();
    }
    
    public abstract void Operaciones();
    
    public void MostrarDatos(){
        
        System.out.println(res);
    }
}
