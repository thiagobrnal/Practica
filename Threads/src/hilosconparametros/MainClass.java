
package hilosconparametros;


public class MainClass {
    
    public static void main(String[] args) {
        
        Proceso hilo1 = new Proceso(" hilo1");
        Proceso hilo2 = new Proceso(" hilo2");
        Proceso hilo3 = new Proceso(" hilo3");
        
        hilo1.ValCondicion(5);
        hilo2.ValCondicion(10);
        hilo3.ValCondicion(6);
        
        hilo1.start();
        hilo2.start();
        hilo3.start();
    }
}
