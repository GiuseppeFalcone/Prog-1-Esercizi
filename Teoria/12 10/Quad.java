/** Dato n, scrivere un algoritmo che, sfruttando la struttura ricorsiva di uno specifico prodotto notevole, calcola (n+1)^2 */
/**
quadCov(n) {
  if (n == 0) { // caso base
    risultato = 1
    return risultato /* ==1^2==(0+1)^2==(n+1)^2
  } else { // caso induttivo
    valoreInduttivo = quadCov(n-1); // == ((n-1)+1)^2
    risultato = valoreInduttivo + 2*n + 1;  // == ((n-1)+1)^2 + 2*n + 1
                                            // == n^2 + 2*n + 1
                                            // == (n+1)^2
    return risultato
  }
}
*/
public class Quad{
  public static void main(String[] args){
    int n = 7;
    int quad = quadVarianteCov(n, 2);
    System.out.println("Quadrato di " + n +" è: " + quad);
  }
  public static int quadVarianteCov (int n, int i){
    int r;
    int vI;
    if (i == 1) {
      return n;
    } else {
      vI = quadVarianteCov(n, i - 1);
      r = vI * n;
      return r;
    }
  }

}
