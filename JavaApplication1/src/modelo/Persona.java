
package modelo;


public class Persona {
    
    private String nombre;
    private int edad;
    private double estatura;
    
    public Persona(){
    this.nombre = "thiago";
    this.edad = 19;
    this.estatura = 1.75;
    }
    
    //constructor con parametros
    public Persona(String nombre, int edad, double estatura){
    this.nombre = nombre;
    this.edad = edad;
    this.estatura = estatura;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the estatura
     */
    public double getEstatura() {
        return estatura;
    }

    /**
     * @param estatura the estatura to set
     */
    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }
    
   public void Imprimirpersona(){
       System.out.println("El nombre es "+this.getNombre());
       System.out.println("La edad es "+this.getEdad());
       System.out.println("La estatura es "+this.getEstatura());
   }
   
   @Override
    public String toString(){
        return "Hola " + nombre + " tu estatura es " + estatura + " y tu edad es " + edad;
    }
}
