 package modelo;

import java.util.Set;
import javax.persistence.*;

@Entity
public class Area {

    @Id
    @SequenceGenerator(name = "sec_area", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sec_area")
    private Long id;

    private String nombre;
    
    //El area conoce a muchos cursos
    @OneToMany(mappedBy = "area", fetch = FetchType.EAGER)
    private Set<Curso> cursos;

    //muchas areas se relacionan con el mismo coatic
    @ManyToOne(cascade = CascadeType.REFRESH)
    private Coatic coatic;

    //Constructor nulo
    public Area() {

    }

    //constructor con parametros
    public Area(String nombre, Coatic c) {
        this.nombre = nombre;
        this.coatic = c;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    public void quitarCurso(Curso curso) {
        this.getCursos().remove(curso);
    }
    
    public void agregarCurso(Curso curso) {
        this.getCursos().add(curso);
    }
    
    @Override
    public String toString(){
        return this.getNombre();
    }

    
    public Set<Curso> getCursos() {
        return cursos;
    }

   
    public void setCursos(Set<Curso> cursos) {
        this.cursos = cursos;
    }
}