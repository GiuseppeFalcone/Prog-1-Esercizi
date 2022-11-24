public class RicercaLineareCovTest {
  public static void main(String[] args) {
    testRicercaLineareCov();
  }

  public static void testRicercaLineareCov(){
    System.out.println("-- Test per ricercaLineareCov ");
    int[] x0 = null;
    System.out.println(RicercaLineareCov.ricercaLineareCov(x0,1)==false);
    int[] x1 = {};
    System.out.println(RicercaLineareCov.ricercaLineareCov(x1,1)==false);
    int[] x2 = {0};
    System.out.println(RicercaLineareCov.ricercaLineareCov(x2,1)==false);
    int[] x3 = {1};
    System.out.println(RicercaLineareCov.ricercaLineareCov(x3,1)==true);
    int[] x4 = {1,0};
    System.out.println(RicercaLineareCov.ricercaLineareCov(x4,1)==true);
    int[] x5 = {0,1};
    System.out.println(RicercaLineareCov.ricercaLineareCov(x5,1)==true);
    int[] x6 = {0,1,0,1,0};
    System.out.println(RicercaLineareCov.ricercaLineareCov(x6,1)==true);

  }
}
