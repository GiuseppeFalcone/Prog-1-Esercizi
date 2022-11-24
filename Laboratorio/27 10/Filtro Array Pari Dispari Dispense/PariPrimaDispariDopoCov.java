import java.util.Arrays;
public class PariPrimaDispariDopoCov{
  public static void main(String[] args) {
    int[] a = {2,3,5,3,1,11,7,2,1,2,55,8,6,33,246};
    pariDispariCov(a);
    System.out.print(Arrays.toString(a));
  }
  public static void pariDispariCov(int[] a){
    if (a != null){
      int[] r = new int[a.length];
      pariDispariCov(a, r, a.length);
      pariDispariCov(a, a.length, r, 0, 0);
    }
  }

  public static void pariDispariCov(int[] a, int[] r, int i){
    if (i == 0){
    } else {
      pariDispariCov(a, r, i-1);
      r[i-1] = a[i-1];
    }
  }

  public static void pariDispariCov(int[] a, int i, int[] r, int j, int k){
    if(i == 0){
    } else {
      if (r[i-1] % 2 != 0){
        pariDispariCov(a, i-1, r, j, k+1);
        a[a.length-(k+1)] = r[i-1];
      } else {
        pariDispariCov(a, i-1, r, j+1, k);
        a[j] = r[i-1];
      }
    }
  }
}
