public class EquivalenzaArray {
    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        int[] b = {1,2,3,4};    

        boolean ris = equivalenza(a, b);
        System.out.println(ris);
    }

    public static boolean equivalenza(int[] a, int[] b){
        boolean ris = (a.length == b.length);
        if (ris && a != null){
            ris = equivalenza(a, 0, b);
            return ris;
        } else {
            return ris;
        }
    }

    public static boolean equivalenza(int[] a, int i, int[] b){
        if (i == a.length){
            return true;
        } else {
            boolean ris = equivalenza(a, i+1, b);
            if (ris && a[i] != b[i]){
                ris = false;
            }
            return ris;
        }
    }
}
