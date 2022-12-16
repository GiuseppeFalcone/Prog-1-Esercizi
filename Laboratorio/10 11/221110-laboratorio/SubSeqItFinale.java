public class SubSeqItFinale {
    // Restituisce l'indice al primo elemento in a della prima occorrenza 
    // della sottosequenza b in a. 
    // Se la sottosequenza b non compare in a, il risultato è -1.
    public static int indiceSubSeqIt(int[] a, int[] b) {
        int inizio = -1;
        boolean trovata = false;
        if (a != null && b != null) {
            int i = 0;
            while (!trovata && (i <= a.length-b.length)) {
                // Cerca b[] come sotto-sequenza di a, a partire da i
                trovata = trovaSottosequenza(a, b, i);
                i++;
            }
            if (trovata) {
                inizio = i-1;
            }
        }
        return inizio;
    }
    
    public static boolean trovaSottosequenza(int[] a, int[] b, int i) {
      boolean trovata = true;
      for (int j = 0; trovata && (j < b.length) && (i+j < a.length); j++) {
        trovata = a[i + j] == b[j];
      }
      return trovata;
    }
}