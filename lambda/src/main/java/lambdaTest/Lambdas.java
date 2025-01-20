package lambdaTest;

public class Lambdas {
    public static void main(String[] args) {

        IArea cuad = ((int a, int b) -> {System.out.println(a*b); });
        IArea tria = ((int a, int b) -> {System.out.println((a*b)/2);});

        cuad.calcArea(5,5);
        tria.calcArea(5,5);

    }


}
