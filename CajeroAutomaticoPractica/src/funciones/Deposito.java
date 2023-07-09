
package funciones;

public class Deposito extends CajeroAutomatico{

    @Override
    public void Transaccion() {
        System.out.println("Cuanto desea ingresar a su cuenta");
        DepositoP();
        
        if (deposito>0) {
            transaccion = getSaldo();
            setSaldo(transaccion + deposito);
            System.out.println("------------------------------------");
            System.out.println("Usted depositó : $"+deposito);
            System.out.println("Su saldo actual es de: $"+getSaldo());
            System.out.println("------------------------------------");
            
        }else{
            System.out.println("------------------------------------");
            System.out.println("Este deposito no es valido");
            System.out.println("------------------------------------");
        }
    }
    
    
}
