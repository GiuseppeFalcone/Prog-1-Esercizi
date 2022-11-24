public class RicercaLineareItTest {
  public static void main(String[] args) {
    ricercaLineareItTest();
  }
  public static void ricercaLineareItTest(){
    System.out.println("-- Test per ricercaLineareIt ");
    int[] x0 = null;
    System.out.println(RicercaLineareItFinale.ricercaLineareIt(x0,1)==false);
    int[] x1 = {};
    System.out.println(RicercaLineareItFinale.ricercaLineareIt(x1,1)==false);
    int[] x2 = {0};
    System.out.println(RicercaLineareItFinale.ricercaLineareIt(x2,1)==false);
    int[] x3 = {1};
    System.out.println(RicercaLineareItFinale.ricercaLineareIt(x3,1)==true);
    int[] x4 = {1,0};
    System.out.println(RicercaLineareItFinale.ricercaLineareIt(x4,1)==true);
    int[] x5 = {0,1};
    System.out.println(RicercaLineareItFinale.ricercaLineareIt(x5,1)==true);
    int[] x6 = {0,1,0,1,0};
    System.out.println(RicercaLineareItFinale.ricercaLineareIt(x6,1)==true);

  }
}
