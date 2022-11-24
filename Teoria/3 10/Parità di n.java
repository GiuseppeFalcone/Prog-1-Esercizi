/** OBIETTIVO. Dato un numero naturale n stabilire se n è pari o dispari.
Tipicamente di dice che se n è pari, allora occorre restituire il valore 'vero'; altrimenti il risultato deve essere 'falso'.

IDEA. Sottrarre ripetutamente 2 da n finché il resto non uno dei valori nell'insieme {1, 0}.
Nel primo caso si restituisce il valore 'vero', o meglio true, altrimenti il valore 'falso', o meglio false.

L'ipotesi è di mantenere in r il resto di quanto rimane dopo aver ripetutamente tolto 2, a partire da n:

r = n
r = r - 2
r = r - 2
r = r - 2

finché non arrivo ad una delle due situazioni:
 - r contiene 1, quindi n è dispari, quindi memorizzo false in p
 - r contiene 0, quindi n è    pari, quindi memorizzo true  in p */

/* 1ma versione   */
// n == ?, r == ?, p == ?
n = 4; r = n;
while (r > 1) {
 r = r - 2
};
if (r == 0) { // selezione eliminabile come nella 2da versione qui sotto
 p = true;
} else {
 p = false;
}


/* 2da versione   */
n = 4; r = n;
while (r > 1) {
 r = r - 2
};
p = (r == 0); /* Assegna a p il valore restituito dall'espressione 'r == 0'.
                L'espressione 'r == 0' restituisce true se il valore in r è 0.
                L'espressione 'r == 0' restituisce false se il valore in r non è 0. */
