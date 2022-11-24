/** OBIETTIVO.
   Date quattro variabili a, b, c, d, scrivere un algoritmo che riorganizzi i
   valori in esse contenuti, in modo che, al termine, la variabile d contenga il
   valore massimo, inizialmente in a, b ,c ,d.

ESEMPIO.
Costruita la configurazione seguente:

  a == 3,  b == 11, c == 8, d == 2

occorre produrre una configurazione finale tale che:

  d == massimo{3, 11, 8, 2} == 11

in cui non si mettono vincoli su cosa a, b, c debbano contenere.
*/

/*
  Per far si che il valore maggiore sia nell'ultima variabile utilizziamo un
  metodo di Bubble Sorting, ovvero:
  - Analizziamo le variabili a coppie, iniziando dalla prima e cambiando il valore
    di esse solo se la variabile più vicina all'ultima abbia il valore minore fra di esse.
  - Proseguiamo prendendo in considerazione la seconda e la terza variabile, e
    analizziamo dinuovo scambiando i valori se la variabile più vicina all'ultima
    non abbia il valore maggiore,
  - E così via finché non arriveremo all'ultima coppia, quella composta dalla
    penultima e ultima variabile, ove scambieremo i valori sempre seguendo la
    condizione in cui l'ultima deve avere il valore maggiore alla fine.
  - Se reiteriamo tutto ciò alla fine potremo avere tutte e 4 le variabili con i valori
    ordinati dal minore al maggiore.
*/
a = 3;b = 11;c = 8;d = 2;
//a==3, b==11, c==8, d==2
if (a > b) {
  tmp = a;
  a = b;
  b = tmp;
}

if (b > c) {
  tmp = b;
  b = c;
  c = tmp;
}

if (c > d) {
  tmp = c;
  c = d;
  d = tmp;
}

// Qui passiamo a reiterare la procedura passando al
// metodo del Bubble Sorting
a = 3;b = 11;c = 8;d = 2;
//a==3, b==11, c==8, d==2
while (i < 3) {
  if (a > b) {
    tmp = a;
    a = b;
    b = tmp;
  }

  if (b > c) {
    tmp = b;
    b = c;
    c = tmp;
  }

  if (c > d) {
    tmp = c;
    c = d;
    d = tmp;
  }
  i = i + 1;
}
