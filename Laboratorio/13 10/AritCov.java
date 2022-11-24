public class AritCov {
  public static int piu(int x, int y) {
    if (y == 0){
      return x;
    } else {
      return piu(x, y - 1) + 1;
    }
  }

  public static int per(int x, int y) {
    if (y == 1) {
      return x;
    } else {
      return per(x, y - 1)+ x;
    }
  }

  public static int esp(int x, int k){
    if (k == 1){
      return x;
    } else {
      return esp(x, k-1) * x;
    }
  }

  public static int meno(int x, int y){
    if (y == 0){
      return x;
    } else {
      return meno(x, y-1) - 1;
    }
  }

  public static int quoz(int D, int d){
    if (D < d){
      return 0;
    } else {
      return quoz(D-d, d) + 1;
    }
  }

  public static int fatt(int n){
    if (n == 0){
      return 1;
    } else {
       return per(fatt(n - 1), n);
    }
  }
}
