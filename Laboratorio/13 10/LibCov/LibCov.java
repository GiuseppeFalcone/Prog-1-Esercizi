public class LibCov{

  public static boolean dispari (int n){ // true se n è dispari false se pari
    if (n >= 1){ // Passo Induttivo
      return !dispari(n-1); //Ritoriamo il valore opposto di n-1
    } else {
       return false;// Se n = 0 sappiamo che 0 è pari quindi false
    }
  }

  public static int quadrato(int n){ // Risultato atteso (n + 1)^2 == n^2 + 2n + 1
    if (n == 0){ // Caso Base se n = 0 , (0 + 1)^2 = 1
      return 1;
    } else {
      return (quadrato(n-1) + 2*n + 1);
    }
  }

  public static int sommaNDispari(int n){
    if (n == 1){
      return 1;
    } else {
      if(dispari(n)){
        int vI = sommaNDispari(n - 1) + n;
        return vI;
      } else{
        return sommaNDispari(n-1);
      }
    }
  }

  public static boolean pariPerSottr(int n){// true pari | false dispari
    if (n >= 0){
      if (n == 0){
        return true;
      } else {
        boolean vI = pariPerSottr(n - 2);
        return vI;
      }
    } else {
      return false;
    }
  }

  public static int quoz(int D, int d){
    if (D < d){
      return 0;
    } else
      return quoz(D-d, d) + 1;
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

  public static int sommaDivisori(int n, int i){
    int vI;
    if (i > 0){
      vI = sommaDivisori(n, i - 1);
      if (resto(n, i) == 0){
        vI += i;
      }
      return vI;
    } else {
      return 0;
    }
  }
}
