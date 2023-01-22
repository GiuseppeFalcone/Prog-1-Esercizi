import java.util.Arrays;
public class AppendRicor{
    public static int[] append(int[] a, int[] b){
        if (a != null && b != null){
            int[] c = new int[a.length+b.length];
            append(a, b, c, 0);
            //System.out.println("Array c con array a: " + Arrays.toString(a) + "\n b:" + Arrays.toString(b) + "\n risultato: " + Arrays.toString(c) + "\n");
            return c;
        } else {
            return null;
        }
    }

    private static void append(int[] a, int[] b, int[] c, int i){
    if (i == c.length){
        } else {
            append(a, b, c, i+1);
            if (i > a.length && i < c.length){
                c[i] = b[i - b.length];
            } else if (i < a.length){
                c[i] = a[i];
            } else if (i == a.length) {
                c[i] = b[0];
            }
        }
    }
}