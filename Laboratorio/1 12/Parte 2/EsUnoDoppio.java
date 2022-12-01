public class EsUnoDoppio {
    public static void main(String[] args) {
        System.out.println(false==doppio(new int[][] {{2}},0));
        System.out.println(true ==doppio(new int[][] {{1,2}},0));
        System.out.println(false==doppio(new int[][] {{1,1}},0));
        System.out.println(false==doppio(new int[][] {{1,2},{}},0));
        System.out.println(false==doppio(new int[][] {{},{1,2}},0));
        System.out.println(true ==doppio(new int[][] {{1,2},{1,2}},0)); 
    }
    /**
     * @param m è 
     * @param c
     * @return
     */
    public static boolean doppio(int[][] m, int c){
        int i = 0;
        boolean perOgniR = true;
        while(perOgniR && i < m.length){
            boolean esisteC = false;
            int j = 0;
            while (((c >= 0) && (c < m[i].length)) && (!esisteC) && (j < m[i].length)){
                if (j != c){
                    esisteC = m[i][j] == 2*m[i][c];
                }
                ++j;
            }
            perOgniR = esisteC;
            ++i;
        }
        return perOgniR;
    }
}