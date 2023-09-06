
package funciones;


public class Boleta {
    
    public int numV, c1 = 0;
    public float importe, acu1 = 0;
    
    
    public void Agregar(int numV, float importe){
        if (numV == 1) {
            acu1 += importe;
            c1++;
        }else{
            System.out.println("ese vendedor no esta registrado");
        }
    }
    
    public void Descontar(int numV, float importe){
        if (numV == 1) {
            acu1 -= importe;
            c1--;
        }else{
            System.out.println("ese vendedor no esta registrado");
        }
    }
    
    
    
}
