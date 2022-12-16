/** Dati un array qualsiasi a ed un valore v, fornire l'indice più piccolo di a in cui v eventualmente compare. Altrimenti, restituire -1 */

public class RicercaArrayQualsiasiDi {

  public static void main(String[] args) {
    System.out.println(ricercaArrayQualsiasi(null, 1) == -1);
    System.out.println(ricercaArrayQualsiasi(new int[] {}, 1) == -1);
    System.out.println(ricercaArrayQualsiasi(new int[] {0,1,2}, 1) == 1);
    System.out.println(ricercaArrayQualsiasi(new int[] {2,1,4,1}, 1) == 1);
  }

  // Wrapper
  static int ricercaArrayQualsiasi(int[] a, int v) {
    int r = -1;
    if (a != null) {
         r = ricercaArrayQualsiasi(a, v, 0, a.length); 
              /* r tale che a[r]==v con r in [0..a.length) 
                 altrimenti r == -1  */
    }
    return r;
  }
  
  // Dicotomico
  static int ricercaArrayQualsiasi(int[] a, int v, int l, int r) {
              /* r tale che a[r]==v con r in [l..r) 
                 altrimenti r == -1  */
    if ( l < r) {
      if (r-l==1) { // un elemento in [l, l+1)
        if (a[l]==v) {
          return l
        } else {
          return -1
        }
      } else { // più di un elemento in [l,...,r)
              m = (l+r)/2
              if (a[m]==v) {
                returniamo m
              } oppure {
                  rSx = ricercaArrayQualsiasi(a, v, l, m)
                  /* rSx tale che a[rSx]==v con rSx in [l..m) 
                 altrimenti rSx == -1  */
     
                 if (rSx > -1 ) {
                    return rSx
                 } else {
                    rDx = ricercaArrayQualsiasi(a, v, m+1, r)
                    /* rDx tale che a[rDx]==v con rDx in [m+1..r) 
                     altrimenti rDx == -1  */
                   return rDx
                 }
              }
      } 
    } else {
      returno -1
    }
  }
}