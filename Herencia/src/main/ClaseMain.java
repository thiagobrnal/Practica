package main;
import operaciones.ClaseHijaSuma;
import operaciones.ClaseHijaResta;

public class ClaseMain {

    public static void main(String[] args) {
        
        ClaseHijaSuma suma = new ClaseHijaSuma();
        suma.PedirDatos();
        suma.Suma();
        suma.MostrarDatos();
        
        ClaseHijaResta resta = new ClaseHijaResta();
        resta.PedirDatos();
        resta.Restar();
        resta.MostrarDatos();
    }
}
