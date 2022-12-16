public class SubSeqDiFinaleTest {
	public static void main(String[] args) {
		int[] a0 = {1, 2, 3, 4, 1, 2, 3, 4}; // due occorrenze di b in a
		int[] a1 = {1, 2, 3, 1, 2, 3, 4};    // una occorrenza di b in a
		int[] a2 = {1, 2, 3, 1, 2, 3};       // nessuna occorrenza di b in a
		int[] a3 = {1, 2, 3, 1, 2};          // nessuna occorrenza di b in a
		int[] b  = {2, 3, 4};

		System.out.println(SubSeqDiFinale.indiceSubSeqDi(a0, b)== 1);
		System.out.println(SubSeqDiFinale.indiceSubSeqDi(a1, b)== 4);
		System.out.println(SubSeqDiFinale.indiceSubSeqDi(a2, b)==-1);
		System.out.println(SubSeqDiFinale.indiceSubSeqDi(a3, b)==-1);
	}
}