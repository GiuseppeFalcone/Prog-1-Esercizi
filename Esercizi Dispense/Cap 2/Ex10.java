public class Ex10 {
  public static void main (String[] args){
    /* Punto 1
    int m = 658;
    int r = m;

    while (r > 2) {
      r = r - 2;
    }
    System.out.println(r);
    if (r == 2){
      System.out.println("Il numero " + m + " è pari");
    }
    if (r == 1) {
      System.out.println("Il numero " + m + " è dispari");
    }
    */
    /* Punto Due
    int n = 8;
    if (n % 2 == 0) {
      System.out.println("Il numero " + n + " è pari");
    } else {
      System.out.println("Il numero " + n + " è dispari");
    }
    */

    int n = 30;
    int i = n;
    int somma = 0;
    while (i > 0) {
      somma = somma + i;
      System.out.println("Numero: " + i);
      System.out.println("Somma: "+ somma);
      i = i - 1;
    }
    System.out.println("La somma dei primi" + n + "numeri naturali è: " + somma);
  }
}
