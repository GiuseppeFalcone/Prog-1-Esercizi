import java.util.Arrays;
public class EsercizioDue {

    public static void main(String[] args) {
        int[][] a = {{1,2,5}, 
                    {1,2,3},
                    {1,2,7}};
        System.out.print(Arrays.toString(produciArray(a)));
    }

    private static int[] produciArray(int[][] a){
        int[] r = new int[a.length];
        r = produciArray(a, a.length, r);
        return r;
    }

    private static int[] produciArray(int[][] a, int i, int[] r){
        if (i == 0){
            return r;
        } else {
            r = produciArray(a, i-1, r);
            r[i-1] = sommaRiga(a, i-1, 0) - sommaColonna(a, 0, i-1);
            return r;
        }
    }

    private static int sommaRiga(int[][] a, int i, int j) {
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
