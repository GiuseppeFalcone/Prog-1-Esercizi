import java.util.Arrays;

public class EsercizioUnoTest {
  

  public static void main (String[] args) {
    int[][] out0 = {};
    System.out.println(Arrays.deepEquals(EsercizioUno.matrice(0,0),out0));
    
    int[][] out1 = {};
    System.out.println(Arrays.deepEquals(EsercizioUno.matrice(0,1),out1));
    
    int[][] out2 = {{}};
    System.out.println(Arrays.deepEquals(EsercizioUno.matrice(1,0),out2));
    
    int[][] out3 = {{0}};
    System.out.println(Arrays.deepEquals(EsercizioUno.matrice(1,1),out3));
    
    int[][] out4 = {{0,1,2}
                   ,{1,2,3}};
    System.out.println(Arrays.deepEquals(EsercizioUno.matrice(2,3),out4));    

    int[][] out5 = {{0,1}
                   ,{1,2}
                   ,{2,3}};
    System.out.println(Arrays.deepEquals(EsercizioUno.matrice(3,2),out5));    
  }
}