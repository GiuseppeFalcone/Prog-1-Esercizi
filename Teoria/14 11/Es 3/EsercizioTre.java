public class EsercizioTre {
    public static void main(String[] args) {
        int[][] a = {{5,2,5}, {1,2,3}, {2,2,4}};
        System.out.println(sommaDiagonale(a));
    }
    
    private static int sommaDiagonale(int[][] a){
        if (controllo(a, 0)){
            return sommaDiagonale(a, 0, a[0].length);
        } else {
            return 1;
        }
    }
    private static int sommaDiagonale(int[][] a, int i, int j){
        if (i == a.length){
            return 0;
        } else {
            return sommaDiagonale(a, i+1, j-1) + a[i][j-1];
        }
    }
    
    private static boolean controllo(int[][] a, int i){
        if (i == a.length){
            return true;
        } else {
            return a.length == a[i].length == controllo(a, i+1);
        }
    }
    
}

