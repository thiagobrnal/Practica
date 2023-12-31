package modelo;

import java.util.*;
import javax.persistence.*;

@Entity
public class Alumno {

    @Id
    @SequenceGenerator(name = "sec_alumno", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sec_alumno")
    private Long id;

    private String nombre;

    private String dni;

    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaNacimiento;

    //muchos alumnos se relacionan con muchos cursos
    @ManyToMany(mappedBy = "alumnos", fetch = FetchType.EAGER)
    private Set<Curso> cursos;

    //muchas areas se relacionan con el mismo coatic
    @ManyToOne(cascade = CascadeType.REFRESH)
    private Coatic coatic;

    //Constructor nulo
    public Alumno() {

    }

    //constructor con parametros
    public Alumno(String nombre, Coatic c) {
        this.nombre = nombre;
        this.coatic = c;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public Set<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(Set<Curso> cursos) {
        this.cursos = cursos;
    }
    
  
    public void agregarCurso(Curso curso) {
        this.getCursos().add(curso);
    }
    
    @Override
    public String toString(){
        return this.getNombre();
    }
}
