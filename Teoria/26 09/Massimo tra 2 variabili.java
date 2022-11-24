/** OBIETTIVO.
    Date due variabili x e y, determinare il massimo dei
	  valori memorizzati in x e y */

/* ---------------------------------------------- */
/* 1ma soluzione. Usa il meccanismo di scambio con
   la variabile temporanea.

   ESEMPIO.
   Supponiamo che inizialmente sia vero:
		x==5 e y==3;

   Al termine, la configurazione cercata è:
	 y == 5 == massimo{3, 5} == 5 .                                        */

// x==?, y==?, tmp==?
x = 5;
y = 3;
if (x > y) {
	 tmp = x;
   x = y;
   y = tmp;
} else {
}
/* In questo caso vogliamo memorizzare il valore maggiore nella variabile y,
Se questo fosse già così in partenza non dovremmo fare nulla, quindi controlliamo
se fosse il contriario, quindi se x > y.
Nel caso in cui il valore di x > y andremo a memorizzare il valore di x in una
variabile temporanea, poi assegnamo ad x il valore di y, quindi il valore minore,
per poi assegnare ad y il valore massimo, quindi quello precedentemente contenuto
in x.

/* ---------------------------------------------- */
/* 2da soluzione. Sfrutta il fatto che stiamo scambiando
   valori numerici. */

x = 5;
y = 3;
if (x > y) {
    x = x + y;
    y = x - y;
    x = x - y;
} else {
}
/* In questo caso vogliamo sapere quale sia il valore maggiore tra i due, e vogliamo
memorizzare questo nella variabile y.
Per fare ciò controlliamo se x è maggiore di y, se questo fosse vero procediamo con
una serie di istruzioni per arrivare al nostro obbiettivo, altrimento non dovremmo
fare nulla.
Quindi controlliamo con la condizione x > y e se il risultato è true, quindi vero,
entreremo all'interno dell'if, qui
1) dapprima aggiungiamo al valore di x quello di y, e lo memorizziamo sempre dentro la variabile x.
2) In seguito sottraiamo il valore di y ad x e memoriazziamo il risultato ad y,
  questo sarà il valore maggiore tra i due.
3) Dopo passiamo a sottrarre il valore di y ad x e memorizziamo il risultato nella variabile
  x, questo sarà il valore minore tra i due. il fatto che sia il valore minore è perché
  in questo passaggio non sottraiamo ad x il valore iniziale di y, ma quello ottenuto
  nel passaggio 2, quindi quello maggiore.
*/

/* ---------------------------------------------- */
/* 3za soluzione. Usa tre variabili:
	- due contengono i valori di cui trovare il massimo,
	- la rimanente variabile, al termine dell'algoritmo, conterrà il massimo.

	ESEMPIO.
  Data la configurazione inziale:
		x == 3, y == 5, m = ???
	la configurazione finale deve assicurare che:
	  m==massimo{3, 5}. */

x = 3;
y = 5;
if (x > y) {
	m = x;
} else {
	m = y;
}
/* In questo caso, per trovare il valore maggiore tra le due variabli effettuiamo
un controllo, se x è maggiore di y assegnamo il valore di x ad una nuova variabile
m, nel caso la condizione non fosse vera questo vorrà dire che y è il valore maggiore
tra i due, quindi andremo ad assegnare alla variablie m il valore di y.
Il risultato finale sarà che qualunque sia il valore maggiore, questo sarà memorizzato
nella variabile m.
*/

/* ---------------------------------------------- */
/* 4ta soluzione. Usa tre variabili:
	- due contengono i valori di cui trovare il massimo,
	- la rimanente, al termine dell'algoritmo, conterrà:
		+ true se x contiene il valore massimo
		+ false se y contiene il valore massimo. */

/* L'obiettivo di quiesta versione è ottenere una configurazione finale
   descivibile come segue:

	 - se x > y allora, nella configurazione finale, m contiene
     il valore true
	 - se x <= y allora, nella configurazione finale, m contiene
     il valore false
   In nessuno dei due casi x e y hanno cambiato valore
*/

x = 21;
y = 5;
if (x >= y) {
	m = true;
} else {
	m = false;
}
/* Per controllare se il valore memorizzato in x sia maggiore di y effettueremo
un controllo tramite un if, la cui condizione sarà x maggiore o uguale ad y, se questa
sarà vera andremo ad assegnare il valore di true (vero) alla variabile booleana m,
nel caso la condizione sia falsa, andremo ad assegnare il valore di false (falso)
*/

/* ---------------------------------------------- */
/* 5ta soluzione, derivata dalla 4ta*/

/* L'obiettivo di questa versione è ottenere una configurazione finale
   descivibile come segue:

	 - se x > y allora, nella configurazione finale, m contiene
     il valore true
	 - se x <= y allora, nella configurazione finale, m contiene
     il valore false
   In nessuno dei due casi x e y hanno cambiato valore
*/

x = 5;
y = 5;
m = x >= y;
/* Avendo due valori memorizzati nelle variabili x, y, vogliamo sapere se x sia maggiore
di y, questo lo deduciamo se la variabile booleana m avrà come risultato true o false,
e l'assegnazione di esso è basato sull'espressione x >= y, che se fosse vera, anche il
valore di m è vero, quindi true, se fosse falsa il valore è false.
In pratica questa versione è la stessa logica dietro la 4ta versione, ma senda esplicitando
il costrutto if else
*/

/* DISPENSE: Sezione 2.2. */
