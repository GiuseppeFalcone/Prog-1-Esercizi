/**
 * ESAME PROGRAMMAZIONE 1 24/01/19
 * Matricola: SCRIVERLA ORA!!!
 * Cognome: SCRIVERLO ORA!!!
 * Nome: SCRIVERLO ORA!!!
 * Corso: SCRIVERLO ORA!!!
 * 
 * Se non ancora fatto, SCRIVERE ORA nome, cognome, matricola, corso, 
 * NUMERO DEL PC sui fogli distribuiti.
 * 
 * PER CONSEGNARE/RITIRARSI chiamare un docente.
 * SE QUESTA CLASSE NON COMPILA E' INUTILE CONSEGANRE.
 */
public class EsameB1819 {

	/**
	 * ESERCIZIO 1 (Massimo 7 punti -- da consegnare elettronicamente).
	 * Scrivere un metodo iterativo e1 con le seguenti caratteristiche: 
	 * -) e1 ha un singolo parametro, di tipo array bidimensionale (matrice) di interi. 
	 * -) e1 restituisce true se nella matrice esiste almeno una riga di 
	 * indice i in cui ogni elemento dalla colonna 0 alla colonna
     * i inclusa e' strettamente minore del successivo, ammesso che il
	 * successivo esista. In ogni altro caso il risultato deve essere false.
	 * ATTENZIONE: Ricordate che m[i][j] si riferisce all'elemento di m 
	 * di riga i e colonna j, m.length si riferisce al numero di righe di m,
	 * m[i].length e' il numero di elementi della riga i
	 * SCRIVERE la soluzione immediatamente qui sotto.
	 */
	
	/**
	 * ESERCIZIO 2 (Massimo 7 punti -- da consegnare elettronicamente).
	 * Scrivere un metodo involucro (wrapper o guscio) void e2 tale che:
	 * -) e2 ha due parametri: un array di interi a, un intero u;
	 * -) e2 modifica l'array a richiamando un metodo void ricorsivo 
	 * controvariante e2R (l'indice aggiuntivo in e2R aumenta nella 
	 * chiamata ricorsiva). e2R deve raddoppiare il valore in a[i] nel 
	 * caso in cui
	 * -) a[i] e' strettamente minore di v e 
	 * -) a[i] e' dispari.
	 * Scrivere la soluzione immediatamente qui sotto.                */
	
	/** ESERCIZIO 3 (Massimo 2 + 2 + 3 + 3 punti -- da consegnare a mano)	 
	 * Sia P(n) il seguente predicato:
	 *    "1*a[0]*...*a[i-1] == r vero all'inizio dell'iterazione n" .
	 * Dato il metodo e3, dimostrare che, per ogni valore n>=0,
	 * il predicato P(n) e' vero, usando il principio di induzione:
	 * 1) formulare esplicitamente la base               (2 pt.) 
	 * 2) formulare esplicitamente il passo induttivo    (2 pt.) 
	 * 3) dimostrare che il predicato al punto 1 e' vero (3 pt.)
	 * 4) dimostrare che il predicato al punto 2 e' vero (3 pt.)      */
	public static int prodotto(int[] a) {
		int r = 1;
		int i = 0;
		// prima di ogni iterazione
		while (i < a.length) {
			// inizio dell'iterazione n >= 0
			r = r * a[i];
			i = i + 1;
			// inizio dell'iterazione n+1 > 0
		}
		return r;
	}

	/** ESERCIZIO 4 (Massimo 8 punti -- da consegnare a mano).
	 * Scrivere lo stato della memoria della JVM giusto prima della 
	 * disallocazione del frame di attivazione del metodo m, quando il 
	 * valore di l e' pari a 0.                                       */
	public static void m(boolean[] a, int l) {
        if (l != 0) {
			a[l-1] = l%2==1;
			m(a, l-1); // indirizzo rientro (B)
		}
	}
	public static void main(String[] args) {
		boolean[] a = {true,false};
		m(a,a.length); // indirizzo rientro (A)
	}
}
