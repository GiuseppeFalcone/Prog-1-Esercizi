// Ricorsiva Co-variante
/** OBIETTIVO.
  Dati x e y valori naturali, calcolare il valore x+y.

  L'algoritmo seguente deriva dalla rilettura dell'evoluzione dei valori
  della variabile che accumula il risultato in un algoritmo iterativo che calcola x+y:

  s_0 = x        // riletto come s(x,0)
  s_1 = s_0 + 1  // riletto come s(x,1) = s(x,0) + 1
  s_2 = s_1 + 1  // riletto come s(x,2) = s(x,1) + 1
  ...
  s_y = s_{y-1} + 1  // riletto come s(x,y) = s(x,y-1) + 1       */

// Capire il caso banale e poi pensare di saper risolverlo per un caso più facile

s(x, y){ // Risultato aspettato == x + y
  if (y == 0){ // Caso Base
    return x;
  } else { // Caso induttivo con y > 0
    valoreInduttivo = s(x, y-1); // == x + (y-1)
    risultato = valoreInduttivo + 1; //x + (y-1) + 1
    return risultato; // x + y
  }
} 
