/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argprograma.orm;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author mcasatti
 */

@DatabaseTable(tableName="notas")
public class Nota {
    @DatabaseField(foreign=true,canBeNull=false)
    @Getter @Setter private Alumno Alumno;
    @DatabaseField(foreign=true,canBeNull=false)
    @Getter @Setter private Materia Materia;
    @DatabaseField(canBeNull=false)
    @Getter @Setter private String Tipo;
    @DatabaseField(canBeNull=false)
    @Getter @Setter private Integer Nota;
    
    public Nota() {};
    
    public Nota(Alumno alumno, Materia materia, String tipo, Integer nota) {
        this.Alumno = alumno;
        this.Materia = materia;
        this.Tipo = tipo;
        this.Nota = nota;
    }
    
    @Override
    public String toString() {
        return String.format("%s - Materia: %s [%s : %s] ",
                this.Alumno.getLegajo(), 
                this.Materia.getCodigo(), 
                this.getTipo(), 
                this.getNota()
        );
    }
}
