
 /** OBIETTIVO.
     Date quattro variabili a, b, c, d, scrivere un algoritmo che riorganizzi
		 i valori in esse contenuti, in modo che, al termine,
		 la variabile d contenga il valore massimo, inizialmente in a, b ,c ,d.

 	 	ESEMPIO.
 		Costruita la configurazione seguente:

	  	a == 3,  b == 11, c == 8, d == 2

 		occorre produrre una configurazione finale tale che:

			d == massimo{3, 11, 8, 2} == 11

		in cui non si mettono vincoli su cosa a, b, c debbano contenere

a = 3;b = 11;c = 8;d = 2;
if (a > b) {
	tmp = a;
  a = b;
  b = tmp;
}
;
if (b > c) {
  tmp = b;
	b = c;
	c = tmp;
}
;
if (c > d) {
	tmp = c;
	c = d;
	d = tmp;
}
*/


public class EmersioneIter {
	public static void main (String[] args){
		int a = 3;
		int b = 11;
		int c = 8;
		int d = 2;

		if (a > b) {
			int tmp = a;
		  a = b;
		  b = tmp;
		}

		if (b > c) {
		  int tmp = b;
			b = c;
			c = tmp;
		}

		if (c > d) {
			int tmp = c;
			c = d;
			d = tmp;
		}

	}
}
