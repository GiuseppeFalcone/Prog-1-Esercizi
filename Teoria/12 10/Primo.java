public class Primo {
  public static void main (String[] args){
    int n = 20;
    int i = n - 1;
    boolean p = pri(n, i);
    System.out.println("Il numero: " + n + " è primo: " + p);
  }

  public static boolean pri(int n, int i){
    boolean p = true;

    if ((n % i == 0) && (i > 1)){
      p = false;
      return p;
    } else {
      vI = pri(n, i - 1);
    }

  }
}
