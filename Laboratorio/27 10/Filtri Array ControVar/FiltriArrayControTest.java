import java.util.Arrays;
public class FiltriArrayControTest{
  public static void main(String[] args) {
    System.out.println("Test Filtro Dispari");
    int[] array1 = new int[] {0, 1, 2, 3, 4, 5, 6};
    int[] array2 = new int[] {2, 4, 5, 6, 7};
    int[] arrayout1 = FiltriArrayContro.elDispari(array1);
    int[] arrayout2 = FiltriArrayContro.elDispari(array2);
    System.out.println(Arrays.toString(arrayout1));
    System.out.println(Arrays.toString(arrayout2));
    System.out.println(Arrays.equals(arrayout1, new int[]{1, 3, 5}));
    System.out.println(Arrays.equals(arrayout2, new int[]{5, 7}));

    System.out.println("\nTest Filtro Posizioni Pari");
    array1 = new int[] {0, 1, 2, 3, 4, 5, 6};
    array2 = new int[] {2, 4, 5, 6, 7};
    arrayout1 = FiltriArrayContro.posPari(array1);
    arrayout2 = FiltriArrayContro.posPari(array2);
    System.out.println(Arrays.toString(arrayout1));
    System.out.println(Arrays.toString(arrayout2));
    System.out.println(Arrays.equals(arrayout1, new int[]{0,2,4,6}));
    System.out.println(Arrays.equals(arrayout2, new int[]{2,5,7}));

    System.out.println("\nTest Filtro Posizioni Dispari oppure Elementi Pari");
    array1 = new int[] {0, 1, 2, 3, 4, 5, 6};
    array2 = new int[] {2, 4, 5, 6, 7};
    arrayout1 = FiltriArrayContro.posDispOrElPari(array1);
    arrayout2 = FiltriArrayContro.posDispOrElPari(array2);
    System.out.println(Arrays.toString(arrayout1));
    System.out.println(Arrays.toString(arrayout2));
    System.out.println(Arrays.equals(arrayout1, new int[]{0,1,2,3,4,5,6}));
    System.out.println(Arrays.equals(arrayout2, new int[]{2,4,6}));

    System.out.println("\nTest Filtro Intervallo");
    array1 = new int[] {0, 1, 2, 3, 4, 5, 6};
    array2 = new int[] {2, 4, 5, 6, 7};
    arrayout1 = FiltriArrayContro.intervallo(array1, 3, 7);
    arrayout2 = FiltriArrayContro.intervallo(array2, 3, 7);
    System.out.println(Arrays.toString(arrayout1));
    System.out.println(Arrays.toString(arrayout2));
    System.out.println(Arrays.equals(arrayout1, new int[]{3,4,5,6}));
    System.out.println(Arrays.equals(arrayout2, new int[]{4,5,6,7}));

    System.out.println("\nTest Filtro Doppio");
    array1 = new int[] {0, 1, 2, 4, 4, 5, 4};
    array2 = new int[] {2, 6, 5, 6, 6};
    arrayout1 = FiltriArrayContro.doppio(array1, 2);
    arrayout2 = FiltriArrayContro.doppio(array2, 3);
    System.out.println(Arrays.toString(arrayout1));
    System.out.println(Arrays.toString(arrayout2));
    System.out.println(Arrays.equals(arrayout1, new int[]{4,4,4}));
    System.out.println(Arrays.equals(arrayout2, new int[]{6,6,6}));
  }
}
