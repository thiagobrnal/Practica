
package funciones;


public class Retiro extends CajeroAutomatico{
    
    @Override
    public void Transaccion(){
        
        System.out.println("Cuanto desea retirar: ");
        RetiroP();
        
        if (retiro <= getSaldo() && retiro>0) {
            transaccion = getSaldo();
            setSaldo(transaccion - retiro);
            System.out.println("------------------------------------");
            System.out.println("Usted retiro: $"+retiro);
            System.out.println("Su saldo actual es de: $"+getSaldo());
            System.out.println("------------------------------------");
        }else{
            System.out.println("------------------------------------");
            System.out.println("Este retiro no es valido");
            System.out.println("------------------------------------");
        }
    }
}
