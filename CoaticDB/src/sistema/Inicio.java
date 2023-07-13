package sistema;

import modelo.CoaticDB;
import modelo.Area;

public class Inicio {
    public static void main(String[] args) {
        
        CoaticDB c = (CoaticDB) CoaticDB.getPersistencia().Buscar(CoaticDB.class,1L);
        
        if (c == null) 
            c = new CoaticDB(1L,"Red Coatic");
        
        Area a1 = new Area("Programacion",c);
        Area a2 = new Area("Marketing",c);
        CoaticDB.getPersistencia().Insertar(a1);
        CoaticDB.getPersistencia().Insertar(a2);
    }
}
