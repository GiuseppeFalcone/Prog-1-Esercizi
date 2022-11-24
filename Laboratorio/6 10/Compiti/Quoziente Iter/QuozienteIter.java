/** OBIETTIVO
	Dati due valori nelle variabili D (dividendo) e d (divisore), calcolare il quoziente della divisione del valore in D con quello in d.

  Vincolo iniziale: d>0 e 0<=D

D = 7; d = 3; q = 0; r = D;
while (r >= d) {
  q = q + 1;
  r = r - d;
}

*/

public class QuozienteIter {
  public static void main (String[] args){
    int D = 7;
    int d = 3;
    int q;

    q = quoz(D, d);

    System.out.println("Il quoziente della divisione " + D + "/" + d + " è: " + q);
  }

  public static int quoz (int D, int d){
    int q = 0;
    int r = D;
    while (r >= d){
      q = q + 1;
      r = r - d;
    }
    return q;
  }
}
