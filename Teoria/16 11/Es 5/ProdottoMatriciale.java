import java.util.Arrays;

public class ProdottoMatriciale {
    public static void main(String[] args) {
        int[][] a = {{1,4,35}, {1,2,3}, {1,2,3}, {1,2,3}};
        int[][] b = {{1,6,3,4}, {1,2,3,4}, {1,2,3,4}};
        int[][] r = new int[a[0].length][b.length];
        r = prodottoMatriciale(a, b);
        for (int i = 0; i < r.length; i++){
            System.out.println(Arrays.toString(r[i]));
        }
    }
    
    private static int[][] prodottoMatriciale(int[][] a, int[][] b){
        int[][] r = new int[a[0].length][b.length];
        prodottoMatriciale(a, b, a[0].length, b.length, r);
        return r;
    }
    
    private static void prodottoMatriciale(int[][] a, int[][] b, int i, int j, int[][] r){
        if(i == 0){
        } else {
            prodottoMatriciale(a, b, i-1, j, r);
            prodottoMatricialeRiga(a, b, i-1, j, r);
        }
    }
    
    private static void prodottoMatricialeRiga(int[][] a, int[][] b, int i, int j, int[][] r){
        if (j == 0){
        } else {
            prodottoMatricialeRiga(a, b, i, j-1, r);
            r[i][j-1] = sommaProdotti(a, b, i, j-1, 0);
            //System.out.println("Somma Prodotti di Riga: "+i+" Colonna: "+(j-1)+" Viene: "+ sommaProdotti(a, b, i, j-1, 0));
        }
    }
    
    private static int sommaProdotti(int[][] a, int[][] b, int i, int j, int k){
        if (k == b.length){
            return 0;
        } else {
            return (a[i][k] * b[k][j]) + sommaProdotti(a, b, i, j, k+1);
        }
    }
}