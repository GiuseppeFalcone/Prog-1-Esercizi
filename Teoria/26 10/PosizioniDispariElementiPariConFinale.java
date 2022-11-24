/** Dato un array `a`, restituisce un *array* che deve contenere tutti e soli gli elementi che in `a`, simultaneamente, occupano una posizione dispari e hanno valore pari */
import java.util.Arrays;
public class PosizioniDispariElementiPariConFinale {


  static int[] filtroPosDisElPariCon(int[] a) {
    int[] r = null;
    if (a != null) {
      r = new int[contaPosDisElPari(a, 0)];
      filtroPosDisElPariCon(a, r, 0);
      /* r con elementi pari in posizione dispari di a nell'intervallo
         di indici [0,...,a.length)  */
    }
    return r;
  }

  static int filtroPosDisElPariCon(int[] a, int[] r, int i) {
          /* gli elementi di r nell'intervallo [0,...,filtroPosDisElPariCon(a,r,i) ),
             in cui l'estremo superiore è escluso, contengono elementi pari in posizione
             dispari di a nell'intervallo di indici [i,...,a.length) in ordine inverso
             rispetto a quello con cui compaiono in a
             */
    if (i == a.length) { // caso base caratterizzato da a.length-i == 0
    return 0;
      /* gli elementi di r nell'intervallo [0,...,filtroPosDisElPariCon(a,r,a.length) ),
         in cui l'estremo superiore è escluso, contengono elementi pari in posizione
         dispari di a nell'intervallo di indici [a.length,...,a.length).

         Siccome l'intervallo degli indici in a è vuoto, in r non è ancora stato scritto
         alcun elemento ed il valore restituito dal metodo indica la prima cella di r in cui
         scrivere   */
    } else {
      int valoreInduttivo = filtroPosDisElPariCon(a, r, i+1);
        /* Per ipotesi induttiva, gli elementi di r nell'intervallo
           [0,...,filtroPosDisElPariCon(a,r,i+1) ) contengono elementi pari
           in posizione dispari di a nell'intervallo di indici [i+1,...,a.length)
           in ordine inverso rispetto a quello con cui compaiono in a.

           Equivalentemente, valoreInduttivo conta il numero di elementi pari
           in posizione dispari della porzione di array a identificata
           dall'intervallo di indici [i+1,...,a.length) */
      if ((i%2 == 1) && (a[i]%2 == 0)) {
        /* Se l'elemento a[i] gode delle proprietà cercate, occorre copiarlo in
           r ed estendere verso destra l'intervallo degli elementi usati in r */
        r[r.length-1-valoreInduttivo] = a[i];
        //Cambio dell'indice di assegnazione del valore da valoreInduttivo a
        //r.length-1-valoreInduttivo
        valoreInduttivo = valoreInduttivo + 1;
      }
      /* È diventato vero che gli elementi di r nell'intervallo
         [0,...,filtroPosDisElPariCon(a,r,i) ) contengono elementi pari
         in posizione dispari di a nell'intervallo di indici [i,...,a.length)
         in ordine inverso rispetto a quello con cui compaiono in a  */
      return valoreInduttivo;
    }
  }


  static int contaPosDisElPari(int[] a, int i) {
           /* == numero degli elementi di interesse nell'intervallo
                 di indici [i,...,a.length) */
     if (i == a.length)  {
       return 0;
     } else {
         int valoreInduttivo = contaPosDisElPari(a, i+1);
           /* == numero degli elementi di interesse nell'intervallo
                 di indici [i+1,...,a.length) */
         if (i%2==1 && a[i]%2==0 ) {
            valoreInduttivo = valoreInduttivo + 1;
           /* == 1 + numero degli elementi di interesse nell'intervallo
                     di indici [i+1,...,a.length) */
         }
        return valoreInduttivo;
           /* == numero degli elementi di interesse nell'intervallo
                 di indici [i,...,a.length) */
     }
  }

  public static void main (String[] args) {
      int[] r = filtroPosDisElPariCon(new int[] {10,8,11,7,13,12,23,4,77,77,65,66});
      System.out.println(Arrays.toString(r));
  }
}
