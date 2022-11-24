/** OBIETTIVO (Ordinamento dei valori in quattro variabili)

 Date quattro variabili a, b, c, d, riorganizzare i valori in esse contenuti, in modo che, al termine, i valori in a, b ,c ,d siano ordinati in ordine non decrescente, leggendoli da sinistra verso destra.

 ESEMPIO.
 Data la configurazione iniziale:

	a==3, b==11, c==8, d== 2

 produrre la configurazione:

	a==2, b== 3, c==8, d==11 .
*/

public class OrdinamentoVariabili {
  public static void main (String[] args){
    int a=3;
    int b=11;
    int c=8;
    int d=2;
    int e = 9;
    int f = 4;
    int i = 0;
    while (i < 5) {
      if (a > b) {
        int tmp = a; a = b; b = tmp;
      }
      if (b > c) {
        int tmp = b; b = c; c = tmp;
      }
      if (c > d) {
        int tmp = c; c = d; d = tmp;
      }
      if (d > e) {
        int tmp = e; e = d; d = tmp;
      }
      if (e > f) {
        int tmp = f; f = e; e = tmp;
      }
      i = i + 1;
    }

  }
}
