/** Evidenzia la valutazione lazy degli operatori logici.
    - in una espressione exp_1 && exp_2 && .. && exp_n la JVM
    si valuta sino alla prima espressione exp_i il cui valore è
    risulta essere false. Da quel momento in poi è inutile
    proseguire perché il risultato sarebbe false comunque
    - in una espressione exp_1 || exp_2 || .. || exp_n la JVM
    si valuta sino alla prima espressione exp_i il cui valore è
    risulta essere true. Da quel momento in poi è inutile
    proseguire perché il risultato sarebbe true comunque
 */
public class OperatoriLogiciLazy {
  public static void main(String[] args) {
    andLazy();
    orLazy();
  }

  public static void andLazy() {
    System.out.println("----------- L'operatore '&&' è lazy");
    /* La strategia per verificare la valutazione lazy
     * dell'operatore && è metterci nella condizione di
     * evitare la valutazione di una espressione che,
     * se valutata, produca un run-time error.
     *
     * Assumiamo a = 1 e consideriamo l'espressione
     *
     *         b != 0 && a/b   (1)
     *
     * Se b vale 0, allora a/b è priva di senso.
     * Altrimenti, con b diverso da 0, il valore a/b
     * esiste.
     *
     * Poniamo quindi:
     */
    int a = 1;
    int b = 0;
    /* Se Java non valutasse (1) con una strategia lazy,
     * ovvero se valutasse entrambi gli argomenti b!=0
     * e a/b in (1) avremmo un errore di 'divisione per 0'.
     */
    boolean risultato = ((b != 0) && (a/b != 0));
    System.out.println("risultato vale " + risultato + ".");
    System.out.println("Valore atteso per risultato è false.");
    System.out.println("Nessun errore 'division by zero'.");
   /* Se, invece, definissimo
    *
    * boolean risultato = ((a/b != 0) && (b != 0)); (2)
    *
    * la compilazione di (2) non genererebbe errore,
    * ma la sua interpretazione sì.
    *
    * ESERCIZIO.
    * Verificare la previsione.
    */
  }
  public static void orLazy() {
    System.out.println("----------- L'operatore '||' è lazy");
    /* La strategia per verificare la valutazione lazy
     * dell'operatore || è metterci nella condizione di
     * evitare la valutazione di una espressione che,
     * se valutata, produca un run-time error.
     *
     * Assumiamo a = 1 e consideriamo l'espressione
     *
     *         b = 0 || a/b   (1)
     *
     * Se b vale 0, allora a/b è priva di senso.
     * Altrimenti, con b diverso da 0 il valore a/b
     * esiste.
     *
     * Poniamo quindi:
     */
    int a = 1;
    int b = 0;
    /* Se Java non valutasse (1) con una strategia lazy,
     * ovvero se valutasse entrambi gli argomenti b==0
     * e a/b in (1) avremmo un errore di 'divisione per 0'.
     */
    boolean  risultato = ((b == 0) || (a/b != 0));
    System.out.println("risultato vale " + risultato + ".");
    System.out.println("Valore atteso per risultato è true.");
    System.out.println("Nessun errore 'division by zero'.");
   /* Se, invece, definissimo
    *
    * boolean  risultato = ((a/b != 0) || (b = 0)); (2)
    *
    * la compilazione di (2) non genererebbe errore,
    * ma la sua interpretazione sì.
    *
    * ESERCIZIO.
    * Verificare la previsione.
    */
  }
}
