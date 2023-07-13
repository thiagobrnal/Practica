
package modelo;

import javax.persistence.*;

@Entity
public class Area {
     
    @Id
    @SequenceGenerator(name = "sec_area", initialValue=1, allocationSize=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="sec_area")
    private Long id;
    
    private String nombre;
    
    //muchas areas se relacionan con el mismo coatic
    @ManyToOne(cascade = CascadeType.REFRESH)
    private CoaticDB coatic;
    
    //Constructor nulo
    public Area(){
        
    }
    
    //constructor con parametros
    public Area(String nombre, CoaticDB coatic){
        this.nombre = nombre;
        this.coatic = coatic;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
}

