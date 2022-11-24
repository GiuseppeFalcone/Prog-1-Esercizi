public class AzzeraValoriPariCov{
  public static void azzeraPariCov(int[] a){
    if (a != null){
      azzeraPariCov(a, a.length);
    }
  }

  public static void azzeraPariCov(int[] a, int i){
    if (i == 0){
    } else {
      azzeraPariCov(a, i-1);
      if (a[i-1] % 2 == 0){
        a[i-1] = 0;
      }
    }
  }
}
