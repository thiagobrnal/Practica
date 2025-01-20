package lambdaTest;

public class Cuadrado implements IArea {

    public String color;

    public Cuadrado(){}

    public void calcArea(int a, int b) {
        System.out.println(a*b);
    }
}
