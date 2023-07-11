
package ejemplos;

import java.util.Scanner;

public class Conversiones {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        //pasar de angulos a radianes y de radianes a angulos
        double anguloEnGrados;
        System.out.println("Ingrese el angulo en grados");
        anguloEnGrados = s.nextDouble();
        
        double anguloEnRadianes = Math.toRadians(anguloEnGrados);
        
        System.out.println("Deg a Rad "+anguloEnGrados+"° = "+anguloEnRadianes+" rad");
        anguloEnGrados = Math.toDegrees(anguloEnRadianes);
        System.out.println("Rad a Deg "+anguloEnRadianes+" rad = "+anguloEnGrados+"°");
    }
}
