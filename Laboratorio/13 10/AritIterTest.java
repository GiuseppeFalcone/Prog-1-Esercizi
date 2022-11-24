public class AritIterTest {
  public static void main (String[] args) {
    testPiu();
    System.out.println("");
    testPer();
    System.out.println("");
    testEsp();
    System.out.println("");
    testMeno();
    System.out.println("");
    testQuoz();
    System.out.println("");
    testFatt();
  }
  public static void testPiu(){
    System.out.println("Test Addizione");

    System.out.println("//Test Valore Neutro (0):");
    System.out.println(AritIter.piu(0,0)==0); // 0 ele. neutro a dx
    System.out.println(AritIter.piu(1,0)==1);
    System.out.println(AritIter.piu(2,0)==2);
    System.out.println(AritIter.piu(0,1)==1); // 0 ele. neutro a sx
    System.out.println(AritIter.piu(0,2)==2);

    System.out.println("//Test Propr. Commutativa:");
    System.out.println(AritIter.piu(3,2) == AritIter.piu(2,3));
    System.out.println(AritIter.piu(2,7) == AritIter.piu(2,7));

    System.out.println("//Test Prop. Associativa: ");
    System.out.println(AritIter.piu(AritIter.piu(1,2),3) ==
                       AritIter.piu(1,AritIter.piu(2,3)));
    System.out.println(AritIter.piu(AritIter.piu(0,2),3) ==
                       AritIter.piu(0,AritIter.piu(2,3)));
    System.out.println("Fine Test Addizione");
  }

  public static void testPer(){
    System.out.println("Test Moltiplicazione");
    System.out.println("//Test Valore Neutro (1): ");
    System.out.println(AritIter.per(1,1)==1); // 1 ele. neutro a dx
    System.out.println(AritIter.per(2,1)==2);
    System.out.println(AritIter.per(1,2)==2); // 1 ele. neutro a sx
    System.out.println(AritIter.per(1,1)==1);

    System.out.println("//Test Prop. Commutativa:");
    System.out.println(AritIter.per(3,1) == AritIter.per(1, 3));
    System.out.println(AritIter.per(8,2) == AritIter.per(2, 8));

    System.out.println("//Test Prop. Associativa");
    System.out.println(AritIter.per(AritIter.per(1,2),3) ==
                      AritIter.per(1,AritIter.per(2,3)));
    System.out.println(AritIter.per(AritIter.per(0,2),3) ==
                      AritIter.per(0,AritIter.per(2,3)));

    System.out.println("Fine Test Moltiplicazione");
  }

  public static void testEsp(){
    System.out.println("Test Esponenziale:");

    System.out.println("//Test Base Nulla (0)");
    System.out.println(AritIter.esp(0, 2) == 0);
    System.out.println(AritIter.esp(0, 5) == 0);

    System.out.println("//Test Base 1: ");
    System.out.println(AritIter.esp(1, 2) == 1);
    System.out.println(AritIter.esp(1, 5) == 1);

    System.out.println("//Test Generali:");
    System.out.println(AritIter.esp(3, 2) == 9);
    System.out.println(AritIter.esp(4, 2) == 16);

    System.out.println("//Test Prodotto Tra Esponenziale con Basi Uguali: ");
    System.out.println(AritIter.per(AritIter.esp(2, 3), AritIter.esp(2, 2)) ==
                                  AritIter.esp(2, AritIter.piu(3, 2)));
    System.out.println(AritIter.per(AritIter.esp(3, 3), AritIter.esp(3, 2)) ==
                                  AritIter.esp(3, AritIter.piu(3, 2)));

    System.out.println("//Test Divisione con Basi Uguali: ");
    System.out.println(AritIter.quoz(AritIter.esp(2, 3), AritIter.esp(2, 2)) ==
                      AritIter.esp(2, AritIter.meno(3, 2)));
    System.out.println(AritIter.quoz(AritIter.esp(4, 6), AritIter.esp(4, 3)) ==
                      AritIter.esp(4, AritIter.meno(6, 3)));

    System.out.println("Fine Test Esponenziale");
  }

  public static void testMeno(){
    System.out.println("Test Sottrazione: ");

    System.out.println("//Test Valore Neutro (0):");
    System.out.println(AritIter.meno(0,0)==0); // 0 ele. neutro a dx
    System.out.println(AritIter.meno(1,0)==1);
    System.out.println(AritIter.meno(2,0)==2);

    System.out.println("//Test Propr. Invariantiva");
    System.out.println(AritIter.meno(AritIter.piu(5, 4),AritIter.piu(3, 4))
                      == AritIter.meno(5,3));
    System.out.println(AritIter.meno(AritIter.meno(7, 2),AritIter.meno(3, 2))
                      == AritIter.meno(7,3));

    System.out.println("Fine Test Sottrazione");
  }

  public static void testQuoz(){
    System.out.println("Test Quoziente: ");

    System.out.println("//Test Valore Neutro (1): ");
    System.out.println(AritIter.quoz(6, 1) == 6);
    System.out.println(AritIter.quoz(8, 1) == 8);

    System.out.println("//Test Generale");
    System.out.println(AritIter.quoz(4, 2) == 2);
    System.out.println(AritIter.quoz(8, 4) == 2);
    System.out.println(AritIter.quoz(15, 3) == 5);

    System.out.println("Fine Test Quoziente");
  }

  public static void testFatt(){
    System.out.println("Test Fattoriale");

    System.out.println("//Test Fatt di Zero (0): ");
    System.out.println(AritIter.fatt(0) == 1);

    System.out.println("//Test Generali: ");
    System.out.println(AritIter.fatt(5) == 120);
    System.out.println(AritIter.fatt(8) == 40320);
    System.out.println(AritIter.fatt(3) == 6);

    System.out.println("Fine Test Fattoriale");
  }
}
