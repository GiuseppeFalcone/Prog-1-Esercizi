import java.util.Arrays;

public class AzzeraValoriPariConTest {

  public static void main (String[] args) {
    System.out.println("-- Test azzeraValoriPariCov ");

    int[] x0 = null;
    AzzeraValoriPariCon.azzeraValoriPariCon(x0);
    System.out.println(x0==null);

    int[] x2 = {2};
    int[] x2Out = {0};
    AzzeraValoriPariCon.azzeraValoriPariCon(x2);
    System.out.println(Arrays.equals(x2,x2Out));
    System.out.println("x2 modificata è: "+ Arrays.toString(x2));

    int[] x3 = {1,5,5,10,33,4};
    int[] x3Out = {1,5,5,0,33,0};
    AzzeraValoriPariCon.azzeraValoriPariCon(x3);
    System.out.println(Arrays.equals(x3,x3Out));
    System.out.println("x3 modificata è: "+ Arrays.toString(x3));
  }
}

// Arrays.equals contralla se due arrays hanno uguali elementi
// Arrays.toString stampa gli elementi degli elementi

// More on: https://docs.oracle.com/javase/7/docs/api/java/util/Arrays.html
