---
output: pdf_document
linkcolor: cyan
urlcolor: blue
citecolor:	green
---

## Scaletta 09/11/22

1. Sintesi di un metodo *wrapper* che, dati un *array* qualsiasi `a`, anche `null` o con `0` elementi, ed un valore `v`, richiama un metodo ricorsivo dicotomico che restituisce il più piccolo indice dell'elemento di `a` uguale a `v`, se `v` occorre in `a` almeno una volta. Altrimenti restituisce `-1`.

   - Da [RicercaArrayQualsiasiDi.java](https://drive.google.com/open?id=1Es-BeCR309HJJWKa78SfTAIbLRWQweFy&authuser=luca.roversi%40unito.it&usp=drive_fs) a [RicercaArrayQualsiasiDiFinale.java](https://drive.google.com/open?id=1EsTNEaDm5XtddLc8PuU3WCZaNTrYnw0H&authuser=luca.roversi%40unito.it&usp=drive_fs)
   
   - Da [RicercaArrayQualsiasiDiFinale.java](https://drive.google.com/open?id=1EsTNEaDm5XtddLc8PuU3WCZaNTrYnw0H&authuser=luca.roversi%40unito.it&usp=drive_fs) a [RicercaArrayQualsiasiMiglioratoDiFinale.java](https://drive.google.com/open?id=13QbkEwfTJSPGMWDmms5VcEX20gk9w6gc&authuser=luca.roversi%40unito.it&usp=drive_fs) sotto l'ipotesi di lasciar cadere il vincolo di trovare l'indice più piccolo in cui occorre `v`.

     La variante migliorativa giustifica la forma generale data sulle dispense ad un algoritmo ricorsivo dicotomico, la quale tiene conto anche del caso in cui l'intervallo degli elementi da visitare si vuoti 

2. Sintesi di un metodo *wrapper* che, dati un *array* **ordinato** `a`, anche `null` o con `0`  elementi, ed un valore `v`, richiama un metodo ricorsivo dicotomico che restituisce il più piccolo indice dell'elemento di `a` uguale a `v`, se `v` occorre in `a` almeno una volta. Altrimenti restituisce `-1`.

   Da [RicercaArrayOrdinatoDi.java](https://drive.google.com/open?id=1FgQtsrkOS6XFQWMWav1hmwb0bN4nGb-l&authuser=luca.roversi%40unito.it&usp=drive_fs) a [RicercaArrayOrdinatoDiFinale.java](https://drive.google.com/open?id=1FiirZEkoZpbJ9tdwajDBYF7HnQx8BKVN&authuser=luca.roversi%40unito.it&usp=drive_fs)

3. Sintesi/lettura dell'algoritmo `Merge` (fusione) che, dati due *array* **ordinati** `a` e `b`, restituisce un *array* **ordinato** con tutte e sole le occorrenze dei valori inizialmente in `a` e `b`.
   
   - [MergeFinale.java](https://drive.google.com/open?id=1FbVy7_wFwp_xYs46T24MVMg19qMw_uqx&authuser=luca.roversi%40unito.it&usp=drive_fs) contiene un possibile algoritmo 
  
   - [MergeAlgoritmoSimulazione.pdf](https://drive.google.com/open?id=1EvePlEaCcWLlwyU6mplZW4g24B98ivGW&authuser=luca.roversi%40unito.it&usp=drive_fs) è una possibile simulazione statica

4. Sintesi dell'algoritmo di ordinamento `Merge sort` che, dato un *array*  `a`, ne restituisce uno con tutti e soli gli elementi di `a` disposti in ordine non decrescente.

   - Da [MergeSort.java](https://drive.google.com/open?id=1F5SBBwXs4twZDB5vz51q2vk16tclm60R&authuser=luca.roversi%40unito.it&usp=drive_fs) a [MergeSortFinale.java](https://drive.google.com/open?id=1FcfedcEPjHkd-mcbse4lQmW20la3yQZK&authuser=luca.roversi%40unito.it&usp=drive_fs)

   - [MergeSortPassoInduttivo.pdf](https://drive.google.com/open?id=1EvO9r-dc1fYp5pUWutYQzTNJvysO35sx&authuser=luca.roversi%40unito.it&usp=drive_fs) è un esempio di come applicare il solo passo induttivo dell'algoritmo `Merge sort`, immaginando di avere a disposizione `Merge`


### Compito 09/11/22
1. Perché [RicercaArrayQualsiasiErratoDi.java](https://drive.google.com/open?id=13QfqAjFTuwv3Tho3qAQUpld-Y9wD6LVj&authuser=luca.roversi%40unito.it&usp=drive_fs) non è corretto rispetto alla specifica: 
   
   > "Sintesi di un metodo *wrapper* che, dati un *array* qualsiasi `a`, anche `null` o con `0` elementi, ed un valore `v`, richiama un metodo ricorsivo dicotomico che restituisce il più indice piccolo dell'elemento di `a` uguale a `v`, se `v` occorre in `a` almeno una volta. Altrimenti restituisce `-1`" ?

2. Migliorare la struttura di [RicercaArrayOrdinatoDiFinale.java](https://drive.google.com/open?id=1FiirZEkoZpbJ9tdwajDBYF7HnQx8BKVN&authuser=luca.roversi%40unito.it&usp=drive_fs) immaginando di restituire *uno qualsiasi*, non necessariamente il più piccolo, degli indici degli elementi di `a` che contiene `v`. Lo scopo è evitare qualsiasi chiamata ricorsiva il prima possibile.

   [RicercaArrayQualsiasiMiglioratoDi.java](https://drive.google.com/open?id=13QbkEwfTJSPGMWDmms5VcEX20gk9w6gc&authuser=luca.roversi%40unito.it&usp=drive_fs) è una possibile soluzione

## VIDEO

- [Parte I](https://kmc.l2l.cineca.it/p/107/sp/10700/embedIframeJs/uiconf_id/23449779/partner_id/107?iframeembed=true&playerId=kaltura_player&entry_id=0_amhpqc73&flashvars[streamerType]=auto&amp;flashvars[localizationCode]=en&amp;flashvars[leadWithHTML5]=true&amp;flashvars[sideBarContainer.plugin]=true&amp;flashvars[sideBarContainer.position]=left&amp;flashvars[sideBarContainer.clickToClose]=true&amp;flashvars[chapters.plugin]=true&amp;flashvars[chapters.layout]=vertical&amp;flashvars[chapters.thumbnailRotator]=false&amp;flashvars[streamSelector.plugin]=true&amp;flashvars[EmbedPlayer.SpinnerTarget]=videoHolder&amp;flashvars[dualScreen.plugin]=true&amp;flashvars[Kaltura.addCrossoriginToIframe]=true&amp;&wid=0_hgo26v32)
- [Parte II](https://kmc.l2l.cineca.it/p/107/sp/10700/embedIframeJs/uiconf_id/23449779/partner_id/107?iframeembed=true&playerId=kaltura_player&entry_id=0_6rr7b9tw&flashvars[streamerType]=auto&amp;flashvars[localizationCode]=en&amp;flashvars[leadWithHTML5]=true&amp;flashvars[sideBarContainer.plugin]=true&amp;flashvars[sideBarContainer.position]=left&amp;flashvars[sideBarContainer.clickToClose]=true&amp;flashvars[chapters.plugin]=true&amp;flashvars[chapters.layout]=vertical&amp;flashvars[chapters.thumbnailRotator]=false&amp;flashvars[streamSelector.plugin]=true&amp;flashvars[EmbedPlayer.SpinnerTarget]=videoHolder&amp;flashvars[dualScreen.plugin]=true&amp;flashvars[Kaltura.addCrossoriginToIframe]=true&amp;&wid=0_gou98mf6)
- [Parte III](https://kmc.l2l.cineca.it/p/107/sp/10700/embedIframeJs/uiconf_id/23449779/partner_id/107?iframeembed=true&playerId=kaltura_player&entry_id=0_oe2pijj4&flashvars[streamerType]=auto&amp;flashvars[localizationCode]=en&amp;flashvars[leadWithHTML5]=true&amp;flashvars[sideBarContainer.plugin]=true&amp;flashvars[sideBarContainer.position]=left&amp;flashvars[sideBarContainer.clickToClose]=true&amp;flashvars[chapters.plugin]=true&amp;flashvars[chapters.layout]=vertical&amp;flashvars[chapters.thumbnailRotator]=false&amp;flashvars[streamSelector.plugin]=true&amp;flashvars[EmbedPlayer.SpinnerTarget]=videoHolder&amp;flashvars[dualScreen.plugin]=true&amp;flashvars[Kaltura.addCrossoriginToIframe]=true&amp;&wid=0_e4eo621h)
- [Parte IV](https://kmc.l2l.cineca.it/p/107/sp/10700/embedIframeJs/uiconf_id/23449779/partner_id/107?iframeembed=true&playerId=kaltura_player&entry_id=0_cm1pecib&flashvars[streamerType]=auto&amp;flashvars[localizationCode]=en&amp;flashvars[leadWithHTML5]=true&amp;flashvars[sideBarContainer.plugin]=true&amp;flashvars[sideBarContainer.position]=left&amp;flashvars[sideBarContainer.clickToClose]=true&amp;flashvars[chapters.plugin]=true&amp;flashvars[chapters.layout]=vertical&amp;flashvars[chapters.thumbnailRotator]=false&amp;flashvars[streamSelector.plugin]=true&amp;flashvars[EmbedPlayer.SpinnerTarget]=videoHolder&amp;flashvars[dualScreen.plugin]=true&amp;flashvars[Kaltura.addCrossoriginToIframe]=true&amp;&wid=0_ujs1cbhw)
- [Parte V](https://kmc.l2l.cineca.it/p/107/sp/10700/embedIframeJs/uiconf_id/23449779/partner_id/107?iframeembed=true&playerId=kaltura_player&entry_id=0_w9g5bg2r&flashvars[streamerType]=auto&amp;flashvars[localizationCode]=en&amp;flashvars[leadWithHTML5]=true&amp;flashvars[sideBarContainer.plugin]=true&amp;flashvars[sideBarContainer.position]=left&amp;flashvars[sideBarContainer.clickToClose]=true&amp;flashvars[chapters.plugin]=true&amp;flashvars[chapters.layout]=vertical&amp;flashvars[chapters.thumbnailRotator]=false&amp;flashvars[streamSelector.plugin]=true&amp;flashvars[EmbedPlayer.SpinnerTarget]=videoHolder&amp;flashvars[dualScreen.plugin]=true&amp;flashvars[Kaltura.addCrossoriginToIframe]=true&amp;&wid=0_p74pwih0)
- [Parte VI](https://kmc.l2l.cineca.it/p/107/sp/10700/embedIframeJs/uiconf_id/23449779/partner_id/107?iframeembed=true&playerId=kaltura_player&entry_id=0_5kdmtkpt&flashvars[streamerType]=auto&amp;flashvars[localizationCode]=en&amp;flashvars[leadWithHTML5]=true&amp;flashvars[sideBarContainer.plugin]=true&amp;flashvars[sideBarContainer.position]=left&amp;flashvars[sideBarContainer.clickToClose]=true&amp;flashvars[chapters.plugin]=true&amp;flashvars[chapters.layout]=vertical&amp;flashvars[chapters.thumbnailRotator]=false&amp;flashvars[streamSelector.plugin]=true&amp;flashvars[EmbedPlayer.SpinnerTarget]=videoHolder&amp;flashvars[dualScreen.plugin]=true&amp;flashvars[Kaltura.addCrossoriginToIframe]=true&amp;&wid=0_omeb569q)
