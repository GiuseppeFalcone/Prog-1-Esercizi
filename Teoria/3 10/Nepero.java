int n;
int e = nepero (n); // Richiamiamo la funzione

nepero (n){
  int i = 1; // Iniziamo da 1 visto che si inizia da 1 nella formula
  int somma = 1; // Somma parte da 1 visto che l'espressione lo richiede
   // Ciclo while per effettuare la somma
  while (i <= n) {
    somma = somma + (1/fattoriale(i)); // Sommiamo man a mano il valore precedente
    i = i + 1;                         // con il valore della frazione fratto
  }                                    // il fattoriale di i, richiamando la funzione
  return somma;
}


fattoriale (x) {
  int i = 0;
  int f = 1; // Impostando il valore del risultato finale ad 1 includiamo il fattoriale
  while (i < x) { // di 0 == 1
    f = f * (x - i); // moltiplichiamo il valore precedente con quello successivo
    i = i + 1;       // ottenuto sottraendo ad x il valore di i,
  }                  // quindi sarà 1 * (x) * (x - 1) ... * 3 * 2 * 1
  return f;
}
