import java.util.Arrays;
/* Fornisce:
    - Arrays.toString
    - Arrays.copyOfRange(int[], int l, int r) == c[0...r-l) tale che
      c[0...r-l) == a[l...r]
    */

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
       ????
		} else
			return a;
	}
}