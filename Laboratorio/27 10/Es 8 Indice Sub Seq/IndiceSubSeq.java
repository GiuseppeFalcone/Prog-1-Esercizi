/*public class IndiceSubSeq{

    public static int indiceSubSeqCon(int[] a, int[] b){
        int r = -1;
        if (a != null && b != null && b.length != 0 && b.length <= a.length){
            r = indiceSubSeqCon(a, b, 0, 0);
        }
        return r;
    }

    private static int indiceSubSeqCon(int[] a, int[] b, int i, int j){
        if (i == a.length){
            return -1;
        } else {
            if ((a[i] == b[j]) &&){
                int vI = indiceSubSeqCon(a, b, i+1, j+1);
            }
        }
    }
}

*/
/* Dati due array a e b, restituire l'indice di a più piccolo dal quale
comincia b, vista come sotto-sequenza di a. 
Se b non esiste come sotto-sequenza di a, allora restituire -1. 

La soluzione è data tramite due metodi ricorsivi contro-varianti */

public class IndiceSubSeq {

    public static int indiceSubSeqCon(int[] a, int[] b) {
        int r = -1;
        /* Se a o b non esistono o b piu' lunga di a, diciamo che b
         * non e' sottostringa di a */
        if (a!= null && b!= null && b.length!=0 & b.length<=a.length) {
            r = indiceSubSeqCon(a, b, 0);
        }
        return r;
    }

    private static int indiceSubSeqCon(int[] a, int[] b, int i) {
        if(b.length > a.length-i) { // b piu' lunga di quanto non rimane in a
            return -1;
        } else { // ci sono abbastanza elementi in a
            if(esisteSubSeqCon(a,b,0,i)) {
                return i;
            } else {
                return indiceSubSeqCon(a,b,i+1); // cerca b a partire da una posizione piu' a destra
            }
        }
    }

    /* Restituisce true se e solo se b è una sotto-sequenza
       di a, partendo dall'elemento di indice base in a    */
    private static boolean esisteSubSeqCon(int[] a, int[] b, int i, int base) {
        if (i==b.length) {
            return true;
        } else {
            return a[base+i]==b[i]
                   && esisteSubSeqCon(a,b,i+1,base);
        }
    }
}