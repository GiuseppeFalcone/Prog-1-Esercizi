import java.util.Scanner;
/** Classe fornita dallo studente Fulcheri.

    Può essere letta come  riscontro sperimentale almeno della seguente
    intuizione: allocare e disallocare spazio nel frame stack, come
    avviene nella ricorsione ad ogni chiamata, e ad ogni return, costa
    tempo.

    L'esperimento è effettuato confrontando i tempi di esecuzione
    di un metodo iterativo e di uno ricorsivo che implementano la
    funzione fattoriale.
    Il tempo è misurato per mezzo del metodo nanoTime definitio nella
    classe System.

    La classe FattorialeIterRicFulcheri usa la sintassi JAVA tipica
    della programmazione ad oggetti che non vediamo a lezione.
    Il codice si dovrebbe seguire ugualmente.
*/
public class FattorialeItCovFulcheri {

	public static void main(String[] args) {

		long risultatoIterativo = 0, risultatoRicorsivo = 0;

		System.out.println("Test metodi fattoriale");
		System.out.println("Inserisci il numero da fare il fattoriale: ");
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		sc.close();

    long timeNano1 = System.nanoTime();
		risultatoRicorsivo = FattorialeItCovFulcheri.calcR(numero);
		long timeNano2 = System.nanoTime();
		risultatoIterativo = FattorialeItCovFulcheri.calcI(numero);
		long timeNano3 = System.nanoTime();

		System.out.println("Metodo 1 (ricorsivo):" + risultatoRicorsivo);
		System.out.println("Metodo 2 (iterativo):" + risultatoIterativo);

		long time1 = timeNano2 - timeNano1;
		System.out.println("Tempo (in Nanosecondi) Metodo ricorsivo : " + time1);
		long time2= timeNano3 - timeNano2;
		System.out.println("Tempo (in Nanosecondi) Metodo iterativo : " + time2);
	}

	public static long calcR(int num){
		long fattoriale = num;
		if (num == 1){
			return 1;
		}else{
			fattoriale = fattoriale * calcR(num-1) ;
			return fattoriale;
		}
	}

	public static long calcI(int num){
		long fattoriale = 1;

		for(int i = 1 ; i <= num ; i++ ){
			fattoriale = fattoriale * i ;
		}

		return fattoriale;
	}
}
