import java.util.Arrays;
public class EsercizioQuattro {
    public static void main(String[] args) {
        int[][] a = {{1,2,3},
                    {1,2,3},
                    {1,2,3}};
        int[] d = new int[a.length];
        differenza(a, 0, d, 0);
        System.out.println(Arrays.toString(d));
    }
    
    private static void differenza(int[][] a, int i, int[] d, int k){
        if (i == a.length){
        } else {
            differenza(a, i+1, d, k+1);
            System.out.println("Somma Riga "+ i + "= " + sommaRiga(a,i,0));
            System.out.println("Somma Coolonna "+ i + "= " + sommaColonna(a,0, i));

            d[k] = sommaRiga(a, i, 0) - sommaColonna(a, 0, i);
            
        }
    }
    
    private static int sommaRiga(int[][] a, int i, int j){
        if (j == a.length){
            return 0;
        } else {
            return sommaRiga(a, i, j+1) + a[i][j];
        }
    }

    private static int sommaColonna(int[][] a, int i, int j){
        if (i == a.length){
            return 0;
        } else {
            return sommaColonna(a, i+1, j) + a[i][j];
        }
    }

}
