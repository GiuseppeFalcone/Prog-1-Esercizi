public class Resto{
  public static void main (String[] args){
    int D = 4;
    int d = 13;
    int resto = resCov(D, d);
    System.out.println("Il resto della divisione è: " + resto);
  }

  public static int resCov(int D, int d){
    int resto;
    int vI;
    if (D == 1){
      resto = 0;
      return resto;
    } else {
      vI = resCov(D, d - 1) - 1;
      return vI;
    }
  }
}
