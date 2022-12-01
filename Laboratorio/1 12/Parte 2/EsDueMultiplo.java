public class EsDueMultiplo{
    public static boolean multiplo (int[] m){
        int i = 0;
        boolean esiste = false;
        while (!esiste && i < m.length){
            int j = i+1;
            boolean perOgni = true;
            while (perOgni && j < m.length){
                perOgni = (m[i] % m[j] != 0);
                ++j;
            }
            esiste = perOgni;
            ++i;
        }
        return esiste;
    }

    public static void main(String[] args) {
        int[] u0 = {10}; 
		 System.out.println(multiplo(u0)==true);
            // vero perché esiste 10 tale che,
            // per ogni elemento, se l'elemento è
            // è alla sua destra, allora 10 ne è
            // multiplo. Siccome la premessa della
            // moltiplicazione è falsa, l'implicazione
            // è vera.
		 int[] u1 = {10, 2, 5}; 
		 System.out.println(multiplo(u1)==true);
            // vero perché esiste 10 tale che,
            // per ogni elemento, se l'elemento è
            // è alla sua destra, allora 10 ne è
            // multiplo. Siccome la premessa della
            // moltiplicazione è falsa, l'implicazione
            // è vera.
		 int[] u2 = {3, 10, 2, 5}; 
		 System.out.println(multiplo(u2)==true);
		 int[] u3 = {4, 20, 31, 2}; 
		 System.out.println(multiplo(u3)==true);
            // vero perché esiste il secondo 3 tale che,
            // per ogni elemento, se l'elemento è
            // è alla sua destra, allora 3 ne è
            // multiplo. Siccome la premessa della
            // moltiplicazione è falsa, l'implicazione
            // è vera.
    }
}