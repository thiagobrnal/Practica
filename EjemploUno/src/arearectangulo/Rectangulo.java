
package arearectangulo;


public class Rectangulo {
    
    private int base, altura, area;
   
    public Rectangulo(int vBase, int vAlt){
     
        this.base = vBase;
        this.altura = vAlt;
    }
    
    public void Operacion(){
        
        area = base*altura;
    }
    
    public void Imprimir(){
        Operacion();
        System.out.println("El area de un rectangulo de base "+base+" y altura "+altura+" es: "+area);
    }
}
