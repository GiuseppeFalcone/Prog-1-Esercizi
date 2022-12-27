import java.util.Arrays;

/** Dati un *array* `a` e un valore `v`, restituisce un *array* i cui elementi sono quelli di `a` strettamente inferiori a `v`, percorrendo una sola volta  `a`. */

public class FiltroDi {
  
  public static int[] filtro(int[] a, int v) {
    int[] r = {};
    if (a.length > 0) {
        r = filtro(a,v,0,a.length);
    }
    return r;
  }  
  
  public static int[] filtro(int[] a, int v, int l, int r) {
    if (l+1 == r) {
      if (a[l] < v) {
        return new int {a[l]};
      } else {
        return new int {};
      }
    } else {
      int m = (l+r)/2;
      int[] sx = filtro(a, v, l, m); // sx array che filtra da a[l...m)
      int[] dx = filtro(a, v, m, r); // dx array che filtra da a[m...r)
      return AppendIt.append(sx,dx);
    }
  }  
}