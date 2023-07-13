package mulripicacion;

public class MultiplicacionMatrices {

    public static void main(String[] args) {

        int M1[][] = new int[2][3];
        int M2[][] = new int[3][2];
        int Res[][] = new int[2][2];
        int acu = 0;

        //Carga matriz 1
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                M1[i][j] = (int) (Math.random() * 5);
            }
        }
        //Carga matriz 2
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                M2[i][j] = (int) (Math.random() * 5);
            }
        }
        //Resultados
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                acu = 0;
                for (int k = 0; k < 3; k++) {

                    acu += M1[i][k] * M2[k][j];
                    
                    if (k == 2) {
                        Res[i][j] = acu;
                        
                    }
                }
                
            }
        }

        //imprimir
        for (int i = 0; i < 3; i++) {

            if (i < 2) {
                for (int j = 0; j < 3; j++) {
                    System.out.print("[ " + M1[i][j] + " ]");
                }
                if (i == 1) {
                    System.out.print("   x   ");
                } else {
                    System.out.print("       ");
                }
            } else {
                System.out.print("                      ");
            }

            for (int j = 0; j < 2; j++) {
                System.out.print("[ " + M2[i][j] + " ]");
            }
            if (i == 1) {
                System.out.print("   =   ");
            } else {
                System.out.print("       ");
            }

            if (i < 2) {
                for (int j = 0; j < 2; j++) {
                    System.out.print("[ " + Res[i][j] + " ]");
                }
            }

            System.out.println("");
        }
    }
}
