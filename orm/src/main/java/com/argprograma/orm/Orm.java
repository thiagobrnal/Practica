/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.argprograma.orm;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcPooledConnectionSource;
import com.j256.ormlite.logger.Level;
import com.j256.ormlite.logger.Logger;
import com.j256.ormlite.table.TableUtils;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mcasatti
 */
public class Orm {
    
    public static void main(String[] args) throws SQLException, Exception {
        Logger.setGlobalLogLevel(Level.ERROR);
        System.out.println("Sistema de gestión de inscripciones");
        
        SistemaAcademico sa = new SistemaAcademico();
        sa.Simular();
    }
}
