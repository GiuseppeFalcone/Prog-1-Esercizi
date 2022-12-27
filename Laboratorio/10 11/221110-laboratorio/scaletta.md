---
output: pdf_document
linkcolor: cyan
urlcolor: blue
citecolor:	green
---

## Scaletta 10/11/22

### Parte Collettiva

1. Sintesi di un metodo iterativo che, dati due *array* `a` e `b`, produce un terzo *array* `c` in cui `a[0,...,a.length)` coincide con `c[0,...,a.length)` e `b[0,...,b.length)` coincide con `c[a.length,...,a.length+b.length)`.

   - [AppendItTest.java](https://drive.google.com/open?id=1AcrfJKFeO7MPazmXHynRjSZE2zPCe5UX&authuser=luca.roversi%40unito.it&usp=drive_fs) è la classe di *test* che illustra il comportamento atteso del metodo

   - Da [AppendIt.java](https://drive.google.com/open?id=1AcV0ZKHCNz2-RicNjQcxgjOq21MdG0Om&authuser=luca.roversi%40unito.it&usp=drive_fs) a [AppendItFinale.java](https://drive.google.com/open?id=13glfuHzpipoOwyhUA0AQMDHqgwf3mulm&authuser=luca.roversi%40unito.it&usp=drive_fs) che introduce il costrutto iterativo `for`

2. Sintesi di un metodo ricorsivo dicotomico che, applicato ad un *array* `a` e un valore `v`, restituisce un *array* i cui elementi sono quelli di `a` strettamente inferiori a `v`, rispettando il seguente vincolo: 

   > "L'*array* `a` **deve essere percorso una sola volta**, cioè non è ammesso contare in anticipo quanti elementi occorrerà filtrare per fissare dimensione dell'*array* da restituire come risultato."

   - [FiltroDiTest.java](https://drive.google.com/open?id=1AcG6OSuKVBOCf5DiJCX8bHy-mo0-zdiX&authuser=luca.roversi%40unito.it&usp=drive_fs) illustra cosa ci si aspetta

   - Da [FiltroDi.java](https://drive.google.com/open?id=1Ab6leBTGLgYTNXmyhVoEFwS3cS0GjUKC&authuser=luca.roversi%40unito.it&usp=drive_fs) a [FiltroDiFinale.java](https://drive.google.com/open?id=13jg6TFqtYgsxQe3TQ1z86dCKmQKZfZdy&authuser=luca.roversi%40unito.it&usp=drive_fs) 

   - [FiltroDiSimulazione.java](https://drive.google.com/open?id=13mXiGb1v4C0w6YVazAb8jFblgM7e8dGM&authuser=luca.roversi%40unito.it&usp=drive_fs) è una versione adatta per la simulazione per visualizzare quali e quanti *array*, diversi dei quali diventeranno inaccessibili, sono generati nello *heap*

### Parte in autonomia
1. Sintetizzare due classi Java:

   - `FiltriArrayDi.java`

   - `FiltriArrayDiTest.java`

   la prima con soli metodi ricorsivi dicotomici che soddisfano le specifiche qui sotto elencate, la seconda classe di *test* della prima.

   Siccome le specifiche richiedono di filtrare gli elementi di un *array* dato, ottimo sarebbe avere due versioni di ciascun metodo:

   - _Prima versione_. Si scorre due volte l'*array* da cui filtrare:  

     - una per contare il numero di elementi da filtrare, 

     - una per filtrarli effettivamente

   - _Seconda versione_. Si scorre l'*array* una sola volta.

   Le specifiche sono quelle già incontrate:
 
   - Dati un *array* `a` ed un intero `limiteSuperiore`, restituire un *array* con tutti e soli i valori interi in `a` minori del valore `limiteSuperiore`

   - Dato un *array* `a`, restituire un *array* con tutti e soli gli elementi dispari di `a`

   - Dato un *array* `a`, restituire un *array* con tutti e soli gli elementi che in `a` occupano posizioni pari

   - Dato un *array* `a`, restituire un *array* con tutti e soli gli elementi che in `a` occupano una posizione dispari avendo, simultaneamente, valore pari

   - Dati un *array* `a` e due valori `min` e `max`, restituire tutti e soli gli elementi di `a` compresi tra `min` e `max`

   - Dati un *array* `a` ed un valore `riferimento`, restituire *array* con tutti e soli i valori di `a` che sono il doppio del valore `riferimento`

2. Dati un *array*  `a` ed un valore `v`, restituire un *array* con tutti gli indici, tranne quello di valore minimo e di valore massimo, degli elementi di `a` che contengono `v`. `E possibile visitare più volte l'*array* `a` .

   - [CercaNoMinNoMaxTest.java](https://drive.google.com/open?id=1ALMJhrDpgjvg-W16wrwIoW-RYhoIUSU7&authuser=luca.roversi%40unito.it&usp=drive_fs) è la classe che contiene un insieme essenziale di *test*  da soddisfare
  
   - [CercaNoMinNoMax.java](https://drive.google.com/open?id=1AMmdeYQjMbAHDKYOzlPzhjFLd6jZSw30&authuser=luca.roversi%40unito.it&usp=drive_fs) è una possibile soluzione

3. Scrivere una versione ricorsiva a piacere `appendRicorsiva(int[],int[])` di `appendIt(int[],int[])`. La versione più naturale dovrebbe essere quella contro-variante

4. Sintetizzare una versione ricorsiva dicotomica del metodo che, dati due array `a` e `b` determina se `b` è uguale ad almeno un sotto-*array* di `a`. In caso positivo restituisce l'indice di `a` in corrispondenza del quale inizia `b`. Se `b` non compare in `a`, allora il risultato è `-1`.
   - [SubSeqItFinaleTest.java](https://drive.google.com/open?id=1ZxMD9H1sA9o9KXvczJyIG5Yf42iLnygX&authuser=luca.roversi%40unito.it&usp=drive_fs) contiene degli esempi

   - [SubSeqItFinale.java](https://drive.google.com/open?id=1ZvXvOp_ZPSnc3uJXkOP8vHvw3jJDLaPk&authuser=luca.roversi%40unito.it&usp=drive_fs) contiene una possibile soluzione iterativa

   - [SubSeqDiFinaleTest.java](https://drive.google.com/open?id=1_pOOZk3j1r5N1YErPjGJ_BDpvf88SNVe&authuser=luca.roversi%40unito.it&usp=drive_fs) contiene degli esempi

   - [SubSeqDiFinale.java](https://drive.google.com/open?id=1_pHIa7LQIzy62hiROqllFMzsNjWOakVi&authuser=luca.roversi%40unito.it&usp=drive_fs) contiene una possibile soluzione ricorsiva dicotomica


## Video
- [Parte I](https://kmc.l2l.cineca.it/p/107/sp/10700/embedIframeJs/uiconf_id/23449779/partner_id/107?iframeembed=true&playerId=kaltura_player&entry_id=0_ainz96nh&flashvars[streamerType]=auto&amp;flashvars[localizationCode]=en&amp;flashvars[leadWithHTML5]=true&amp;flashvars[sideBarContainer.plugin]=true&amp;flashvars[sideBarContainer.position]=left&amp;flashvars[sideBarContainer.clickToClose]=true&amp;flashvars[chapters.plugin]=true&amp;flashvars[chapters.layout]=vertical&amp;flashvars[chapters.thumbnailRotator]=false&amp;flashvars[streamSelector.plugin]=true&amp;flashvars[EmbedPlayer.SpinnerTarget]=videoHolder&amp;flashvars[dualScreen.plugin]=true&amp;flashvars[Kaltura.addCrossoriginToIframe]=true&amp;&wid=0_fkktn6yi)
- [Parte II](https://kmc.l2l.cineca.it/p/107/sp/10700/embedIframeJs/uiconf_id/23449779/partner_id/107?iframeembed=true&playerId=kaltura_player&entry_id=0_rzyjyyqn&flashvars[streamerType]=auto&amp;flashvars[localizationCode]=en&amp;flashvars[leadWithHTML5]=true&amp;flashvars[sideBarContainer.plugin]=true&amp;flashvars[sideBarContainer.position]=left&amp;flashvars[sideBarContainer.clickToClose]=true&amp;flashvars[chapters.plugin]=true&amp;flashvars[chapters.layout]=vertical&amp;flashvars[chapters.thumbnailRotator]=false&amp;flashvars[streamSelector.plugin]=true&amp;flashvars[EmbedPlayer.SpinnerTarget]=videoHolder&amp;flashvars[dualScreen.plugin]=true&amp;flashvars[Kaltura.addCrossoriginToIframe]=true&amp;&wid=0_5hq91xf6)
- [Parte III](https://kmc.l2l.cineca.it/p/107/sp/10700/embedIframeJs/uiconf_id/23449779/partner_id/107?iframeembed=true&playerId=kaltura_player&entry_id=0_1vw64cae&flashvars[streamerType]=auto&amp;flashvars[localizationCode]=en&amp;flashvars[leadWithHTML5]=true&amp;flashvars[sideBarContainer.plugin]=true&amp;flashvars[sideBarContainer.position]=left&amp;flashvars[sideBarContainer.clickToClose]=true&amp;flashvars[chapters.plugin]=true&amp;flashvars[chapters.layout]=vertical&amp;flashvars[chapters.thumbnailRotator]=false&amp;flashvars[streamSelector.plugin]=true&amp;flashvars[EmbedPlayer.SpinnerTarget]=videoHolder&amp;flashvars[dualScreen.plugin]=true&amp;flashvars[Kaltura.addCrossoriginToIframe]=true&amp;&wid=0_5zdn02bl) 