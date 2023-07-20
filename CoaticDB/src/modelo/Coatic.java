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

    //Coatic conoce a todoas los alumnos 
    @OneToMany(mappedBy = "coatic")
    private Set<Alumno> alumnos;

    //Coatic conoce a todoas las areas 
    @OneToMany(mappedBy = "coatic")
    private Set<Area> areas;

    //Coatic conoce a todoas los cursos
    @OneToMany(mappedBy = "coatic")
    private Set<Curso> cursos;

    //Constructor nulo {necesario}
    public Coatic() {
    }

    //Contructir con parametros
    public Coatic(Long id, String nombre) {
        this.id = id;
        this.nombre = nombre;

        //Cuando se construye el CoaticDB
        //Se guarda en la base de datos a si mismo
        Coatic.persistencia.insertar(this);
    }

    static {
        persistencia = new Persistencia();

    }

    public static Persistencia getPersistencia() {
        return persistencia;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Area> getAreas() {
        return this.areas;
    }

    public void setAreas(Set<Area> areas) {
        this.areas = areas;
    }

    public Set<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(Set<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public Set<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(Set<Curso> cursos) {
        this.cursos = cursos;
    }

    //Coatic gestiona las areas
    public void crearArea(String nombre) {
        Area area = new Area(nombre, this);
        this.areas.add(area);
        //inserta el area en la base de datos
        Coatic.getPersistencia().insertar(area);
    }

    public void modificarArea(Area area, String nombre) {
        if (area != null) {
            area.setNombre(nombre);
            Coatic.getPersistencia().modificar(area);
        }
    }

    public void eliminarArea(Area area) {
        if (area != null) {
            Coatic.getPersistencia().eliminar(area);
        }
    }
}
