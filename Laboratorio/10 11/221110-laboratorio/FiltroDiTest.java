import java.util.Arrays;

/** Dati un *array* `a` e un valore `v`, restituisce un *array* i cui elementi sono quelli di `a` strettamente inferiori a `v`, percorrendo una sola volta  `a`. */

public class FiltroDiTest {

  public static void main (String[] args) {
    int[] a0 = {};
    int[] out0 = {};
    System.out.println(Arrays.equals(FiltroDi.filtro(a0,2),out0));
    
    int[] a1 = {1};
    int[] out1 = {1};
    System.out.println(Arrays.equals(FiltroDi.filtro(a1,2),out1));
    
    int[] a2 = {2};
    int[] out2 = {};
    System.out.println(Arrays.equals(FiltroDi.filtro(a2,2),out2));
    
    int[] a3 = {1,2,1,1,2};
    int[] out3 = {1,1,1};
    System.out.println(Arrays.equals(FiltroDi.filtro(a3,2),out3));
  }
}