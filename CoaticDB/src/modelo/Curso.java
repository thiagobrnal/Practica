package modelo;

import javax.persistence.*;
import java.util.*;

@Entity
public class Curso {

    @Id
    @SequenceGenerator(name = "sec_curso", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sec_curso")
    private Long id;

    private String nombre;

    private int meses;

    @Temporal(javax.persistence.TemporalType.DATE)
    private Date inicio;

    private boolean presencial;

    //muchos cursos se relacionan con el mismo area
    @ManyToOne(cascade = CascadeType.REFRESH)
    private Area area;
    
    //Muchos cursos se relacionan con muchos alumnos
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "alumno_curso",//nombre tabla intermedia
            joinColumns = @JoinColumn(name = "id_curso"),//nombre de la fila de id cursos
            inverseJoinColumns = @JoinColumn(name = "id_alumno")//nombre de la fila de id alumnos (la cual es la inversa o la del otro lado de la tabla)
    )
    private Set<Alumno> alumnos;

    //muchas areas se relacionan con el mismo coatic
    @ManyToOne(cascade = CascadeType.REFRESH)
    private Coatic coatic;

    //Constructor nulo
    public Curso() {

    }

    //constructor con parametros
    public Curso(String nombre, Area area, Coatic c) {
        this.nombre = nombre;
        this.area = area;
        this.coatic = c;

    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMeses() {
        return meses;
    }

    public void setMeses(int meses) {
        this.meses = meses;
    }

    public Date getInicio() {
        return inicio;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public boolean isPresencial() {
        return presencial;
    }

    public void setPresencial(boolean presencial) {
        this.presencial = presencial;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }
    
    @Override
    public String toString(){
        return this.getNombre();
    }
}
