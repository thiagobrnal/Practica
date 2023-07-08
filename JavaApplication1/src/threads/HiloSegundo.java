
package threads;


public class HiloSegundo implements Runnable{
    
    static Integer i;
    
    public HiloSegundo(Integer i){
        this.i = i;
    }

    @Override
    public void run() {
        for (int x = 0; x < 10000; x++) {
            
            System.out.println("i -->"+ ++i);
        }
    }
    
    public static void main(String[] args) {
        i = 0;
        
        Thread hilo1 = new Thread(new HiloSegundo(i));
        Thread hilo2 = new Thread(new HiloSegundo(i));
        
        hilo1.start();
        hilo2.start();
    }
}
