public class IndiceSubSeq {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 2, 2, 3};
        int[] b = {2, 2, 3};
        int indice = findSubsequence(a, b);
        System.out.println("Indice: " + indice);
    }

    public static int findSubsequence(int[] arr, int[] sub) {
        return findSubsequence(arr, sub, 0, 0);
    }
    
    private static int findSubsequence(int[] arr, int[] sub, int arrIndex, int subIndex) {
        if (subIndex >= sub.length) {
            // Sottosequenza trovata
            return arrIndex - sub.length;
        }
    
        if (arrIndex >= arr.length) {
            // Sottosequenza non trovata
            return -1;
        }
    
        if (arr[arrIndex] == sub[subIndex]) {
            // Valore corrente corrisponde, controlliamo il successivo
            return findSubsequence(arr, sub, arrIndex + 1, subIndex + 1);
        } else {
            // Valore corrente non corrisponde, continuiamo a cercare dall'indice successivo
            return findSubsequence(arr, sub, arrIndex + 1, 0);
        }
    }
    
}
