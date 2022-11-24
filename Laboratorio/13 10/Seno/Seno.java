/** "Criteri"  di progettazione:
   disponibilità di sole opearazioni di base.
   Esempio. Somma, moltiplicazione, etc.,
   implementate da algoritmi definiti autonomamente.
*/
public class Seno{
  public static somma(int x, int y) {
    int s = x;
    int i = y;
    while (i > 0) {
      s = s + 1;
      i = i - 1;
    }
    return s;
  }

  public static int molt(int x, int y) {
    int m = 0;
    int i = y;
    while(i > 0) {
      m = som(m, x);
      i = i - 1;
    }
    return m;
  }


  esp(x, y) {
    e = 1;
    i = y;
    while(i > 0) {
      e = mol(e, x);
      i = i - 1
    }
    return e
  }

  dispari(x) {
    r = false;
    i = 0;
    while (i < x) {
      r = !r;
      i = i + 1
    }
    return r
  }

  numeratore(z, k) {
    e = mol(2,k)+1;
    n = esp(z,e);
    if (dispari(k)) {
      n = -n;
    }
    return n
  }

  fatt(x) {
    if (x == 0) {
      return 1
    } else {
      valoreInduttivo = fatt(x - 1);
      r = mol(x, valoreInduttivo);
      return r
    }
  }

  denominatore(k) {
    d = fatt(mol(2,k)+1);
    return d
  }

  sin(z, n) {
    s = 0;
    k = 0;
    while (k < n) {
      num = numeratore(z, k);
      den = denominatore(k);
      s = s + num/den;
      k = k + 1
    }
    return s
  }

}
