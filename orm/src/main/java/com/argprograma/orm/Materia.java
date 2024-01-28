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

@DatabaseTable(tableName="materias")
public class Materia {
    @DatabaseField(canBeNull=false)
    @Getter @Setter private String Nombre;
    @DatabaseField(id=true)
    @Getter @Setter private String Codigo;
    @DatabaseField(columnName="promedio_promocion")
    @Getter @Setter private int PromedioPromocion;
    
    public Materia(){};
    
    public Materia (String nombre, String codigo, int promedioPromocion) {
        this.Nombre = nombre;
        this.Codigo = codigo;
        this.PromedioPromocion = promedioPromocion;
    }
    
    @Override
    public String toString() {
        return String.format("Materia: %s [%s] ",
                this.getNombre(), 
                this.getCodigo()
        );
    }
}
