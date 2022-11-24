/** OBIETTIVO.
  Dati x e y valori naturali, calcolare il valore x^y.

  L'algoritmo seguente deriva dalla rilettura dell'evoluzione dei valori della variabile che accumula il risultato in un algoritmo iterativo che calcola x^y:

  e_0 = 1        // riletto come e(x,0) = 1
  e_1 = e_0 * x  // riletto come e(x,1) = e(x,0) * x
  e_2 = e_1 * x  // riletto come e(x,2) = e(x,1) * x
  ...
  e_y = e_{y-1} * x // riletto come e(x,y) = e(x,y - 1) * x  */

  esp(x, k){
    if (k == 0){
      return 1;
    } else {
      risInd = esp (x, k - 1);
      r = risInd * x;
      return r;
    }
  }
