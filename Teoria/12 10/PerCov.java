/** OBIETTIVO.
  Dati x e y valori naturali, calcolare il valore x*y.

  L'algoritmo seguente deriva dalla rilettura dell'evoluzione dei valori della variabile che accumula il risultato in un algoritmo iterativo che calcola x*y:

  m_0 = 0        // riletto come m(x,0) = 0
  m_1 = m_0 + x  // riletto come m(x,1) = m(x,0) + x
  m_2 = m_1 + x  // riletto come m(x,2) = m(x,1) + x
  ...
  m_y = m_{y-1} + x // riletto come m(x,y) = m(x,y-1) + x       */
x = 4;
y = 3;

per(x, y) {
  if (y == 0){
    risultato 0;
  } else {
    valoreInduttivo = per(x, y - 1); // 4 * 2 == x + x == 4 + 4 == 8   // 4 * 0= 0
    risultato = valoreInduttivo + x; // == 4 * 3 == x + x + x == 4 + 4 + 4 == 12 // 0 + 4 == 4
    return risultato; // == 12 // 4
  }
}

// 4 + 4 + 4
