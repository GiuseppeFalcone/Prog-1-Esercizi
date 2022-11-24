/** Trasformare questo file in una classe Java.
I criteri per farlo sono:
- se alcuni dei metodi sono definiti in un'altra classe, è necessario usare quelli, eliminandoli da questo sorgente, nella sua forma finale
Esempio. Il metodo "piu" ci si aspetta che sia disponibile in una classe "Aritmetica", mentre "dispari" ci sia aspetta che sia disponibile in una libreria "ProrietaAritmetica"
- al termine, la classe deve contenere i soli metodi non definiti altrove, necessari alla definizione di sin
*/
public class ListMathSeries {

    // aritmetica
    public static int piu(int x, int y) {
      int i = y;
      int s = x;
      while(i > 0) {
        s = s + 1;
        i = i - 1;
      }
      return s;
    }

    public static int per(int x, int y) {
      int m = 0;
      int i = y;
      while(i > 0) {
        m = piu(m, x);
        i = i - 1;
      }
      return m;
    }

    public static int quoziente(int D, int d) {
      if (D < d) {
        return 0;
      } else {
         return quoziente(D-d, d) + 1;
      }
    }

    public static int esp(int x, int y) {
      int e = 1;
      int i = y;
      while(i > 0) {
        e = per(e, x);
        i = i - 1;
      }
      return e;
    }

    public static boolean dispari(int x) {
      boolean r = false;
      int i = 0;
      while (i < x) {
        r = !r;
        i = i + 1;
      }
      return r;
    }

    public static int fatt(int x) {
      if (x == 0) {
        return 1;
      } else {
        return per(x, fatt(x - 1));
      }
    }

    // list series
    public static int numSin(int z, int k) {
      int e = per(2,k)+1;
      int n = esp(z,e);
      if (dispari(k)) {
        n = -n;
      }
      return n;
    }

    public static int denSin(int k) {
      return fatt(per(2,k)+1);
    }

    public static float sin(int z, int n) {
      float s = 0;
      int k = 0;
      while (k < n) {
        float num = numSin(z, k);
        float den = denSin(k);
        s = s + num/den;
        k = k + 1;
      }
      return s;
    }

    // Given z and k values it gives an apprx of cos;
    public static float cos(int z, int k){
      int i = 1;
      if(dispari(k)){
        i = -i;
      }
      float num = per(i , esp(z, 2*k));
      float den = fatt(2*k);

      return num/den;
    }

    // Given z and k it results in e^z
    public static float expFun(int z, int k){
      float vI;
      if (k == 0){
        return esp(z, k);
      } else{
        vI = expFun(z, k-1);
        return vI + (esp(z, k)/fatt(k));
      }
    }

}
