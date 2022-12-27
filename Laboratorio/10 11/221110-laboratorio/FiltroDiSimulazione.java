import java.util.Arrays;

/** Dati un *array* `a` e un valore `v`, restituisce un *array* i cui elementi sono quelli di `a` strettamente inferiori a `v`, percorrendo una sola volta  `a`. */

public class FiltroDiSimulazione {

  public static void main (String[] args) {    
    int[] a3 = {1,2,1,1,2};
    int[] out3 = {1,1,1};
    System.out.println(Arrays.equals(filtro(a3,2),out3));
  }

  public static int[] append(int[] a, int[] b) {
    int[] c = new int[a.length+b.length];

    for (int i = 0; i < a.length; i++ ) { // scrive a in c
      c[i] = a[i];
    }
    
    for (int i = 0; i < b.length; i++ ) { // scrive b in c
      c[a.length+i] = b[i];
    }
    
    return c;
  }    
   
  public static int[] filtro(int[] a, int v) {
    int[] r = a;
    if (a != null && a.length > 0) {
        r = filtro(a,v,0,a.length);   
    }
    return r;
  }  
  
  public static int[] filtro(int[] a, int v, int i, int j) {
    if (i+1 == j) {
      if (a[i] < v) {
        return new int[] {a[i]};
      } else {
        return new int[] {};
      }
    } else {
      int m = (i+j)/2;
      int[] arraySx = filtro(a, v, i, m);
      int[] arrayDx = filtro(a, v, m, j);
      return append(arraySx,arrayDx);
    }
  }  
}