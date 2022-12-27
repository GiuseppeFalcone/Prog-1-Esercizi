import java.util.Arrays;

public class AzzeraPari {
    public static int[] azzeraPari(int[] a){
        int[] ris = null;
        if (a != null){
            ris = new int[a.length];
            ris = Arrays.copyOf(a, a.length);
            azzeraPari(ris, 0, ris.length);
            return ris;
        } else {
            return ris;
        }
    }

    private static void azzeraPari(int[] ris, int l, int r){
        if (l < r){ //Controllo che ci sia almeno un elemento (sennò Out Of Bound Error)
            if (r-l == 1){ // Caso base, quando c'è solo un elemento da controllare
                if (l % 2 == 0){ //Controllo per indice pari e azzeramento se true
                    ris[l] = 0;
                }
            } else {
                int m = ((r+l)/2);  // Valore medio
                azzeraPari(ris, l, m);  // Richiamo funzione per lato sinistro
                azzeraPari(ris, m, r);  // Richiamo funzione per lato destro
            }
        }
    }
    public static void main(String[] args) {
        /* Arrays.equals(int[] a, int[] b) restituisce true
           se, e solo se, a e b sono entrambi null, o sono 
           identici elemento per elemento. 
           */
           System.out.println(Arrays.equals(null,azzeraPari(null)));
           System.out.println(Arrays.equals(new int[] {},azzeraPari(new int[] {})));
           /* Arrays.toString(int[] a) restituisce una stringa 
           che elenca gli elementi in a */
           System.out.println(Arrays.toString(azzeraPari(new int[] {2,1,4,1})));
        }
}
