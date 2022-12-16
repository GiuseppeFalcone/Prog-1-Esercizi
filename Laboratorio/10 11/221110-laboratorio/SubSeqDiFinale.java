public class SubSeqDiFinale {
    /* Restituisce l'indice al primo elemento in a della prima occorrenza della sottosequenza b in a. Se la sottosequenza b non compare in a, il risultato è -1. */
    
    public static int indiceSubSeqDi(int[] a, int[] b) {
        int inizio = -1;
        boolean trovata = false;
        if (a != null && b != null) {
                inizio = indiceSubSeqDi(a, b, 0, a.length);
        }
        return inizio;
    }
    
    public static int indiceSubSeqDi(int[] a, int[] b, int i, int j) {
      if (i + 1 == j) {
        if (trovaSottosequenzaCon(a, b, i, 0)) {
          return i;
        } else {
          return -1;
        }
      } else {
        int m = (i+j)/2;
        int indice   = indiceSubSeqDi(a, b, i, m);
        int indiceDx = indiceSubSeqDi(a, b, m, j);
        if (indice == -1) {
          indice = indiceDx;
        }
        return indice;
      }
    }

    public static boolean trovaSottosequenzaCon(int[] a, int[] b, int i, int j) {
       if ((j == b.length) && (i <= a.length)) {
         return true;
       } if (i >= a.length) {
         return false;
       }  else {
         return (a[i] == b[j]) && trovaSottosequenzaCon(a, b, i+1, j+1);
       } 
    }
}