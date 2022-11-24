/** Da un compito del 29/09/21
 Sottrazione per decrementi successivi */
public class SottPerDecrIter{
  public static void main (String[] args){
    int x = 4;
    int y = 3;
    int r = x;
    int i = y;
    while (i > 0) {
      r = r - 1;
      i = i - 1;
    }
    System.out.println("Il risultato di " + x + " - " + y + " è: " + r);
  }
}
