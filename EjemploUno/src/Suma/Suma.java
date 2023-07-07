package Suma;

public class Suma {

    private int vUno, vDos, res;
    
    public Suma(int valorUno, int valorDos){
     this.vUno = valorUno;
     this.vDos = valorDos;
    }
    
    public void Operacion(){
        res = vUno + vDos;
    }
    
    public void Imrpimir(){
        Operacion();
        System.out.println("El resultado de la suma es: "+res);
    }
}
