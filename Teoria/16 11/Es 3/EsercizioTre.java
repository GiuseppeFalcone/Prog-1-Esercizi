import java.util.Arrays;
public class EsercizioTre {
    public static void main(String[] args) {
        int[][] a = {{1,2,3}, 
                    {1,2,3},
                    {1,2,3},};
        System.out.println(Arrays.toString(sommaColonne(a)));
    }

    private static int[] sommaColonne(int[][] a){
        int[] s = new int[a.length];
        sommaColonne(a, 0, a[0].length, s, s.length);
        return s;
    }

    private static void sommaColonne(int[][] a, int i, int j, int[] s, int k){
        if (j == 0){
        } else {
            sommaColonne(a, i, j-1, s, k-1);
            somma(a, i, j-1, s, k-1);
        }
    }

    private static void somma(int[][] a, int i, int j, int[] s, int k){
        if (i == a.length){
        } else {
            somma(a, i+1, j, s, k);
            s[k] = s[k] + a[i][j];
        }
    }
}
