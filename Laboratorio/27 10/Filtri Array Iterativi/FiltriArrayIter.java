public class FiltriArrayIter{
  public static int[] filtroDispari(int[] a){
    int j = 0;
    if (a != null){
      for (int i = 0; i < a.length; i++){
        if (a[i] % 2 != 0){
          j++;
        }
      }
      int[] r = new int[j];
      return filtroDispari(a, r);
    } else {
      return new int[] {};
    }
  }
  public static int[] filtroDispari(int[] a, int[] r){
    int j = 0;
    for (int i = 0; i < a.length; i++){
      if (a[i] % 2 == 1){
        r[j] = a[i];
        j++;
      }
    }
    return r;
  }

  public static int[] filtroPosPari(int[] a){
    int[] r = new int[(a.length/2)+1];
    int j = 0;
    for (int i = 0; i < a.length; i = i+2){
      r[j] = a[i];
      j++;
    }
    return r;
  }

  public static int[] filtroPosDispOrElPari(int[] a){
    int leng = 0;
    for (int i = 0; i < a.length; i++){
      if ((i % 2 != 0) || (a[i] % 2 == 0)){
        leng++;
      }
    }

    int[] r = new int[leng];
    int j = 0;

    for (int i = 0; i < a.length; i++){
      if ((i % 2 != 0) || a[i] % 2 == 0){
        r[j] = a[i];
        j++;
      }
    }
    return r;
  }

  public static int[] filtroIntervallo(int[] a, int min, int max){
    int leng = 0;
    for (int i = 0; i < a.length; i++){
      if ((a[i] >= min) && (a[i] <= max)){
        leng++;
      }
    }

    int[] r = new int[leng];
    int j = 0;

    for (int i = 0; i < a.length; i++){
      if ((a[i] >= min) && (a[i] <= max)){
        r[j] = a[i];
        j++;
      }
    }
    return r;
  }

  public static int[] filtroDoppio(int[] a, int rif){
    int leng = 0;
    for (int i = 0; i < a.length; i++){
      if (a[i] == 2*rif){
        leng++;
      }
    }

    int[] r = new int[leng];
    int j = 0;
    for (int i = 0; i < a.length; i++){
      if (a[i] == 2*rif){
        r[j] = a[i];
        j++;
      }
    }
    return r;
  }
}
