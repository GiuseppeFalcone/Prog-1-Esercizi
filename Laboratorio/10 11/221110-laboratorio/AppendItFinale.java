/** Dati due *array* `a` e `b`, produce un terzo *array* `c` in cui `a[0,...,a.length)` coincide con `c[0,...,a.length)` e `b[0,...,b.length)` coincide con `c[a.length,...,a.length+b.length)` */

public class AppendItFinale {
  
  /* Versione equiavalente con iterazioni */
  public static int[] appendEquivalente(int[] a, int[] b) {
    int[] c = new int[a.length+b.length];
    
    int i = 0;
    while (i < a.length) { // scrive a in c
      c[i] = a[i];
      i = i + 1;
    }
    
    i = 0;
    while (i < b.length) { // scrive b in c
      c[a.length+i] = b[i];
      i = i + 1;
    }
    
    return c;
  }  
  
  /* Introduzione all'iterazione 'for' */
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
}