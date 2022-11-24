// Dati D e d > 0, calcolare il quoziente della divisione D/d

public class QuozCov {
  public static void main(String[] args) {
    System.out.println("Quoziente: " + quoz(9, 3));
  }

  public static int quoz(int D, int d){
    if (D < d){
      return 0;
    } else
      return quoz(D-d, d) + 1;
    }
}
