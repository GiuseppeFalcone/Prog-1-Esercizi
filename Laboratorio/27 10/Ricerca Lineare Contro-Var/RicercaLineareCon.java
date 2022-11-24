public class RicercaLineareCon {

  /* x può essere null */
  public static boolean ricercaLineareCon (int[] x, int e) {
    boolean esiste = x != null;
    if (esiste) { //Controlliamo se x è diverso da null, e in caso procediamo con l'algoritmo
      esiste = ricercaLineareCon(x, e, 0);
    }
    return esiste;
  }

  /* 1ma versione */
  public static boolean ricercaLineareCon (int[] x, int e, int i) {
    if(i == x.length){ // Cerchiamo e in un intervallo [0, x.length)
      return false; //returniamo false da momento che non è possibile trovare e in un intervallo vuoto
    } else {
      boolean vI = ricercaLineareCon(x, e, i+1);
        //Questo ritorna true o false a seconda se e si trova dentro x con intervallo
        //con i in [i+1, ... , x.length)
      if (x[i] == e) {
        return true;
      } else {  //Se non lo abbiamo trovato ritorniamo il valore induttivo
        return vI;
      }
    }
  }

  /* versione "più logica" */
  public static boolean ricercaLineareConLogica (int[] x, int e) {
    boolean esiste = x != null;
    if (esiste) { //Controlliamo se x è diverso da null, e in caso procediamo con l'algoritmo
      esiste = ricercaLineareConLogica(x, e, 0);
    }
    return esiste;
  }

  public static boolean ricercaLineareConLogica (int[] x, int e, int i) {
    if (i == x.length) {
      return false;
    } else {
        // Si può fare anche in questo modo, visto che ritorniamo true se e in x[i]
        //oppure se e era già presente nell'intervallo precendente
        if (x[i] == e || ricercaLineareConLogica(x, e, i+1)) {
          return true;
        } else {
          return false;
        }
      }
  }
}
