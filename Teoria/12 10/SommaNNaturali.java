/** OBIETTIVO.
  Dato un numero naturale n calcolare 0+1+2+...+(n-1), cioè la somma dei primi na numeri naturali.

  L'algoritmo seguente deriva dalla rilettura dell'evoluzione dei valori della variabile che accumula il risultato in un algoritmo iterativo che calcola 0+1+2+...+n:

  s_0 = 0        // riletto come s(0) = 0
  s_1 = s_0 + 0  // riletto come s(1) = s(0) + 0
  s_2 = s_1 + 1  // riletto come s(2) = s(1) + 1
  s_3 = s_2 + 2  // riletto come s(3) = s(2) + 2
  ...
  s_i = s_{i-1} + (i-1) // riletto come s(i) = s(i - 1) + (i-1)
  ...
  s_n = s_{n-1} + n // riletto come s(n) = s(n - 1) + (n-1)  */
n =5

s(n){
  if (n == 0){
    return 0;
  } else {
    rI = s(n - 1);
    r = rI + (n - 1);
    return r;
  }
}
