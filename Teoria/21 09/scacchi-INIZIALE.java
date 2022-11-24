/** Obiettivo:
    Descrivere, sotto forma di algoritmo,
    l'attività in prima persona uno scacchista
    mentre gioca una partita. */

/* 1ma versione */
while (non(terminata)?) {
  mossa;
  aspetta;
}
;
/* 2da versione */
while (non(terminata)?) {
  while (non(mossaMigliore)?) {
    pensareMossaMigliore;
  }
  ;
  spostarePedina;
}
;

/* 3za versione */

while (non(terminata)?) {
  while (non(mossaMigliore)?) {
    if (vantaggioPedine?) {
      pensareMossaAttacco;
    } else {
      if (pedineUguali?) {
        pensarePianoAttacco;
      } else {
        pensareMossaDifesa;
        }
        ;
    }
    ;
  }
  ;
  spostarePedina;
  if (reginaMangiata) {
    scacco;
  } else {
    if (mangiato?) {
        toglierePedina;
    } else {
      if (promosso?){
        sostituire;
      } else {
        niente;
      }
      ;
    }
    ;
    }
    ;

    if (giocoBloccato) {
      if (opponenteAccetta) {
        patta;
      } else {
        niente;
      }
    } else {
      abbandono;
    }
    ;

    if (scacco?) {
      
    }
}
;

/* 4ta versione */




// Operazioni base = { }
// Condizioni = { }




















/* Questione.
Come raffiniamo "termina?" ?
La partita continua se non si verificano le seguenti situazioni:
- scacco?
- patta?
- abbandono?
*/








/* Domanda.
Esiste un'alternativa per scrivere la condizione:
"non(scacco? oppure patta? oppure abbandono?)"
*/
