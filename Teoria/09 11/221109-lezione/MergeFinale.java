import java.util.Arrays;

/** Dati due array a e b ordinati, produrne uno singolo array ordinato che contiene tutte e sole le occorrenze di elementi di a e di b.
  
    ESEMPIO.
    Array di partenza: a=={5 67 100}, b=={9 34 123 450}.
    Array risultante : c=={5 9 34 67 100 123 450}.
*/
public class MergeFinale {

    public static void main(String[] args) {
        int[] a = { 5, 67, 100 };
        int[] b = { 9, 34, 123, 450 };
        System.out.println(Arrays.toString(merge(a,b)));
        System.out.println(Arrays.toString(mergeRec(a,b)));
    }

    public static int[] merge(int[] a, int[] b) {
      
        int[] c = new int[a.length + b.length];
        int i = 0;
        int j = 0;

        while (i < a.length && j < b.length) {

            if (a[i] < b[j]) {
                c[i + j] = a[i];
                i++; // equivale a i = i + 1
            } else {
                c[i + j] = b[j];
                j++; // equivale a j = j + 1
            }
        }

        // inserisce elementi restanti di a in c
        while (i < a.length) {
            c[i + j] = a[i];
            i++;
        }

        // inserisce elementi restanti di b in c
        while (j < b.length) {
            c[i + j] = b[j];
            j++;
        }
        return c;
    }

    // Possibile versione ricorsiva contro-variante di coda ....
    public static int[] mergeRec(int[] a, int[] b) {
       int[] c = new int[a.length + b.length];
       mergeRec(a, b, c, 0, 0);
       return c;
    }

    public static void mergeRec(int[] a, int[] b, int[] c, int i, int j) {
      if (i < a.length && j < b.length) 
         if (a[i] < b[j]) {
            c[i + j] = a[i];
            mergeRec(a, b, c, i + 1, j);
            /* merge in c[0...(i+1)+j)
               tra a[i+1...a.length)
               e b[j...b.length) */
         } else {
            c[i + j] = b[j];
            mergeRec(a, b, c, i, j + 1);
            /* merge in c[0...(i+1)+j)
               tra b[j+1...b.length)
               e a[i...a.length) */
         }
      else if (i < a.length) {
         c[i + j] = a[i];
         mergeRec(a, b, c, i + 1, j);
            /* copia in c[0...(i+1)+j)
               di a[j+1...a.length)  */
      }
      else if (j < b.length) {
         c[i + j] = b[j];
         mergeRec(a, b, c, i, j + 1);
            /* merge in c[0...(i+1)+j)
               di b[j+1...b.length) */
      }
    }    
}