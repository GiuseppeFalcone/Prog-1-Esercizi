import java.util.Arrays;

public class IndiceSubSeqTest {

    public static void main(String[] args) {
        int[] a = {-6, -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6};
        int[] b = { 1, 2, 3, 4, 2, 4, 2, 3, 9 };

        int[] c = { 4, 2 };
        System.out.println(IndiceSubSeq.indiceSubSeqCon(b, c)==3); 

        int[] d = { 3, 9, 1 };
        System.out.println(IndiceSubSeq.indiceSubSeqCon(b, d)==-1); 

        int[] e = { 3, 9 };
        System.out.println(IndiceSubSeq.indiceSubSeqCon(b, e)==7); 

        int[] f = { 1, 2, 3, 4, 2, 6, 2, 3, 9 ,10 };
        System.out.println(IndiceSubSeq.indiceSubSeqCon(b, f)==-1); 
    }
}
