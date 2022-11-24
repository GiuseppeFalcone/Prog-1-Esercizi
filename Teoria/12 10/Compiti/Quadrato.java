public class Quadrato {
  public static void main(String[] args) {
    int n = 4;
    int q = quadCov(n);
    System.out.println(q);
  }

  public static int quadCov(int n){ // Risultato atteso (n + 1)^2 == n^2 + 2n + 1
    if (n == 0){ // Caso Base se n = 0 , (0 + 1)^2 = 1
      int vB = 1;
      return vB;
    } else {
      int vI = quadCov(n - 1);
      int r = vI + 2*n + 1;
      return r;
    }
  }

}
