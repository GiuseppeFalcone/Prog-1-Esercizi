public class LibIter{
  public static boolean dispari(int n){
    boolean r = true;
    if (n >= 0) {
      if (n == 0){
        r = false;
      }
      if ((n - 1) % 2 == 0) {
        r = true;
      } else {
        r = false;
      }
    }
    return r;
  }

  public static int quadrato(int n){
    return (n * n) + 2*n + 1;
  }

  public static int sommaNDispari(int n){
    int i = 1;
    int r = 0;
    while (i < 2*n){
      if (i % 2 != 0){
        r = r + i;
      }
      i = i + 1;
    }
    return r;
  }

  public static boolean pariPerSottr(int n) {
    while (n > 0) {
      n = n - 2;
    }
    return n == 0;
  }

  public static int quoz(int D, int d){
    int q = 0;
    while (D >= d){
      D = D - d;
      q = q + 1;
    }
    return q;
  }

  public static int resto(int D, int d){
    while (D >= d) {
      D = D - d;
    }
    return D;
  }

  public static boolean primo(int n) {
    int i = 2;
    boolean r = true;
    while (i <= (n - 1)) {
      if (resto(n, i) == 0){
        r = false;
      }
      i = i + 1;
    }
    return r;
  }

  public static int sommaDivisori(int n){
    int i = 1;
    int r = 0;
    while (i <= n){
      if (resto(n, i) == 0){
        r = r + i;
      }
    }
    return r;
  }
}
