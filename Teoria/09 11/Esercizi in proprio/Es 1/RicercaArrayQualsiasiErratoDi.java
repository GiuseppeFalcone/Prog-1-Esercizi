/** Dati un array qualsiasi a ed un valore v, fornire l'indice più piccolo di a in cui v eventualmente compare. Altrimenti, restituire -1 */

public class RicercaArrayQualsiasiErratoDi {

  public static void main(String[] args) {
    System.out.println(ricercaArrayQualsiasi(null, 1) == -1);
    System.out.println(ricercaArrayQualsiasi(new int[] {}, 1) == -1);
    System.out.println(ricercaArrayQualsiasi(new int[] {0,1,2,1}, 1) == 1);
    System.out.println(ricercaArrayQualsiasi(new int[] {2,1,1,4,1}, 1) == 1);
  }
  
  // Wrapper
  static int ricercaArrayQualsiasi(int[] a, int v) {
    int r = -1;
    if (a != null && a.length > 0) {
         r = ricercaArrayQualsiasi(a, v, 0, a.length);
    }
    return r;
  }
  
  // Dicotomico
  static int ricercaArrayQualsiasi(int[] a, int v, int l, int r) {
      if (l+1==r) { // un elemento in [l, l+1)
        if (a[l]==v) { // l'unico elemento è uguale a v
          return l;
        } else {
          return -1;
        }
      } else { // più di un elemento in [l,...,r)
         int m = (l+r)/2;
         //if (a[m]==v) {
          //  return m;
         //} else {
            int indiceSx = ricercaArrayQualsiasi(a, v, l, m);
            /*  indiceSx == -1 se v non è in a[l..m) 
                indiceSx == i se a[i]==v e a[0..i)!=v */
            if (indiceSx != -1) {
               return indiceSx;
               /* essendo inutile cercare nell'intervallo destro */
            } else {
                /* v non è stato trovato in a[l..m) */
               return ricercaArrayQualsiasi(a, v, m, r);
                /*  indiceDx == -1 se v non è in a[m..r) 
                    indiceDx == i se a[i]==v e a[m..r)!=v */
            }
         //}
      } 
  }
}