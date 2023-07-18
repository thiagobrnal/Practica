package sistema;

import modelo.Coatic;
//import modelo.Area;

public class Inicio {

    public static void main(String[] args) {

        Coatic c = (Coatic) Coatic.getPersistencia().buscar(Coatic.class, 1L);

        if (c == null) {
            c = new Coatic(1L, "Red Coatic");
        }
    }
    /*Area a1 = new Area("Programacion",c);
        Area a2 = new Area("Marketing",c);
        CoaticDB.getPersistencia().Insertar(a1);
        CoaticDB.getPersistencia().Insertar(a2);*/

}
