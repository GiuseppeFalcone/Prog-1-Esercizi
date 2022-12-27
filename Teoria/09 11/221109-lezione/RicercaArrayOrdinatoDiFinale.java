/**  Dati un array ordinato `a`, anche `null` o con `0`  elementi, ed un valore `v` costituisce il wrapper di un metodo ricorsivo dicotomico che restituisce l'indice più piccolo dell'elemento di `a` uguale a `v`, se `v` occorre in `a` almeno una volta.  */

public class RicercaArrayOrdinatoDiFinale {

  public static void main(String[] args) {
    System.out.println(ricercaDicotomica(null, 1) == -1);
    System.out.println(ricercaDicotomica(new int[] {}, 1) == -1);
    System.out.println(ricercaDicotomica(new int[] {0,1,2,3}, 1) == 1);
    System.out.println(ricercaDicotomica(new int[] {1,2,3,4,6}, 4) == 3);
  }

  // Wrapper
  static int ricercaDicotomica(int[] a, int v) {
    int r = -1;
    if (a != null ) {
      if (a.length > 0) 
         r = ricercaDicotomica(a, v, 0, a.length);
    }
    return r;
  }
  
  // Dicotomico
  static int ricercaDicotomica(int[] a, int v, int l, int r) {
      if (r-l==1) { // un elemento in [l, l+1)
        if (a[l] == v) { // trovato v in a
          return l;
        } else {
          return -1;
        }
      } else { // più di un elemento in [l,...,r)
         int m = (l+r)/2;
         if (v < a[m]) {
            /* se c'è, v è nell'intervallo a[l..m) perché a ordinato  */
            return ricercaDicotomica(a, v, l, m);
         } else {
            /* se c'è, v è nell'intervallo a[m..a.length) perché a ordinato */
            return ricercaDicotomica(a, v, m, r);
         } 
      }
  }
}