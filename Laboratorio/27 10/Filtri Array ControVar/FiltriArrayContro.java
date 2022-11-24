public class FiltriArrayContro{
  public static int[] elDispari(int[] a){
    if (a != null){
      int[] r = new int[elDispari(a, 0, 0)];
      elDispari(a, 0, r, 0);
      return r;
    } else {
      return new int[] {};
    }
  }
  public static int elDispari(int[] a, int i, int j){
    if(i == a.length){
      return 0;
    } else {
      j = elDispari(a, i+1, j);
      if (a[i] % 2 != 0){
        j++;
      }
      return j;
    }
  }

  public static void elDispari(int[] a, int i, int[] r, int j){
    if (i == a.length){
    } else {
      if (a[i] % 2 != 0){
        elDispari(a, i+1, r, j+1);
        r[j] = a[i];
      } else {
        elDispari(a, i+1, r, j);
      }
    }
  }

/* ----------------------------------------------------------------------- */
  // Metodo Posizioni Pari
  public static int[] posPari(int[] a){
    if (a != null){
      int[] r = new int[(a.length/2)+1];
      posPari(a, 0, r, 0);
      return r;
    } else {
      return new int[] {};
    }
  }

  public static void posPari(int[] a, int i, int[] r, int j){
    if (i == a.length){
    } else {
      if (i % 2 == 0){
        posPari(a, i+1, r, j+1);
        r[j] = a[i];
      } else {
        posPari(a, i+1, r, j);
      }
    }
  }

/* ----------------------------------------------------------------------- */

  public static int[] posDispOrElPari(int[] a){
    if (a != null){
      int[] r = new int[posDispOrElPari(a, 0, 0)];
      posDispOrElPari(a, 0, r, 0);
      return r;
    } else {
      return new int[] {};
    }
  }

  public static int posDispOrElPari(int[] a, int i, int j){
    if (i == a.length){
      return 0;
    } else {
      j = posDispOrElPari(a, i+1, j);
      if ((i % 2 != 0) || (a[i] % 2 == 0)){
        j++;
      }
      return j;
    }
  }

  public static void posDispOrElPari(int[] a, int i, int[] r, int j){
    if (i == a.length){
    } else {
      if ((i % 2 != 0) || (a[i] % 2 == 0)){
        posDispOrElPari(a, i+1, r, j+1);
        r[j] = a[i];
      } else {
        posDispOrElPari(a, i+1, r, j);
      }
    }
  }

/* ----------------------------------------------------------------------- */

  public static int[] intervallo(int[] a, int min, int max){
    if (a != null){
      int[] r = new int[intervallo(a, 0, 0, min, max)];
      intervallo(a, 0, r, 0, min, max);
      return r;
    } else {
      return new int[] {};
    }
  }

  public static int intervallo(int[] a, int i, int j, int min, int max){
    if (i == a.length){
      return 0;
    } else {
      j = intervallo(a, i+1, j, min, max);
      if ((a[i] >= min) && (a[i] <= max)){
        j++;
      }
      return j;
    }
  }

  public static void intervallo(int[] a, int i, int[] r, int j, int min, int max){
    if (i == a.length){
    } else {
      if ((a[i] >= min) && (a[i] <= max)){
        intervallo(a, i+1, r, j+1, min, max);
        r[j] = a[i];
      } else {
        intervallo(a, i+1, r, j, min, max);
      }
    }
  }

/* ----------------------------------------------------------------------- */

  public static int[] doppio(int[] a, int rif){
    if (a != null){
      int[] r = new int[doppio(a, 0, 0, rif)];
      doppio(a, 0, r, 0, rif);
      return r;
    } else {
      return new int[] {};
    }
  }

  public static int doppio(int[] a, int i, int j, int rif){
    if (i == a.length){
      return 0;
    } else {
      j = doppio(a, i+1, j, rif);
      if (a[i] == (2*rif)){
        j++;
      }
      return j;
    }
  }

  public static void doppio(int[] a, int i, int[] r, int j, int rif){
    if (i == a.length){
    } else {
      if (a[i] == (2*rif)){
        doppio(a, i+1, r, j+1, rif);
        r[j] = a[i];
      } else {
        doppio(a, i+1, r, j, rif);
      }
    }
  }

}
