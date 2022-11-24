/** Obiettivo:
    Descrivere, sotto forma di algoritmo,
	l'attività di un barista al bancone. */

// 1ma versione
prendereOrdinazione;
preparareOrdinazione;
servireOrdinazione;

// 2da versione
while (clienteAlBanco?) {
	if (non(clienteServito)?) {
		prendereOrdinazione;
		preparareOrdinazione;
		servireOrdinazione;
	} else {
		niente;
	}
	;
}
;
aspettaProssimoCliente;

// 3za versione

while (clienteAlBanco?) {
	if (non(clienteServito)?) {
		prendereOrdinazione;
		if (non(prodottoDisponibile)?){
			mostrareProdottiDisponibili;
			prendereOrdinazione;
		} else {
			preparareOrdinazione;
			servireOrdinazione;
		}
		;
	} else {
		niente;
	}
	;
}
;
aspettaProssimoCliente;


// 4ta versione

while (clienteAlBanco?) {
	if (non(clienteServito)?) {
		prendereOrdinazione;
		if (non(prodottoDisponibile)?){
			if (desideraAltro) {
				mostrareProdottiDisponibili;
				prendereOrdinazione;
			} else {
				niente;
			}
			;
		} else {
			niente;
		}
		;
		if (non(prodottoPronto)?){
				preparareOrdinazione;
		} else {
				servireOrdinazione;
		}
		;
	}
	;
}
;
aspettaProssimoCliente;


// Operazioni base = {preparareOrdinazione, servireOrdinazione}
// Condizioni = {prodottoDisponibile, clienteServito, clienteAlBanco}

// Raffinabili? = {prendereOrdinazione}
