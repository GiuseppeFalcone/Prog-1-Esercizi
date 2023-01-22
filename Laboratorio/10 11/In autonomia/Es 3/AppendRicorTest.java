import java.util.Arrays;

/** Dati due *array* `a` e `b`, produce un terzo *array* `c` in cui `a[0,...,a.length)` coincide con `c[0,...,a.length)` e `b[0,...,b.length)` coincide con `c[a.length,...,a.length+b.length)` */

public class AppendRicorTest {
  
  public static void main (String[] args) {
    int[] a0 = {};
    int[] b0 = {};
    int[] out0 = {};
    System.out.println(Arrays.equals(AppendRicor.append(a0,b0),out0));
    
    int[] a1 = {1};
    int[] b1 = {};
    int[] out1 = {1};
    System.out.println(Arrays.equals(AppendRicor.append(a1,b1),out1));
    
    int[] a2 = {};
    int[] b2 = {2};
    int[] out2 = {2};
    //System.out.println("Arrays nel terzo caso:" + Arrays.toString(AppendRicor.append(a2,b2)));
    System.out.println(Arrays.equals(AppendRicor.append(a2,b2),out2));
    
    int[] a3 = {1};
    int[] b3 = {2};
    int[] out3 = {1,2};
    System.out.println(Arrays.equals(AppendRicor.append(a3,b3),out3));
    
    int[] a4 = {1,3};
    int[] b4 = {2,4};
    int[] out4 = {1,3,2,4};
    System.out.println(Arrays.equals(AppendRicor.append(a4,b4),out4));
  }
}