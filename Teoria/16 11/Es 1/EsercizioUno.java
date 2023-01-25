public class EsercizioUno {
    public static void main(String[] args) {
        int[][] a = {{1,2}, {1,3},{1,3}};
        System.out.println(ragged(a));
    }

    private static boolean ragged(int[][] a){
        if (a != null){
            return ragged(a, 0);
        } else {
            return false;
        }
    }

    private static boolean ragged(int[][] a, int i){
        if (i == a.length){
            return true;
        } else {
            // controlliamo che tutte le righe hanno lunghezza uguale
            // comparandola con la lunghezza di una riga qualsiasi,
            // in questo caso prendiamo come compazione la prima riga
            return (ragged(a, i+1) && (a[i].length == a[0].length));
            

        }
    }

}