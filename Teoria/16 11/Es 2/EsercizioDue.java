import java.util.Arrays;
public class EsercizioDue{
    public static void main(String[] args) {
        int[][] a = {{5,2,5}, {1,2,3}, {3,2,4}};
        System.out.println(Arrays.toString(elDiagSecond(a)));
    }
    private static int[] elDiagSecond(int[][] a){
        if (controllo(a, 0)){
            int[] r = new int[a.length];
            inizializzazioneArray(r, 0);
            diagonale(a, a.length, 0, r);
            return r;
        } else {
            System.out.println("Impossibile restituire la diagonale secondaria");
            return null;
        }
    }
    
    //Controllo che l'array sia quadrato
    private static boolean controllo(int[][] a, int i){
        if (i == a.length){
            return true;
        } else {
            return a.length == a[i].length == controllo(a, i+1);
        }
    }

    // Metodo per inizializzare l'array che andrà a contenere i valori della diagonale
    private static void inizializzazioneArray(int[] a, int i){
        if (i == a.length){
        } else {
            inizializzazioneArray(a, i+1);
            a[i] = 10101010;
        }
    }

    // Metodo che controlla gli elementi da passare al metodo append
    private static void diagonale(int[][] a, int i, int j, int[] r){
        if (i == 0){
        } else {
            diagonale(a, i-1, j+1, r);
            append(r, a[i-1][j]);
        }
    }
    
    // Metodo che aggiunge i valori della diagonale all'array nel posto giusto
    private static void append(int[] a, int v){
        boolean controllo = false;
        for (int i = 0; i < a.length && !controllo; i++){
            if (a[i] == 10101010){
                a[i] = v;
                controllo = true;
            }
        }
    }
}