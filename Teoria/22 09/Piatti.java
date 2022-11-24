/** Obiettivo:
    Descrivere, sotto forma di algoritmo, l'attività di lavare i piatti. */

/* In linea con quanto fatto sinora, una possibile descrizione è:

	ciclicamente, finché la pila di piatti non è vuota,
		prendiamo un piatto dalla pila,
		laviamo il piatto (operazione che può essere raffinata),
		riponiamo il piatto pulito.

	Quella appena data è la descrizione dell'iterazione di tre operazioni
	poste in sequenza.

	La descrizione in italiano appena definita è sintetizzabile per mezzo di
	alcuni passi di raffinamento.
*/

// 1ma versione
while (non(pilaVuota?)) {
	prende; // <-- raffinabile
	lava; // <-- raffinabile
}

// 2da versione
while (non(pilaVuota?)) {
	prende; // <-- raffinabile
	// lava
	while(non(pulito?)) {
		strofina;
	};
	risciacqua;
	ripone;
}

/* 3za versione. Raffiniamo "prende" per considerare la necessità di insaponare
periodicamente la spugna, cioè quando necessario.								 */
preparazione;
while (non(pilaVuota?)) {
	// prende
	if (non(spugnaInsaponata?)) {
		immergeSpugna; // in un contenitore di acqua con detersivo
	};
	prendePiatto; // <-- primitiva
	// lava
	while(non(pulito?)) {
		strofina;
	}
	risciacqua;
	ripone;
}

// Operazioni base = {ripone, risciaqua, strofina, prendoPiatto, immergeSpugna}
// Condizioni = {pilaVuota?, spugnaInsaponata?, pulito?}

/** Segue un esempio di riformulazione dello stesso problema, ma in forma
	*ricorsiva*.

	Svilupperemo il concetto ulteriormente, ma vale la pena cominciare ad
	intuire il significato di procedura, o algoritmo, ricorsivo.

	Un algoritmo A è ricorsivo quando risolve un problema P, spezzandolo
	in più sottoproblemi P1 ... Pn tali che:
	1. una parte dei sottoproblemi P1 ... Pn è risolvibile banalmente
	2. tra i restanti sottoproblemi P1 ... Pn che non si risolvono
	banalmente (almeno) uno è risolvibile per mezzo dello *stesso*
	algoritmo A che stiamo usando per risolvere l'intero problema.
*/

LAVA "tutti":
  if (pilaVuota?) {
	  niente; /* Ena pila vuota di piatti sporchi è anche
	             una pila vuota di piatti puliti.
	          */
  } else {
	  // Sottoproblemi del problema iniziale LAVA
    // La parte induttiva, noi assumiamo che abbiamo lavato tutti i piatti - 1, e quindi laviamo solo l'ultimo piatto rimasto
    // Discorso uguale alla dimostrazione induttiva in matematica
    LAVA "tutti - 1" /* Problema inziale, ma più semplice perché
	                      rimangono da lavare meno piatti, rispetto
	                      all'inizio.

	                      È risolvibile con lo stesso processo LAVA
						  che usiamo per risolve l'intero problema.
				       */
	  // lava
	  prendePiatto; // sporco dalla cima della pila
	  while(non(pulito?)) {
	      strofina;
	  };
	  ripone;
  }
