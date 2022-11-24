public class ArrayMetodiBaseFinale {

  public static void main (String[] args){
    int[] a = {10,20,30};
    System.out.print("Array a: ");
    stampa(a);
    System.out.println();

    int[] b = crea(3);
    System.out.print("Array b: ");
    stampa(b);
    System.out.println();

    System.out.print("a != b: ");
    System.out.println(a == b);

    System.out.print("a uguale? b: ");
    System.out.println(uguali(a,b));

    a = appendeElemento(a,100);
    System.out.print("a.length di a aggiornato: ");
    System.out.println(a.length);
    System.out.print("Array aggiornato a: ");
    stampa(a);
  }

  public static void stampa(int[] x){
    if (x != null){
      stampa(x, x.length);
    } else {
      System.out.println("Impossibile effetturare richiesta");
    }
  }

  public static void stampa(int[]x, int i){
    if (i == 0){
    } else {
      stampa(x, i-1);
      System.out.print(x[i-1] + " ");
    }
  }

  public static int[] crea(int l){
    if (l >= 0){
      int[] x = new int[l];
      return crea(l, x);
    } else {
      System.out.println("Impossibile creare array con numero di elementi minore di 0");
      return null;
    }
  }

  public static int[] crea(int i, int[] x){
    if (i == 0){
      return null;
    } else {
      crea(i-1, x);
      x[i-1] = 10*(i);
      return x;
    }
  }

  static boolean uguali(int[] x, int[] y) {
    boolean uguali = x.length == y.length;
    if (uguali) {
      int i = 0;
      while(i < x.length && uguali) {
        uguali = x[i] == y[i];
        i = i + 1;
      }
    }
    return uguali;
  }

  public static int[] appendeElemento(int[] x, int n){
    int[] y = new int[x.length + 1];
    return appendeElemento(x, y, y.length, n);
  }

  public static int[] appendeElemento(int[] x, int[] y, int i, int n){
    if(i == 0){
      return null;
    } else {
      appendeElemento(x, y, i-1, n);
      if(i == y.length){
        y[i-1] = n;
      } else {
        y[i-1] = x[i-1];
      }
      return y;
    }
  }
}
