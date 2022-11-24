public class Ricerca{
  public static void main(String[] args) {
    System.out.println("test iterativa");
    System.out.println(RicercaIter(new int[] {10, 20, 30}, 20) == 1);
    System.out.println(RicercaIter(new int[] {10, 20, 30}, 50) == -1);

    System.out.println("\ntest covariante");
    System.out.println(RicercaCov(new int[] {10, 20, 30, 40, 50}, 10) == 0);
    System.out.println(RicercaCov(new int[] {10, 20, 30}, 50) == -1);

    System.out.println("\ntest iterativa");
    System.out.println(RicercaContr(new int[] {10, 20, 30}, 20) == 1);
    System.out.println(RicercaContr(new int[] {10, 20, 30}, 50) == -1);
  }
  public static int RicercaIter(int[] a, int e){
    int i = 0;
    int r = -1;
    while (i < a.length){
      if (a[i] == e){
        r = i;
      }
      i++;
    }
    return r;
  }

  public static int RicercaCov(int[] a, int e){
    if (a != null){
      return RicercaCov(a, a.length, e);
    } else {
      return -1;
    }
  }

  public static int RicercaCov(int[] a, int i, int e){
    if (i == 0){
      return -1;
    } else {
      int vI = RicercaCov(a, i-1, e);
      if (vI == -1){
        if (a[i-1] == e){
          return i-1;
        } else {
          return -1;
        }
      } else {
        return vI;
      }
    }
  }


  public static int RicercaContr(int[] a, int e){
    if (a != null){
      return RicercaContr(a, 0, e);
    } else {
      return -1;
    }
  }

  public static int RicercaContr(int[] a, int i, int e){
    if (i == a.length){
      return -1;
    } else {
      int vI = RicercaContr(a, i+1, e);
      if (vI == -1){
        if (a[i] == e){
          return i;
        } else {
          return -1;
        }
      } else {
        return vI;
      }
    }
  }
}
