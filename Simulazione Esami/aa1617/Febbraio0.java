/**
 * ESAME PROGRAMMAZIONE 1 
 * Matricola: SCRIVERLA ORA!!!
 * Cognome: SCRIVERLO ORA!!!
 * Nome: SCRIVERLO ORA!!!
 * Corso: SCRIVERLO ORA!!!
 * Inoltre, SCRIVERE ORA nome, cognome, matricola, corso, NUMERO DEL PC sul foglio distribuito.
 * PER CONSEGNARE/RITIRARSI chiamare un docente.
 */
public class Febbraio0 {
	
	/* ESERCIZIO 1 (Massimo 7 punti -- da consegnare elettronicamente).
	 * Scrivere un metodo iterativo di nome ex1 con le seguenti caratteristiche:
	 * --) 	ex1 ha due parametri formali. Il primo e' un riferimento (puntatore, reference) 
	 * 	    ad un array di interi di nome a; il secondo e' un riferimento ad un array di interi di nome b,
	 * --) 	se a e b contengono ciascuno almeno un elemento,
	 *      ex1 restituisce il valore true se in a esiste un elemento a[i] tale che
	 * 	    ogni elemento nel segmento b[i...b.length-1] sia strettamente piu' piccolo di a[i].
	 *      Altrimenti il risultato e' false. 
	 * La classe Febbraio0TestEx1 può essere usata per il testing di ex1 e, quindi, contiene esempi sul funzionamento 
	 * atteso per ex1. 
	 * DOVE SCRIVERE ex1: qui sotto, immediatamente al di fuori di questo commento.  
	 */
	 
	 /* ESERCIZIO 2 (Massimo 7 punti -- da consegnare elettronicamente).
	  * Scrivere un metodo ricorsivo di nome ex2 con le seguenti caratteristiche:
	  * --) ex2 ha due parametri formali. Il primo e' un riferimento (puntatore, reference) 
	  * 	ad un array di interi di nome a; il secondo e' un intero k.
	  * --) ex2 restituisce true se k occorre in tutte le posizioni pari di a. 
	  *     Altrimenti il risultato e' false.
	  * --) ex2 richiama un metodo ricorsivo di nome occorreInPosPari, che visita l'array a dicotomicamente, 
	  *     ovvero suddivide a, ad ogni chiamata, in due parti di lunghezza essenzialmente identica.	  
	 * La classe Febbraio0TestEx2 può essere usata per il testing di ex1 e, quindi, contiene esempi sul funzionamento 
	 * atteso per ex2. 
	 * DOVE SCRIVERE ex2: immediatamente al di sotto di questo commento.  
	  */
	 
	 /* ESERCIZIO 3 (Massimo 2 + 2 + 3 + 3 punti -- da consegnare a mano).
	  * Sia dato il metodo ex3 qui sotto definito.
	  * Assumiamo che il parametro formale a abbia sempre almeno due elementi e che a.length > i >= 1.
	  * Dimostrare che ex3 soddisfa il seguente predicato:
	  * 
	  *    ex3(a,i)  <==> (per ogni k. 1<=k<=i ==> a[k-1]==2*a[k] )
	  *  
	  * 1) scrivere esplicitamente il caso base P(1) per la dimostrazione per induzione, (2 punti)
	  * 2) scrivere esplicitamente il caso induttivo per la dimostrazione per induzione, (2 punti)
	  * 3) dimostrare che il caso base P(1) della dimostrazione per induzione e' vero, (3 punti)
	  * 4) dimostrare che il caso induttivo della dimostrazione per induzione e' vero. (3 punti)
	  */
	 public static boolean ex3 (int[] a, int i) {
		 if (i == 1)
			 return a[0] == 2 * a[1] ;
		 else {
			 return ex3(a, i-1) && a[i-1] == 2 * a[i];
		 }
	 }

	 /* ESERCIZIO 4 (Massimo 8 punti -- da consegnare a mano).
	  * Scrivere lo stato della memoria della JVM alla riga col commento // (B),
	  * ovvero giusto prima della disallocazione del frame relativo ad x.
	  */
	 public static void x(int[][] m) {
		 int i;
		 for(i = 0; i < m.length; i++) {
			 m[i] = new int[i+1];
			 m[i][i] = i;
		 }
		 // (B)
	 }
	 public static void main(String[] args) {
		 int[][] m = new int[3][];
		 int[] a = {10, 20};
		 m[0] = a;
		 m[1] = a;
		 m[2] = a;
		 x(m);       // usare (A) come indirizzo per questa istruzione
	 }
}
