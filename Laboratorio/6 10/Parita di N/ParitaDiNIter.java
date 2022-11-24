public class ParitaDiNIter{
  public static void main (String[] args){
  int n = Integer.MAX_VALUE - 1;
  int r = n;

  while (r > 1) {
  r = r - 2;
  }

  boolean p = (r == 0);

  System.out.println("n: " + n);
  System.out.println("r: " + r);
  System.out.println("p: " + p);

  }
}
