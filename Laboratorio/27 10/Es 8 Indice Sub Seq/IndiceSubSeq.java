public class IndiceSubSeq {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 1, 2, 3};
        int[] b = {2, 4};
        int indice = ricercaIndice(a, b);
        System.out.println("Print Main " + indice);
    }

    public static int ricercaIndice(int[] a, int[] b){
        int i = a.lenght-1;
        while (i >= 0){
            int temp = i;
            int j = b.length-1;
            while (j >= 0){
                if ((a[i] == b[j]) && (ris > i)){
                    ris = i;
                    j++;
                    i++;
                } else {
                    i = temp;
                    ris = -1;
                }
            }
            i = i-1;
        }
    }

    /*
     * Prova ricorsiva
     * 
     public static int ricercaIndice(int[] a, int[] b){
         if ((a != null) && (b != null)){
             return ricercaIndice(a, 0, b, 0, -1);
            } else {
                return -1;
            }
        }
        
        public static int ricercaIndice(int[] a, int i, int[] b, int j, int ind){
            if (i < a.length){
                if (j == b.length){
                    return ind;
                } else {
                    if (a[i] == b[j]){
                        int vI = ricercaIndice(a, i+1, b, j+1, ind);
                        if (ind == -1 || ind > i){
                            ind = i;
                        }
                        return ind;
                    } else {
                        int vI = ricercaIndice(a, i+1, b, 0, ind);
                        if (vI != -1){
                            return vI;
                        } else {
                            return ind;
                        }
                    }
                    
                }
            } else {
                return ind;
            }
        }
        */
}
