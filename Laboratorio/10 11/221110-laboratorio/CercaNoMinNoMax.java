import java.util.Arrays;

/** Dati un *array*  `a` ed un valore `v`, restituire un *array* con tutti gli indici, tranne quello di valore minimo e di valore massimo, degli elementi di `a` che contengono `v`. `E possibile visitare più volte l'*array* `a`  */

public class CercaNoMinNoMax {
  
  public static int[] cerca(int[] a, int v) {
    int[] indici = new int[contaIndici(a, v)];
    indici(a, v, indici);
    return indici;
  }

  public static int contaIndici(int[] a, int v) {
    int n = 0;
    boolean minEscluso = false;
    boolean maxEscluso = false;
    
    /* Determina l'estremo sinistro l dell'intervallo di
       indici di a che esclude l'elemento di a più
       a sinistra a che contiene v */
    int l = 0;
    while (l < a.length/2 && !minEscluso) {
      minEscluso = a[l] == v;
      l = l + 1;
    }
    
    /* Determina l'estremo destro r dell'intervallo di
       indici di a che esclude l'elemento di a più
       a destrea e che contiene v */
    int r = a.length;
    while (a.length/2 < r && !maxEscluso) {
      r = r - 1;
      maxEscluso = a[r] == v;
    }

    /* Conta quanti elmenti uguali ad a nel segmento a[l...r) */
    for (int k = l; k < r; k = k + 1) {
      if (a[k]==v) {
        n = n + 1;
      }
    }
    return n;
  }
  
  public static int[] indici(int[] a, int v, int[] indici) {
    int n = 0;
    boolean minEscluso = false;
    boolean maxEscluso = false;
    
    /* Come in contaIndici(int[], int) */
    int l = 0;
    while (l < a.length/2 && !minEscluso) {
      minEscluso = a[l] == v;
      l = l + 1;
    }
    
    /* Come in contaIndici(int[], int) */
    int r = a.length;
    while (a.length/2 < r && !maxEscluso) {
      r = r - 1;
      maxEscluso = a[r] == v;
    }

    /* Nell'intervallo [l...r) individua gli indici degli
       elmenti di a uguali a v */
    int i = 0;
    for (int k = l; k < r; k = k + 1) {
      if (a[k]==v) {
        indici[i] = k;
        i = i + 1;
      }
    }

    return indici;
  }
}