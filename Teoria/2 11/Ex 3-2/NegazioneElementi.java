import java.util.Arrays;
public class NegazioneElementi{
    public static void main(String[] args) {
        boolean[] a = {true, false, false, true, false};
        System.out.println("Prima" + Arrays.toString(a));
        negazione(a, a.length);
        System.out.println("Dopo" + Arrays.toString(a));
    }

    public static void negazione(boolean[] a, int i){
        if (i == 0){
        } else {
            negazione(a, i-1);
            a[i-1] = !a[i-1];
        }
    }
}