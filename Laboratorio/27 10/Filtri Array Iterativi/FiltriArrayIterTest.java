import java.util.Arrays;
public class FiltriArrayIterTest{
  public static void main(String[] args) {
    int[] array1 = new int[] {0, 1, 2, 3, 4, 5, 6};
    int[] array2 = new int[] {2, 4, 5, 6, 7};
    System.out.println("Test Filtro Dispari");
    System.out.println(Arrays.equals(FiltriArrayIter.filtroDispari(array1), new int[]{1, 3, 5}));
    System.out.println(Arrays.equals(FiltriArrayIter.filtroDispari(array2), new int[]{5, 7}));

    System.out.println("\nTest Filtro Posizioni Pari");
    System.out.println(Arrays.equals(FiltriArrayIter.filtroPosPari(array1), new int[]{0, 2, 4, 6}));
    System.out.println(Arrays.equals(FiltriArrayIter.filtroPosPari(array2), new int[]{2, 5, 7}));

    System.out.println("\nTest Filtro Posizioni Dispari oppure Elementi Pari");
    System.out.println(Arrays.equals(FiltriArrayIter.filtroPosDispOrElPari(array1), new int[]{0,1,2,3,4,5,6}));
    System.out.println(Arrays.equals(FiltriArrayIter.filtroPosDispOrElPari(array2), new int[]{2,4,6}));

    System.out.println("\nTest Filtro Intervallo");
    System.out.println(Arrays.equals(FiltriArrayIter.filtroIntervallo(array1, 3, 7), new int[]{3,4,5,6}));
    System.out.println(Arrays.equals(FiltriArrayIter.filtroIntervallo(array2, 3, 7), new int[]{4,5,6,7}));
    System.out.println("\nTest Filtro Doppio");
    System.out.println(Arrays.equals(FiltriArrayIter.filtroDoppio(array1, 2), new int[]{4}));
    System.out.println(Arrays.equals(FiltriArrayIter.filtroDoppio(array2, 3), new int[]{6}));

  }
}
