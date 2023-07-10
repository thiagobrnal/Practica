package estadodeunhilo;

public class ClasePrincipal {

    public static void main(String[] args) {
        //crea el hilo
        HiloProcces hiloA = new HiloProcces();
        HiloProcces hiloB = new HiloProcces();

        //estado Ejecutable
        hiloA.start();
        //blocked o not runnable
        try{
            hiloA.sleep(1000);
        }catch(InterruptedException e){ 
            System.out.println("Error en el hilo 1 "+e );
        }
        
        //estado Ejecutable
        hiloB.start();
        //estado muerto
        hiloB.stop();
        
        //blocked o not runnable
        try{
            hiloB.sleep(1000);
        }catch(InterruptedException e){
            System.out.println("Error en el hilo 2 "+e );
        }
        
    }

}
