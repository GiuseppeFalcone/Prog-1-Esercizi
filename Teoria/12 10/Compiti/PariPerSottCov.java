public class PariPerSottCov{
  public static void main(String[] args) {
    System.out.println(pari(6));
  }

  public static boolean pari(int n){// true pari | false dispari
    if (n >= 0){
      if (n == 0){
        return true;
      } else {
        boolean vI = pari(n - 2);
        return vI;
      }
    } else {
      return false;
    }
  }
}
