public class PariDispari {
  public static void main (String[] args){
    int n = 7;
    boolean d = dispari(n);
    System.out.println(d);
  }

  public static boolean dispari (int n){ // true se n è dispari false se pari
    boolean vB = false;
    boolean vI = false;
    boolean r;

    if (n >= 1){ // Passo Induttivo
      vI = dispari(n - 1); // Valore true o false di n - 1
      r = !vI; // Cambiamo valore visto che se n - 1 è pari allora n è dispari
      return r;
    } else {
      vB = false; // Se n = 0 sappiamo che 0 è pari quindi false
      return vB;
    }
  }
}
