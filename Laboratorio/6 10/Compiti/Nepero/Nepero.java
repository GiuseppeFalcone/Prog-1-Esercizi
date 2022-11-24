public class Nepero{
  public static void main (String[] args){
    double e = 2;
    double i = 2;
    double n = 1900;
    double s = 0;
    while (i <= n){
      s = s + 1/fatt(i);
      i++;
    }
    e = e + s;
    System.out.println("e = " + e);
  }

  public static double fatt (double n) {
    double r = 1;
    if (n > 0){
      while (n > 0){
        r = r * n;
        n--;
      }
    } else {
      r = 1;
    }
    return r;
  }
}
