
package ejemplos;


public class FuncionesTrigonometricas {
    public static void main(String args[]) {
        
        //sacar seno, coseno y tangente
        //la consigna especifica que "los grados se pasan a radianes para sacar los funciones trigonometricas"
        
        double resultado = 0;
        double anguloEnGrados = 45;
        double anguloEnRadianes = Math.toRadians(anguloEnGrados);
        
        //Seno
        resultado = Math.sin(anguloEnRadianes);
        System.out.println("Seno de "+anguloEnGrados+"° = "+resultado);
        
        //Coseno
        resultado = Math.cos(anguloEnRadianes);
        System.out.println("Coseno de "+anguloEnGrados+"° = "+resultado);
        
        //Tangente
        resultado = Math.tan(anguloEnRadianes);
        System.out.println("Tan de "+anguloEnGrados+"° = "+resultado);
        
        
        double valorIngresado = 0.707;
        
        //Arco coseno
        anguloEnRadianes = Math.acos(valorIngresado);
        anguloEnGrados = Math.toDegrees(anguloEnRadianes);
        System.out.println("Arco coseno de "+valorIngresado+" = "+anguloEnGrados+"°");
        
        //Arco seno
        anguloEnRadianes = Math.asin(valorIngresado);
        anguloEnGrados = Math.toDegrees(anguloEnRadianes);
        System.out.println("Arco seno de "+valorIngresado+" = "+anguloEnGrados+"°");
        
        //Arco tangente
        anguloEnRadianes = Math.atan(valorIngresado);
        anguloEnGrados = Math.toDegrees(anguloEnRadianes);
        System.out.println("Arco tangente de "+valorIngresado+" = "+anguloEnGrados+"°");
        
        
    }
}
