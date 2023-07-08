
/*
 *Clase para las funciones logicas de una lavadora
*/
package Library;

/*
 *BlockWizard
*/
public class LLFunciones {
    
    private int kilos = 0, tipoDeRopa = 0, llenadoCompleto = 0, lavadoCompleto = 0, secadoCompleto = 0;
    
    public LLFunciones(int kilos, int tipoDeRopa){
    
        this.kilos = kilos;
        this.tipoDeRopa = tipoDeRopa;
    }
    
    //Funcion de llenado, verifica que el peso sea el adecuado
    private void Llenado(){
    
        if (kilos <= 12) {
            llenadoCompleto = 1;
            System.out.println("Llenando...");
            System.out.println("Llenado completo.");
        }else{
            System.out.println("La carga de ropa es muy pesada, reduce la carga.");
        }
    }
    
    //Funcion de Lavado verifica el tipo de ropa y lo lava
    private void Lavado(){
    
        Llenado();
        if (llenadoCompleto == 1) {
            if (getTipoDeRopa() == 1) {
                System.out.println("Ropa blanca / Lavado suave");
                System.out.println("Lavando...");
                lavadoCompleto = 1;
            }else if (getTipoDeRopa() == 2) {
                System.out.println("Ropa de color / Lavado intenso");
                System.out.println("Lavando...");
                lavadoCompleto = 1;
            }else{
                System.out.println("El tipo de ropa no esta disponible.");
                System.out.println("Se lavará como ropa de color / Lavado intensivo");
                lavadoCompleto = 1;
            }
 
        }
    }
    
    //Funcion de Secado verifica que el lavado finalizo para secarlo
    private void Secado(){
        
        Lavado();
        if (lavadoCompleto == 1) {
            System.out.println("Secando...");
            secadoCompleto = 1;
        }
    }
    
    public void CicloFinalizado(){
    
        Secado();
        if (secadoCompleto == 1) {
            System.out.println("Tu ropa está lista.");
        }
    }

    /**
     * @return the tipoDeRopa
     */
    public int getTipoDeRopa() {
        return tipoDeRopa;
    }

    /**
     * @param tipoDeRopa the tipoDeRopa to set
     */
    public void setTipoDeRopa(int tipoDeRopa) {
        this.tipoDeRopa = tipoDeRopa;
    }

    
}
