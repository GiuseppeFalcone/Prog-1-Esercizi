public class SubSeqDic {
    public static int sottoSeq(int[] a, int[] b){
        int c = -1;
        if (a != null && b != null && (b.length <= a.length)){
            c = sottoSeq(a, b, 0, a.length);
        }
        return c;
    }

    private static int sottoSeq(int[] a, int[] b, int l, int r){
        if (l+1 == r){
            if (trovaSottoSeq(a, b, l, 0)){
                return l;
            } else {
                return -1;
            }
        } else {
            int m = ((l+r) / 2);
            int indiceSx = sottoSeq(a, b, l, m);
            int indiceDx = sottoSeq(a, b, m, r);

            if (indiceSx == -1){
                indiceSx = indiceDx;
            } 
            return indiceSx;
        }
    }

    private static boolean trovaSottoSeq(int[] a, int[] b, int i, int j){
        if (j == b.length && i <= a.length){
            return true;
        } else if (i >= a.length){
            return false;
        } else {
            return (a[i] == b[j] && trovaSottoSeq(a, b, i+1, j+1));
        }
    }
}
