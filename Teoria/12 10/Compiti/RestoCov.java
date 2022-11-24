public class RestoCov {
  public static void main(String[] args) {
    System.out.println("Il resto è: " + resto(6, 2));
  }

  public static int resto(int D, int d){
    if (D < d){ // Se il Dividendo è maggiore del divisore, allora si è arrivati
      return D; // alla fine della divisione, e quindi return il valore di D che resta
    } else {
      return resto(D - d, d); // Returniamo il valore del resto richiamando la
    }                         // funzione fino ad arrivare al valore base
  }
}
