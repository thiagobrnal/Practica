/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argprograma.orm;

import com.j256.ormlite.table.DatabaseTable;
import com.j256.ormlite.field.DatabaseField;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
/**
 *
 * @author mcasatti
 */

@DatabaseTable(tableName="inscripciones")
public class Inscripcion {
    @DatabaseField(foreign=true,canBeNull=false)
    @Getter @Setter private Curso Curso;
    @DatabaseField(foreign=true,canBeNull=false)
    @Getter @Setter private Alumno Alumno;
    
    public Inscripcion() {};
    
    public Inscripcion(Curso curso, Alumno alumno) {
        this.Curso = curso;
        this.Alumno = alumno;
    }
}
