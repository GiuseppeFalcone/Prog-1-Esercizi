/** OBIETTIVO. Dato un numero n calcolare la media delle prime n frazioni 1/1, 1/2, 1/3, ..., 1/n.

IDEA. Supponiamo che n sia il numero 4. L'algoritmo si divide naturalmente in due parti.
  - calcolo la somma 1/1+1/2+...+1/n
  - divido il risultato della somma per n

Un modo per calcolare la somma è accumulare passo passo i valori intermedi della sommatoria in s:

s = 0
s = s + 1/1 = 1
s = s + 1/2 = 1+1/2
s = s + 1/3 = (1+1/2)+1/3
s = s + 1/4 = ((1+1/2)+1/3)+1/4

Quindi si calcola la media m = s/n
*/

// n dato da qualcuno
public class MediaPrimiNFrazioniIter {
  public static void main (String[] args){

    float s = 0;
    int i = 1;
    int n = 10;
    while (i <= n) {
      s = s + 1/i;
      i = i + 1;
    }

    float m = s/n;
  }
}
