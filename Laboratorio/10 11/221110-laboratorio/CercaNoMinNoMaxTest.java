import java.util.Arrays;

/** Dati un *array*  `a` ed un valore `v`, restituire un *array* con tutti gli indici, tranne quello di valore minimo e di valore massimo, degli elementi di `a` che contengono `v`. `E possibile visitare più volte l'*array* `a`  */

public class CercaNoMinNoMaxTest {
  
  public static void main (String[] args) {
    int[] in0 = {2};
    int[] out0 = {};
    System.out.println(Arrays.equals(CercaNoMinNoMax.cerca(in0, 2),out0));

    int[] in1 = {2,2};
    int[] out1 = {};
    System.out.println(Arrays.equals(CercaNoMinNoMax.cerca(in1, 2),out1));

    int[] in2 = {2,2,2};
    int[] out2 = {1}; // indice all'occorenza centrale di 2
    System.out.println(Arrays.equals(CercaNoMinNoMax.cerca(in2, 2),out2));

     int[] in3 = {0,2,0,0,2,2,0,0};
    int[] out3 = {4}; // indice alla sola occorenza centrale di 2
    System.out.println(Arrays.equals(CercaNoMinNoMax.cerca(in3, 2),out3));

    int[] in4 = {0,2,0,0,2,0,2,0,2,0,0};
    int[] out4 = {4,6}; // indici alle due occorenze centrali di 2
    System.out.println(Arrays.equals(CercaNoMinNoMax.cerca(in4, 2),out4));
  }
}