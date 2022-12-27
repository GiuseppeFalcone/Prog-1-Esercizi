import java.util.Arrays;

/** Dati due *array* `a` e `b`, produce un terzo *array* `c` in cui `a[0,...,a.length)` coincide con `c[0,...,a.length)` e `b[0,...,b.length)` coincide con `c[a.length,...,a.length+b.length)` */

public class AppendIt {
    
  /* Versione equiavalente con iterazioni */
  public static int[] append(int[] a, int[] b) {
    int[] c = new int[a.length+b.length];
    
    // scrive a in c 
    int i = 0;
    while (i < a.length) {
      c[i] = a[i];
      i = i + 1;
    } // i == a.length
       
    // scrive b in c
    i = 0;
    while (i < b.length) {
      c[i+a.length] = b[i];
      i = i + 1;
    }
    
    return c;
  }
  
  
}