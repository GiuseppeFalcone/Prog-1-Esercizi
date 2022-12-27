import java.util.Arrays;

/** Merge sort divide un array in du parti, le ordina separatamente per poin fonderle in un unico array finale ordinato. */
public class MergeSortFinale {
  
	public static void main(String[] args) {
		int[] a = { 450, 5, 123, -1, 34, 67, 9, 200, 100, -4 };
		System.out.println(Arrays.toString(mergeSort(a)));
		int[] b = { 450, 5, 9, 123, -1, 34, 67, 9, 200, 100 };
		System.out.println(Arrays.toString(mergeSort(b)));
	}

  public static int[] mergeSort(int[] a) {
		if (a.length > 1) {
			int centro = a.length/2;
			int[] aSx = Arrays.copyOfRange(a, 0, centro);
            /* Copia la porzione sinistra di a in aSx */
			int[] aDx = Arrays.copyOfRange(a, centro, a.length);
            /* Copia la porzione destra di a in aDx */
			int[] rSx = mergeSort(aSx);
            /* Ordina aSx, producendo l'array ordinato rSx*/
			int[] rDx = mergeSort(aDx);
            /* Ordina aDx, producendo l'array ordinato rDx*/
			return MergeFinale.merge(rSx, rDx);
         /* Fonde rSx e rDx in un unico array ordinato, restituiendolo */
		} else
			return a;
	}
}