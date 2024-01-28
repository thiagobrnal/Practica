/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argprograma.orm;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.table.DatabaseTable;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.jdbc.JdbcPooledConnectionSource;
import java.sql.SQLException;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

 /*
 * @author mcasatti
 */
@DatabaseTable(tableName="alumnos")
public class Alumno {
    @DatabaseField(canBeNull=false)
    @Getter @Setter private String Nombre;
    
    @DatabaseField(canBeNull=false,id=true,unique=true)
    @Getter @Setter private String Legajo;
    
    JdbcPooledConnectionSource connSrc;
    Dao<Alumno, Long> alumnosDao;
    
    public Alumno () throws SQLException {
        // Crear el connectionSource y los Dao que necesite
        this.connSrc = new JdbcPooledConnectionSource("jdbc:sqlite:academico.sqlite");
        this.alumnosDao = DaoManager.createDao(connSrc, Alumno.class);
    }
    
    public Alumno(String nombre, String legajo) throws SQLException {
        this.Nombre = nombre;
        this.Legajo = legajo;
        // Crear el connectionSource y los Dao que necesite
        this.connSrc = new JdbcPooledConnectionSource("jdbc:sqlite:academico.sqlite");
        this.alumnosDao = DaoManager.createDao(connSrc, Alumno.class);
    }
        
    @Override
    public String toString() {
        return String.format("N:%s - L:[%s]",this.Nombre, this.Legajo);
    }
}
