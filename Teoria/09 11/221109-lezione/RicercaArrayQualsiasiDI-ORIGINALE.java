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
    int r = ;
    if (???) {
         r = ricercaArrayQualsiasi(a, v, ???, ???);
    }
    return r;
  }
  
  // Dicotomico
  static int ricercaArrayQualsiasi(int[] a, int v, int l, int r) {
      if (r-l==1) { // un elemento in [l, l+1)
        ???
      } else { // più di un elemento in [l,...,r)
        ???
      } 
  }
}