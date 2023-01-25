public class MatriceQuadrata {
    public static void main(String[] args) {
        int[][] a = {{1,2,3}, {1,2,3},{1,2,3},{12}};
        System.out.println(quadrata(a));
    }

    private static boolean quadrata(int[][] a){
        if (a != null){
            return controllo(a, 0);
        } else {
            return false;
        }
    }

    private static boolean controllo(int[][] a, int i){
        if (i == a.length){
            return true;
        } else {
            //int indiceRighe = righe(a, i, 0);
            return colonne(a, 0) == righe (a, i, 0) ;
        }
    }

    private static int colonne(int[][] a, int i){
        if (i == a.length){
            return 0;
        } else {
            return colonne(a, i+1) + 1;
        }
    }

    private static int righe(int[][] a, int i, int j){
        if (j == a[i].length){
            return 0;
        } else {
            return righe(a, i, j+1) + 1;
        }
    }

}
