package polimorfismo;

public class Main {

    public static void main(String[] args) {
        Opeaciones sum = new Suma();
        sum.PedirDatos();
        sum.Operaciones();
        sum.MostrarDatos();
        
        Opeaciones res = new Resta();
        res.PedirDatos();
        res.Operaciones();
        res.MostrarDatos();
    }
}
