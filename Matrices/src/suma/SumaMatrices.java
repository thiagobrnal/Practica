
package suma;


public class SumaMatrices {
    public static void main(String[] args) {
        
        
        int M1[][] = new int [3][3]; 
        int M2[][] = new int [3][3]; 
        int Res[][] = new int [3][3]; 
        
        //Llenado de la primer matriz
        for (int i = 0; i < M1.length; i++) {
            for (int j = 0; j < M1.length; j++) {
                M1[i][j] =(int)( Math.random() * 5);
            }
            
        }
        
        //Llenado de la segunda matriz
        for (int i = 0; i < M2.length; i++) {
            for (int j = 0; j < M2.length; j++) {
                M2[i][j] =(int)( Math.random() * 5);
            }
        }
        
        //Suma o resta de matrices
        for (int i = 0; i < M1.length; i++) {
            for (int j = 0; j < M1.length; j++) {
                Res[i][j] = M1[i][j] + M2[i][j];
                //Res[i][j] = M1[i][j] - M2[i][j];
            }
            
        }
        
        
        //Imprimiendo matrices
        for (int i = 0; i < M1.length; i++) {
            
            for (int j = 0; j < M1.length; j++) {
                System.out.print("[ "+M1[i][j]+" ]");
            }
            if (i == 1) {
                System.out.print("  +  ");
            }else  {
                System.out.print("     ");
            }
            
            
            for (int j = 0; j < M2.length; j++) {
                System.out.print("[ "+M2[i][j]+" ]");
            }
            
            if (i == 1) {
                System.out.print("  =  ");
            }else  {
                System.out.print("     ");
            }
            
            for (int j = 0; j < Res.length; j++) {
                System.out.print("[ " +Res[i][j]+ " ]");
            }
            System.out.println("");
        }
    }
}
