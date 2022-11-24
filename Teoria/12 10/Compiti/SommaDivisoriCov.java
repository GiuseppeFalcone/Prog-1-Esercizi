/*  Dato n, scrivere un algoritmo ricorsivo covariante sommaDivisoriCov che
    restituisce la somma di tutti i divisori di n
*/

public class SommaDivisoriCov {
  public static void main(String[] args) {
    int n = 8;
    System.out.println("La somma dei divisori di " + n + " è: " + sommaDivisori(n, n));
  }
  public static int sommaDivisori(int n, int i){
    int vI;
    if (i > 0){
      vI = sommaDivisori(n, i - 1);
      if (n % i == 0){
        vI += i;
      }
      return vI;
    } else {
      return 0;
    }
  }
}
