import java.util.Arrays;

public class AzzeraValoriPariCovTest {

  public static void main (String[] args) {
    System.out.println("-- Test azzeraValoriPariCov");

    int[] x0 = null;
    AzzeraValoriPariCov.azzeraPariCov(x0);
    System.out.println(x0==null);

    int[] x2 = {2};
    int[] x2Out = {0};
    AzzeraValoriPariCov.azzeraPariCov(x2);
    System.out.println(Arrays.equals(x2,x2Out));
    System.out.println("x2 modificata è: "+ Arrays.toString(x2));

    int[] x3 = {1};
    int[] x3Out = {1};
    AzzeraValoriPariCov.azzeraPariCov(x3);
    System.out.println(Arrays.equals(x3,x3Out));
    System.out.println("x3 modificata è: "+ Arrays.toString(x3));

    int[] x4 = {1, 3, 6, 8, 9, 10, 12};
    int[] x4Out = {1, 3, 0, 0, 9, 0, 0};
    AzzeraValoriPariCov.azzeraPariCov(x4);
    System.out.println(Arrays.equals(x3,x4Out));
    System.out.println("x3 modificata è: "+ Arrays.toString(x4));
  }
}

// Arrays.equals contralla se due arrays hanno uguali elementi
// Arrays.toString stampa gli elementi degli elementi

// More on: https://docs.oracle.com/javase/7/docs/api/java/util/Arrays.html
