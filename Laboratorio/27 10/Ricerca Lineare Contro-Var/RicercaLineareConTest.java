public class RicercaLineareConTest {

  public static void main (String[] args) {
    ricercaLineareConTest();
    ricercaLineareConLogicaTest();
    ricercaLineareConTestIncrociato();
  }

  public static void ricercaLineareConTest() {
    System.out.println("-- Test per ricercaLineareCon ");
    int[] x0 = null;
    System.out.println(RicercaLineareCon.ricercaLineareCon(x0,1)==false);
    int[] x1 = {};
    System.out.println(RicercaLineareCon.ricercaLineareCon(x1,1)==false);
    int[] x2 = {0};
    System.out.println(RicercaLineareCon.ricercaLineareCon(x2,1)==false);
    int[] x3 = {1};
    System.out.println(RicercaLineareCon.ricercaLineareCon(x3,1)==true);
    int[] x4 = {1,0};
    System.out.println(RicercaLineareCon.ricercaLineareCon(x4,1)==true);
    int[] x5 = {0,1};
    System.out.println(RicercaLineareCon.ricercaLineareCon(x5,1)==true);
    int[] x6 = {0,1,0,1,0};
    System.out.println(RicercaLineareCon.ricercaLineareCon(x6,1)==true);
  }

  public static void ricercaLineareConLogicaTest() {
    System.out.println("-- Test per ricercaLineareConLogica ");
    int[] x0 = null;
    System.out.println(RicercaLineareCon.ricercaLineareConLogica(x0,1)==false);
    int[] x1 = {};
    System.out.println(RicercaLineareCon.ricercaLineareConLogica(x1,1)==false);
    int[] x2 = {0};
    System.out.println(RicercaLineareCon.ricercaLineareConLogica(x2,1)==false);
    int[] x3 = {1};
    System.out.println(RicercaLineareCon.ricercaLineareConLogica(x3,1)==true);
    int[] x4 = {1,0};
    System.out.println(RicercaLineareCon.ricercaLineareConLogica(x4,1)==true);
    int[] x5 = {0,1};
    System.out.println(RicercaLineareCon.ricercaLineareConLogica(x5,1)==true);
    int[] x6 = {0,1,0,1,0};
    System.out.println(RicercaLineareCon.ricercaLineareConLogica(x6,1)==true);
  }

  public static void ricercaLineareConTestIncrociato() {
    System.out.println("-- Test 'incrociato' ");
    int[] x0 = null;
    System.out.println(RicercaLineareCon.ricercaLineareCon(x0,1)==
                          RicercaLineareCon.ricercaLineareConLogica(x0,1));
    int[] x1 = {};
    System.out.println(RicercaLineareCon.ricercaLineareCon(x1,1)==
                          RicercaLineareCon.ricercaLineareConLogica(x1,1));
    int[] x2 = {0};
    System.out.println(RicercaLineareCon.ricercaLineareCon(x2,1)==
                          RicercaLineareCon.ricercaLineareConLogica(x2,1));
    int[] x3 = {1};
    System.out.println(RicercaLineareCon.ricercaLineareCon(x3,1)==
                          RicercaLineareCon.ricercaLineareConLogica(x3,1));
    int[] x4 = {1,0};
    System.out.println(RicercaLineareCon.ricercaLineareCon(x4,1)==
                          RicercaLineareCon.ricercaLineareConLogica(x4,1));
    int[] x5 = {0,1};
    System.out.println(RicercaLineareCon.ricercaLineareCon(x5,1)==
                          RicercaLineareCon.ricercaLineareConLogica(x5,1));
    int[] x6 = {0,1,0,1,0};
    System.out.println(RicercaLineareCon.ricercaLineareCon(x6,1)==
                          RicercaLineareCon.ricercaLineareConLogica(x6,1));
  }

}
