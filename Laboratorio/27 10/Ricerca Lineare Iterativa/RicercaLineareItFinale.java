/** Dato un array di interi ed un valore, restituisce
    true se il valore occorre nell'array. False altrimenti
 */
public class RicercaLineareItFinale {

    public static boolean ricercaLineareIt(int[] a, int k) {
        int p = 0;
        boolean trovato = false;
        while ((a != null) && p < a.length && !trovato) {
            trovato = (k == a[p]);
            if (!trovato) {
                p = p + 1;
            }
        }
        return trovato;
    }
}
