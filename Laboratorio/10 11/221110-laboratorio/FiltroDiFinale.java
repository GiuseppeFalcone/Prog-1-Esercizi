import java.util.Arrays;

/** Dati un *array* `a` e un valore `v`, restituisce un *array* i cui elementi sono quelli di `a` strettamente inferiori a `v`, percorrendo una sola volta  `a`. */

public class FiltroDiFinale {
  
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
      return AppendIt.append(arraySx,arrayDx);
    }
  }  
}