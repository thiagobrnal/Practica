
package factorial;


public class RecursividadFactorial {
    
    public int Factorial(int x){
        if (x > 0) {
            int valorCalculado = x * Factorial(x - 1);
            return valorCalculado;
        }
        return 1;
    }
}
