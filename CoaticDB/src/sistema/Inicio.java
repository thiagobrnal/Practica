package sistema;

import modelo.Coatic;
import modelo.Area;
import java.util.*;
import vistas.Principal;

public class Inicio {

    public static void main(String[] args) {

        Coatic c = (Coatic) Coatic.getPersistencia().buscar(Coatic.class, 1L);

        if (c == null) {
            c = new Coatic(1L, "Red Coatic");
        }
        
        Area a1 = new Area("Programacion",c);
        Area a2 = new Area("Marketing",c);
        
       
        Coatic.getPersistencia().insertar(a1);
        Coatic.getPersistencia().insertar(a2);
        
        Principal ventana = new Principal(c);
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        
    }
       

}