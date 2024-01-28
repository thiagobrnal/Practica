/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argprograma.orm;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import java.util.List;
import com.j256.ormlite.table.DatabaseTable;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.jdbc.JdbcPooledConnectionSource;
import java.sql.SQLException;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author mcasatti
 */
@DatabaseTable(tableName = "cursos")
public class Curso {

    @DatabaseField(id = true)
    @Getter
    @Setter
    private String Codigo;
    @DatabaseField(canBeNull = false)
    @Getter
    @Setter
    private int Capacidad;

    JdbcPooledConnectionSource connSrc;
    Dao<Curso, Long> cursosDao;

    public Curso() throws SQLException {
        // Crear el connectionSource y los Dao que necesite
        connSrc = new JdbcPooledConnectionSource("jdbc:sqlite:academico.sqlite");
        cursosDao = DaoManager.createDao(connSrc, Curso.class);
    }

    public Curso(String codigo, int capacidad) throws SQLException {
        this.Codigo = codigo;
        this.Capacidad = capacidad;
        // Crear el connectionSource y los Dao que necesite
        connSrc = new JdbcPooledConnectionSource("jdbc:sqlite:academico.sqlite");
        cursosDao = DaoManager.createDao(connSrc, Curso.class);
    }

    public int inscriptos() throws SQLException {
        // Creo un Dao de Inscripciones, para contarlas
        Dao<Inscripcion, Long> inscDao = DaoManager.createDao(connSrc, Inscripcion.class);
        List<Inscripcion> inscripciones = inscDao.queryBuilder()
                                            .where()
                                            .eq("Curso_id", this.Codigo)
                                            .query();
        return inscripciones.size();
    }
    
    public int plazas_disponibles() throws SQLException {
        return this.Capacidad - this.inscriptos();
    }

    @Override
    public String toString() {
        return String.format("%s - Capacidad: %d", this.Codigo, this.Capacidad);
    }
}
