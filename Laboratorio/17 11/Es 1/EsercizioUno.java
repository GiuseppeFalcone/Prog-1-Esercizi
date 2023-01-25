import java.util.Arrays;
public class EsercizioUno {
    public static int[][] matrice(int m, int n){
        if (m >= 0 && n >= 0){
            int[][] r = new int[m][n];
            righe(r, m, n);
            return r;
        } else {
            return null;
        }

    }

    private static void righe(int[][] r, int i, int j){
        if (i == 0){
        } else {
            righe(r, i-1, j);
            colonne(r, i-1, j);
            //r[i-1][j] = (i-1)+j;
        }
    }

    private static void colonne(int[][] r, int i, int j){
        if (j == 0){
        } else {
            colonne(r, i, j-1);
            r[i][j-1] = i+(j-1);
        }
    }

}

