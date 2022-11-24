/** OBIETTIVO. Dato un numero naturale n, calcolare la somma 0+1+2+...+(n-1).

IDEA. Supponiamo che n sia 4 e supponaimo di scrivere il risultato della somma nella variabile s.

L'algoritmo può essere impostato in modo che s evolva come segue:
s = 0
s = s + 1 = 0 + 1
s = s + 2 = (0 + 1) + 2
s = s + 3 = ((0 + 1) + 2) + 3 // in cui abbiamo sommato i primi 4 numeri naturali
*/

public class SommaN {
  public static void main (String[] args){

    int s = 0;
    int i = 0;

    while (i < 3) {
      s = s + i;
      i = i + 1;
    }
    
  }
}
