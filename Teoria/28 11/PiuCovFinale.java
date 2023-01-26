public class PiuCovFinale {

    public static int piuCov(int x, int n) {
      if (n == 0) {
        int ris = x+n;
        System.out.println("Base: " + (ris==x+n));
        return ris;
      } else  {
        int ris = piuCov(x, n-1);
        System.out.println("Ipotesi induttiva: " 
            + (ris==x+(n-1)));
        System.out.println("Conclusione passo induttivo: " 
            +  (ris+1==x+((n-1)+1)));
        return ris+1;
      }
    }
   
    public static void main(String[] args) {
      int somma = piuCov(3,2);
      boolean vero = true;
      int n = 0;
      while (verQo) {
        System.out.println("----- n == " + n);
        piuCov(3,n);
        n++;
      }
  
    }
  }