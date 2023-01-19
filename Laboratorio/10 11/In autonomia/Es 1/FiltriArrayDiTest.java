import java.util.Arrays;
public class FiltriArrayDiTest{
    public static void main(String[] args) {
        int[] a = {1,4,5,3,5,2,4,3};
        int[] b1 = FiltriArrayDi.limiteSuperioreVersUno(a, 4);
        System.out.println(Arrays.toString(b1));
        
        int[] b2 = FiltriArrayDi.limiteSuperioreVersDue(a, 4);
        System.out.println(Arrays.toString(b2));
        
        int[] b3 = FiltriArrayDi.soloElDispari(a);
        System.out.println(Arrays.toString(b3));
    
    
    }
}