
package estadodeunhilo;


public class HiloProcces extends Thread{
    
    @Override
    public void run(){
        
        for (int i = 0; i <= 5; i++) {
            System.out.println(i+ ""+ getName());
            try{
                HiloProcces.sleep(1000);
            }catch(InterruptedException e){
                System.out.println("Error dentro de la clase "+e);
            }
            
        }
    }
}
