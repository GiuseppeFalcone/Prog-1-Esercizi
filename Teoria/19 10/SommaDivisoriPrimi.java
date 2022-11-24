public class SommaDivisoriPrimi {
  public static void main(String[] args) {
    System.out.println(sommaDivisoriP(14, 14/2));
  }
  public static int sommaDivisoriP(int n, int i) {
    int vI;
    if (i > 0){
      vI = sommaDivisoriP(n, i - 1);
      if (resto(n, i) == 0){
        if (primo(i, (i/2))){
          vI += i;
        }
      }
      return vI;
    } else {
      return 0;
    }
  }

  public static int resto(int D, int d){
    if (D < d){ // Se il Dividendo è maggiore del divisore, allora si è arrivati
      return D; // alla fine della divisione, e quindi return il valore di D che resta
    } else {
      return resto(D - d, d); // Returniamo il valore del resto richiamando la
    }                         // funzione fino ad arrivare al valore base
  }

  public static boolean primo(int n, int i){
    if (i > 1){
      boolean vI = primo(n, i - 1);
      if (resto(n, i) != 0){
        return true;
      } else {
        return false;
      }
    } else {
      return true;
    }
  }
}
