public class Condicional{
  public static void main (String args[]){
    float mate = 6, bio = 8, quim = 7, prom = 0;
    prom = (mate + bio + quim)/3;
    
    if (prom >= 7){
      System.out.println("El alumno promocionó con "+prom);
    }else if(prom >= 4){
      System.out.println("El alumno regularizó con "+prom);
    }else{
      System.out.println("El alumno quedo libre con "+prom);
    }	
 } 
}