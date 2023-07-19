package modelo;

import java.util.Set;
import javax.persistence.*;
import persistencia.Persistencia;

@Entity
public class Coatic {
    
    @Id
    private Long id;
    
    private String nombre;
    
    private static Persistencia persistencia;
    
    //Coatic conoce a todoas las areas a
    @OneToMany(mappedBy = "coatic")
    private Set<Area> areas;
    
    //Constructor nulo {necesario}
    public Coatic(){
    }
    
    //Contructir con parametros
    public Coatic(Long id, String nombre){
        this.id = id;
        this.nombre = nombre;
        
        //Cuando se construye el CoaticDB
        //Se guarda en la base de datos a si mismo
        Coatic.persistencia.insertar(this);
    }

    static {
        persistencia = new Persistencia();
   
    }
    
    public static Persistencia getPersistencia(){
        return persistencia;
    }
    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public Set<Area> getAreas(){
        return this.areas;
    }
    
    public void setAreas(Set<Area> areas){
        this.areas = areas;
    }
    
    
}