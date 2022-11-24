public class AritIter {

  public static int piu(int x, int y) {
    int s = x;
    int i = y;
    while (i > 0) {
      s = s + 1;
      i = i - 1;
    }
    return s;
  }

  public static int per(int x, int y) {
    int m = 0;
    int i = y;
    while (i > 0) {
      m = piu(m, x);
      i = i - 1;
    }
    return m;
  }

  public static int esp(int x, int k){
    int i = 1;
    int r = 0;
    while (i < k){
      r = per(x, x);
      i = i + 1;
    }
    return r;
  }

  public static int meno(int x, int y){
    int i = 0;
    while (i < y){
      x = x - 1;
      i = i + 1;
    }
    return x;
  }

  public static int quoz(int D, int d){
    int q = 0;
    while (D > d){
      D = meno(D, d);
      q = q + 1;
    }
    return q;
  }

  public static int fatt(int n){
    int r = 1;
    while (n > 0){
      r = per(r, n);
      n = n - 1;
    }
    return r;
  }
}
