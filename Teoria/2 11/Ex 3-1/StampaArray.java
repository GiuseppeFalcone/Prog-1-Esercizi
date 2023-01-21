public class StampaArray{
  public static void main(String[] args) {
    int[] a = {1,2,3,4,5};
    stampa(a);
  }
  public static void stampa(int[] a){
    if(a != null){
      stampa(a, 0, a.length);
    }
  }
  public static void stampa(int[] a, int l, int r){
    if(l < r){
      if (1 == r-l){
        System.out.println(a[l]);
      } else {
        int m = (l+r)/2;
        stampa(a, l, m);
        stampa(a, m, r);
      }
    }
  }
}
