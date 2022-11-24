import java.util.Arrays;

public class InserisceElemento {
  public static void main(String[] args) {
    int[] x = {50, 40, 20, 10};
    int i = 2;
    int e = 30;
    System.out.println("Array x: " + Arrays.toString(x));

    System.out.println("Versione Iterativa: ");
    int[] y = inserisceIter(x, i, e);
    System.out.println("Array x aggiornato: " + Arrays.toString(y));

    System.out.println("Versione Co-variante: ");
    y = inserisceCov(x, i, e);
    System.out.println("Array x aggiornato: " + Arrays.toString(y));
  }

  public static int[] inserisceIter(int[] x, int i, int e){
    int[] y = new int[x.length + 1];
    int j = 0;
    while (j >= 0 && j <= x.length){
      if (j < i) {
        y[j] = x[j];
      }
      if (j == i){
        y[j] = e;
      }
      if (j > i){
        y[j] = x[j-1];
      }
      j += 1;
    }
    return y;
  }

  public static int[] inserisceCov(int[] x, int i, int e){
    if (x != null && (i >= 0 && i <= x.length)){
      int[] y = new int[x.length + 1];
      inserisceCov(x, y, x.length, i, e);
      return y;
    } else {
      return null;
    }
  }

  public static void inserisceCov(int[] x, int[] y, int j, int i, int e){
    if (j == 0){
    } else {
      inserisceCov(x, y, j-1, i, e);
      if (j < i+1){
        y[j-1] = x[j-1];
      }
      if (j == i){
        y[j] = e;
      }
      if (j > i){
        y[j] = x[j-1];
      }
    }
  }

  public static int[] inserisceContr(int[] x, int i, int e){
    if (x != null && (i >= 0 && i <= x.length)){
      int[] y = new int[x.length + 1];
      inserisceContr(x, y, 0, i, e);
      return y;
    } else {
      return null;
    }
  }

  public static void inserisceContr(int[] x, int[] y, int j, int i, int e){
    if (j == x.length){
    } else {
      inserisceContr(x, y, j+1, i, e);
      if (j < i){
        y[j] = x[j];
      }
      if (j == i){
        y[j] = e;
      }
      if (j > i){
        y[j] = x[j];
      }
    }
  }

}
