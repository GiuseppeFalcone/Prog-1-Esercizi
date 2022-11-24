public class AzzeraValoriPariCon {

  public static void azzeraValoriPariCon(int[] x) {
    if (x != null){
      azzeraValoriPariCon(x, 0);
    }
  }

  public static void azzeraValoriPariCon(int[] x, int i) {
    if (i == x.length){
    } else {
      azzeraValoriPariCon(x, i+1);
      if (x[i] % 2 == 0){
        x[i] = 0;
      }
    }
  }
}
