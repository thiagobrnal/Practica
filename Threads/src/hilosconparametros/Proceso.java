
package hilosconparametros;


public class Proceso extends Thread{
    
    int num_int;
    
    public Proceso(String nombreHilo){
        
        super(nombreHilo);
    }
    
    @Override
    public void run(){
        for (int i = 0; i <= num_int; i++) {
            System.out.println(i + this.getName());
        }
        System.out.println("");
    }
    
    public void ValCondicion(int num){
        
        this.num_int = num;
    }
}
