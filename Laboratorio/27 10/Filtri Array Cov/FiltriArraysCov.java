public class FiltriArraysCov{

//Filtro Dispari
  // Metodo wrapper
  public static int[] elDispari(int[] a){
    if (a != null){
      int[] r = new int[elDispari(a, a.length, 0)];
      elDispari(a, a.length, r, r.length);
      return r;
    } else {
      return new int[] {};
    }
  }

  // Metodo per Contare gli elementi dispari
  public static int elDispari(int[] a, int i, int j){
    if (i == 0){
      return 0;
    } else {
      j = elDispari(a, i-1, j);
      if (a[i-1] % 2 != 0){
        j++;
      }
      return j;
    }
  }
  // Metodo per inserire el dispari nell'array r
  public static void elDispari(int[] a, int i, int[] r, int j){
    if (i == 0){
    } else {
      if (a[i-1] % 2 != 0){
        elDispari(a, i-1, r, j-1);
        r[j-1] = a[i-1];
      } else {
        elDispari(a, i-1, r, j);
      }
    }
  }

/* ----------------------------------------------------------------------- */

// Filtro Posizioni Pari
  public static int[] posPari(int[] a){
    if (a != null){
      int[]r = new int[(a.length/2)+1];
      posPari(a, a.length, r, r.length);
      return r;
    } else {
      return new int[] {};
    }
  }

  public static void posPari(int[] a, int i, int[] r, int j){
    if (i == 0){
    } else {
      if ((i-1) % 2 == 0){
        posPari(a, i-1, r, j-1);
        r[j-1] = a[i-1];
      } else {
        posPari(a, i-1, r, j);
      }
    }
  }

/* ----------------------------------------------------------------------- */

  public static int[] posDispOrElPari(int[] a){
    if (a != null){
      int[] r = new int[posDispOrElPari(a, a.length, 0)];
      posDispOrElPari(a, a.length, r, r.length);
      return r;
    } else {
      return new int[]{};
    }
  }
  public static int posDispOrElPari(int[] a, int i, int j){
    if (i == 0){
      return 0;
    } else {
      j = posDispOrElPari(a, i-1, j);
      if (((i-1) % 2 != 0) || (a[i-1] % 2 == 0)){
        j++;
      }
      return j;
    }
  }

  public static void posDispOrElPari(int[] a, int i, int[] r, int j){
    if (i == 0){
    } else {
      if (((i-1) % 2 != 0) || (a[i-1] % 2 == 0)){
        posDispOrElPari(a, i-1, r, j-1);
        r[j-1] = a[i-1];
      } else {
        posDispOrElPari(a, i-1, r, j);
      }
    }
  }

/* ----------------------------------------------------------------------- */

  public static int[] intervallo(int[] a, int min, int max){
    if (a != null){
      int[] r = new int[intervallo(a, a.length, 0, min, max)];
      intervallo(a, a.length, r, r.length, min, max);
      return r;
    } else {
      return new int[] {};
    }
  }

  public static int intervallo(int[] a, int i, int j, int min, int max){
    if(i == 0){
      return 0;
    } else {
      j = intervallo(a, i-1, j, min, max);
      if((a[i-1] >= min) && (a[i-1] <= max)){
        j++;
      }
      return j;
    }
  }

  public static void intervallo(int[] a, int i, int[] r, int j, int min, int max){
    if (i == 0){
    } else {
      if((a[i-1] >= min) && (a[i-1] <= max)){
        intervallo(a, i-1, r, j-1, min, max);
        r[j-1] = a[i-1];
      } else {
        intervallo(a, i-1, r, j, min, max);
      }
    }
  }

/* ----------------------------------------------------------------------- */

  public static int[] doppio(int[] a, int rif){
    if(a != null){
      int[] r = new int[doppio(a, a.length, 0,rif)];
      doppio(a, a.length, r, r.length, rif);
      return r;
    } else {
      return new int[] {};
    }
  }

  public static int doppio(int[] a, int i, int j, int rif){
    if (i == 0){
      return 0;
    } else {
      j = doppio(a, i-1, j, rif);
      if (a[i-1] == 2*rif){
        j++;
      }
      return j;
    }
  }

  public static void doppio(int[] a, int i, int[] r, int j, int rif){
    if (i == 0){
    } else {
      if (a[i-1] == (2*rif)){
        doppio(a, i-1, r, j-1, rif);
        r[j-1] = a[i-1];
      } else {
        doppio(a, i-1, r, j, rif);
      }
    }
  }
//{0, 1, 2, 4, 4, 5, 4};
//{2, 6, 5, 6, 6};
}
