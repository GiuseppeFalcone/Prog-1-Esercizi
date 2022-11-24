public class RicercaLineareCov {
  public static boolean ricercaLineareCov(int[] a, int k){
    if (a != null){
      return ricercaLineareCov(a, k, a.length);
    } else {
      return false;
    }
  }

  public static boolean ricercaLineareCov(int[] a, int k, int i){
    if (i == 0){
      return false;
    } else {
      return a[i-1] == k || ricercaLineareCov(a, k, i-1);
    }
  }
}
