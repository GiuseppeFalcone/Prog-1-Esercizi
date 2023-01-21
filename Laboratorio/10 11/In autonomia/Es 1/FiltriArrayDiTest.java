import java.util.Arrays;
public class FiltriArrayDiTest{
    public static void main(String[] args) {
        int[] a = {1,4,5,3,5,2,4,3};
        int[] b1 = FiltriArrayDi.limiteSuperioreVersUno(a, 4);
        System.out.println(Arrays.toString(b1));
        
        int[] b2 = FiltriArrayDi.limiteSuperioreVersDue(a, 4);
        System.out.println(Arrays.toString(b2));
        
        int[] b3 = FiltriArrayDi.soloElDispariV1(a);
        System.out.println(Arrays.toString(b3));
    
        int[] b4 = FiltriArrayDi.soloElDispariV2(a);
        System.out.println(Arrays.toString(b4));

        int[] b5 = FiltriArrayDi.elPosPariV1(a);
        System.out.println(Arrays.toString(b5));
        
        int[] b6 = FiltriArrayDi.elPosPariV2(a);
        System.out.println(Arrays.toString(b6));
        
        int[] b7 = FiltriArrayDi.elPosDispValParV1(a);
        System.out.println(Arrays.toString(b7));
        
        int[] b8 = FiltriArrayDi.elPosDispValParV2(a);
        System.out.println(Arrays.toString(b8));
    }
}