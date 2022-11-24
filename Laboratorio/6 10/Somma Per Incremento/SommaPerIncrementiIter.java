public class SommaPerIncrementiIter {
  public static void main (String[] args){
    int x = 3;
    int y = 6;
    int somma = x;
    int i = y;

    while (i > 0) {
      somma = somma + 1;
      i = i - 1;
    }
    System.out.println("La somma è: " + somma);
  }
}
