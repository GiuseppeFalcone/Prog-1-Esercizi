import java.util.Arrays;
public class PariPrimaDispariDopoContro{
  public static void main(String[] args) {
    int[] a = {2,3,5,3,1,11,7,2,1,2,55,8,6,33,246};
    pariDispari(a);
    System.out.print(Arrays.toString(a));
  }
    public static void pariDispari(int[] a){
      if (a != null){
        int[] r = new int[a.length];
        pariDispari(a, r, 0);
        pariDispari(a, 0, r, 0, 0);
      }
    }

    public static void pariDispari(int[] a, int[] r, int i){
      if (i == a.length){
      } else {
        pariDispari(a, r, i+1);
        r[i] = a[i];
      }
    }

    public static void pariDispari(int[] a, int i, int[] r, int j, int k){
      if(i == a.length){
      } else {
        if (r[i] % 2 != 0){
          pariDispari(a, i+1, r, j, k+1);
          a[a.length-(k+1)] = r[i];
        } else {
          pariDispari(a, i+1, r, j+1, k);
          a[j] = r[i];
        }
      }
    }
}
