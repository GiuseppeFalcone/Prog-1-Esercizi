public class PiuUFinale {

  public static int piuU(int x, int y) {
    int ris = x;
    int i = 0;
    /* vera dopo aver completato 0 iterazioni */
    System.out.println(ris==x+i);
    boolean vero = true;
    while (vero) {
      /* se equazione 'ris==x+i' 
         vero dopo n iterazioni complete */
      System.out.println(ris==x+i); /* come a riga 16: 
                                       invariante   */
      System.out.println(ris+1==x+i+1);
      ris = ris + 1;
      System.out.println(ris==x+i+1);
      i = i + 1;
      /* allora 'ris==x+i' 
         vero dopo n+1 iterazioni complete */
      System.out.println(ris==x+i); /* come a riga 10: 
                                       invariante   */
    }
    System.out.println(ris==x+i && i==y);
    return ris;
  }

  public static void main(String[] args) {
    int somma = piuU(3,2);
  }
}