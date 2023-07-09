package funciones;

import java.util.Scanner;

public abstract class CajeroAutomatico {

    protected float retiro, deposito, transaccion;
    private static float saldo;
    Scanner s = new Scanner(System.in);
    
   public void Operaciones(){
       int seleccion = 0, bandera = 0;
       
       do {
           do {
               System.out.println("Por favor seleccione una operacion");
               System.out.println("1: para consultar");
               System.out.println("2: para retirar");
               System.out.println("3: para depositar");
               System.out.println("4: para salir");
               seleccion = s.nextInt();
               
               if (seleccion>=1 && seleccion<=4) {
                   bandera = 1;
               }else{
                   System.out.println("----------------------------------");
                   System.out.println("Esa opcion no es valida");
                   System.out.println("Favor de intentarlo nuevamente");
                   System.out.println("----------------------------------");
               }
               
           } while (bandera == 0);
           if (seleccion == 1) {
               //consultar saldo
               CajeroAutomatico mensajero = new Consultar();
               mensajero.Transaccion();
           }else if (seleccion == 2) {
               //retirar efectivo
               CajeroAutomatico mensajero = new Retiro();
               mensajero.Transaccion();
           }else if (seleccion == 3) {
               //depositar efectivo
               CajeroAutomatico mensajero = new Deposito();
               mensajero.Transaccion();
           }else if (seleccion == 4) {
               //sale del programa
               System.out.println("----------------------------------");
               System.out.println("     Gracias por elegirnos");
               System.out.println("----------------------------------");
               bandera = 2;
           }
  
       } while (bandera != 2);
   }
   
   public void RetiroP(){
       retiro = s.nextFloat();
   }
   
   public void DepositoP(){
       deposito = s.nextFloat();
   }
   
   public abstract void Transaccion();

    /**
     * @return the saldo
     */
    public float getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(float saldo) {
       this.saldo = saldo;
    }
   
}
