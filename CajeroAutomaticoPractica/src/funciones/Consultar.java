
package funciones;


public class Consultar extends CajeroAutomatico{
    
    @Override
    public void Transaccion(){
        System.out.println("------------------------------------");
        System.out.println("Tu saldo actual es; $"+ getSaldo());
        System.out.println("------------------------------------");
    }
}
