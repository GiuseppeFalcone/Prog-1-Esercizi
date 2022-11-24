/** Obiettivo:
    Descrivere, sotto forma di algoritmo, lo svolgersi di una telefonata. */

/* 1ma versione */
numerazione; // composizione in sequenza di due operazioni
interazione;

/* 2da versione
Cerchiamo di dare una forma specifica alle azioni da fare */
//Possiamo espandere la numerazione
numero;
.
.
.
10 volte
.
numero;
interazione;

/* 3za versione
introduciamo l'iteratività utilizzando il ciclo while
Questo rende più flessibile il programma,
non serve riscrivere per 10 o 20 volte l'inserimento del numero */
while (necessario) {
	numero;
}
;
interazione; //l'interazione potrebbe dare come risultato: occupato, segreteria; interlocutore

/* 4ta versione
Sviluppiano le varie possibilità dell'interazione*/
while (necessario?) {
	numero;
}
;
while (squillo?) {attendo;}
;
if(non(occupato?)){
	if (segreteria?){
		lasciaMessaggio; //raffinare l'operazione di lasciaMessaggios
	} else {
		niente;
	}
	;
	if (interlocutore?) {
		parlo;
	} else {
		niente;
	}
	;
} else{
	niente;
}
;
riattaccare;

/* 5ta versione
Espansione della segreteria telefonica */
while (necessario?) {
	numero;
}
;
while (squillo?) {attendo;}
;
if(non(occupato?)){
	if (segreteria?){
		if (beep?) {
			parlare;
		} else {
			niente;
		}
		;
	} else {
		niente;
	}
	;
	if (interlocutore?) {
		parlo;
	} else {
		niente;
	}
	;
} else{
	niente;
}
;
riattaccare;


// Operazioni base = { niente, riattaccare, parlo }
// Condizioni = { occupato, segreteria, interazione, necessario, squillo}
// Raffinabile = { lasciaMessaggio  }




/* COMPITO: immaginare come gestire una interazione in cui si debba
reagire alle seguenti situazioni:
- risponde la segreteria

Occorre usare *solo* parole composte con *sequenze* ed *iterazioni*.
*/
