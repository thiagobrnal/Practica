/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argprograma.orm;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcPooledConnectionSource;
import com.j256.ormlite.table.TableUtils;
import static java.lang.Math.random;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author mcasatti
 */
public class SistemaAcademico {
    ArrayList<Curso> Cursos;
    ArrayList<Alumno> Alumnos;
    ArrayList<Materia> Materias;
    ArrayList<Nota> Notas;
    ArrayList<Inscripcion> Inscripciones;
    
    Dao<Alumno,Long> alumnosDao;
    Dao<Curso,Long> cursosDao;
    Dao<Inscripcion,Long> inscripcionesDao;
    Dao<Materia,Long> materiasDao;
    Dao<Nota,Long> notasDao;  
    
    JdbcPooledConnectionSource connectionSource;
    
    public SistemaAcademico() throws SQLException {
        connectionSource = new JdbcPooledConnectionSource("jdbc:sqlite:academico.sqlite");
        ConfigurarTablas();
        ConfigurarDao();
        CargarAlumnos();
        CargarCursos();
        CargarMaterias();
        CargarNotas();
        CargarInscripciones();
    }    
    
    private void ConfigurarTablas () throws SQLException {
        TableUtils.dropTable(connectionSource, Alumno.class, true);
        TableUtils.createTableIfNotExists(connectionSource, Alumno.class);
        TableUtils.dropTable(connectionSource, Curso.class, true);
        TableUtils.createTableIfNotExists(connectionSource, Curso.class);
        TableUtils.dropTable(connectionSource, Inscripcion.class, true);
        TableUtils.createTableIfNotExists(connectionSource, Inscripcion.class);
        TableUtils.dropTable(connectionSource, Materia.class, true);
        TableUtils.createTableIfNotExists(connectionSource, Materia.class);
        TableUtils.dropTable(connectionSource, Nota.class, true);
        TableUtils.createTableIfNotExists(connectionSource, Nota.class);
    }
    
    private void ConfigurarDao() throws SQLException {
        alumnosDao = DaoManager.createDao(connectionSource,Alumno.class);
        cursosDao = DaoManager.createDao(connectionSource,Curso.class);
        inscripcionesDao = DaoManager.createDao(connectionSource,Inscripcion.class);
        materiasDao = DaoManager.createDao(connectionSource,Materia.class);
        notasDao = DaoManager.createDao(connectionSource,Nota.class);       
    }
    
    private void CargarAlumnos() throws SQLException {
        ArrayList<Alumno> tmpAlumnos = new ArrayList<Alumno>();
        tmpAlumnos.add(new Alumno("Martin Casatti","26207"));
        tmpAlumnos.add(new Alumno("Ivan Casatti","26307"));
        tmpAlumnos.add(new Alumno("Analia Guzman","85678"));
        tmpAlumnos.add(new Alumno("Julio Sosa","98645"));
        alumnosDao.create(tmpAlumnos);
    }
    
    private void CargarCursos() throws SQLException {
        ArrayList<Curso> tmpCursos = new ArrayList<Curso>();
        tmpCursos.add(new Curso("1K1",120));
        tmpCursos.add(new Curso("1K2",120));
        tmpCursos.add(new Curso("2K1",95));
        cursosDao.create(tmpCursos);
    }
    
    private void CargarMaterias() throws SQLException {
        ArrayList<Materia> tmpMaterias = new ArrayList<Materia>();
        tmpMaterias.add(new Materia("Programación 1","PRG",8));
        tmpMaterias.add(new Materia("Testing","TST",7));
        tmpMaterias.add(new Materia("Paradigmas","PPR",8));
        materiasDao.create(tmpMaterias);
    }
    
    private void CargarNotas() throws SQLException {
        ArrayList<Alumno> alumnos = (ArrayList<Alumno>) alumnosDao.queryForAll();
        ArrayList<Materia> materias = (ArrayList<Materia>) materiasDao.queryForAll();
        ArrayList<Nota> notas = new ArrayList<Nota>();
        
        Random rn = new Random();
        for (Alumno alumno : alumnos) {
            for (Materia materia : materias) {
                int nota1 = rn.nextInt(10);
                int nota2 = rn.nextInt(10);
                Nota n1 = new Nota(alumno,materia,"PARC1",nota1);
                Nota n2 = new Nota(alumno,materia,"PARC2",nota2);
                notas.add(n1);
                notas.add(n2);
            }
        }
        notasDao.create(notas);
    }
    
    private void CargarInscripciones() throws SQLException {
        
        Curso c1 = new Curso("1K1",120);
        Curso c2 = new Curso("1K2",120);
        
        Alumno a1 = new Alumno("Martin Casatti","26207");
        Alumno a2 = new Alumno("Ivan Casatti","26307");
        Alumno a3 = new Alumno("Analia Guzman","85678");
        
        Inscripcion ins1 = new Inscripcion(c1,a1);
        Inscripcion ins2 = new Inscripcion(c1,a2);
        Inscripcion ins3 = new Inscripcion(c2,a3);
        
        inscripcionesDao.create(ins1);
        inscripcionesDao.create(ins2);
        inscripcionesDao.create(ins3);   
    }
    
    private void MostrarDatosEjemplo() throws SQLException {
        // Ahora vamos a hacer algunas consultas antes de irnos
        // Buscar todos los alumnos
        List<Alumno> alumnos = alumnosDao.queryForAll();
        System.out.println("--- Listado de alumnos ---");
        alumnos.forEach(
                (a) -> System.out.println(a)
        );
        
        // Buscar los cursos que terminen con K1
        List<Curso> cursos = cursosDao.queryBuilder()
                .where()
                .like("Codigo", "2%")
                .query();
        System.out.println("--- Cursos ?K1 ---");
        cursos.forEach(
                (c) -> System.out.println(c)
        );
        
        cursos = cursosDao.queryForAll();
        for (Curso curso : cursos) {
            System.out.println (
            String.format("El curso %s tiene %d inscriptos y %d plazas disponibles de un total de %d", 
                    curso.getCodigo(),curso.inscriptos(),curso.plazas_disponibles(), curso.getCapacidad()));
        }
    }
    
    public void Simular () throws SQLException {
        MostrarDatosEjemplo();
    }
}
