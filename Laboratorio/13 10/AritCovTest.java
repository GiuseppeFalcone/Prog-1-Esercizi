public class AritCovTest {
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
    System.out.println(AritCov.piu(0,0)==0); // 0 ele. neutro a dx
    System.out.println(AritCov.piu(1,0)==1);
    System.out.println(AritCov.piu(2,0)==2);
    System.out.println(AritCov.piu(0,1)==1); // 0 ele. neutro a sx
    System.out.println(AritCov.piu(0,2)==2);

    System.out.println("//Test Propr. Commutativa:");
    System.out.println(AritCov.piu(3,2) == AritCov.piu(2,3));
    System.out.println(AritCov.piu(2,7) == AritCov.piu(2,7));

    System.out.println("//Test Prop. Associativa: ");
    System.out.println(AritCov.piu(AritCov.piu(1,2),3) ==
                       AritCov.piu(1,AritCov.piu(2,3)));
    System.out.println(AritCov.piu(AritCov.piu(0,2),3) ==
                       AritCov.piu(0,AritCov.piu(2,3)));
    System.out.println("Fine Test Addizione");
  }

  public static void testPer(){
    System.out.println("Test Moltiplicazione");
    System.out.println("//Test Valore Neutro (1): ");
    System.out.println(AritCov.per(1,1)==1); // 1 ele. neutro a dx
    System.out.println(AritCov.per(2,1)==2);
    System.out.println(AritCov.per(1,2)==2); // 1 ele. neutro a sx
    System.out.println(AritCov.per(1,1)==1);

    System.out.println("//Test Prop. Commutativa:");
    System.out.println(AritCov.per(3,1) == AritCov.per(1, 3));
    System.out.println(AritCov.per(8,2) == AritCov.per(2, 8));

    System.out.println("//Test Prop. Associativa");
    System.out.println(AritCov.per(AritCov.per(1,2),3) ==
                      AritCov.per(1,AritCov.per(2,3)));
    System.out.println(AritCov.per(AritCov.per(0,2),3) ==
                      AritCov.per(0,AritCov.per(2,3)));

    System.out.println("Fine Test Moltiplicazione");
  }

  public static void testEsp(){
    System.out.println("Test Esponenziale:");

    System.out.println("//Test Base Nulla (0)");
    System.out.println(AritCov.esp(0, 2) == 0);
    System.out.println(AritCov.esp(0, 5) == 0);

    System.out.println("//Test Base 1: ");
    System.out.println(AritCov.esp(1, 2) == 1);
    System.out.println(AritCov.esp(1, 5) == 1);

    System.out.println("//Test Generali:");
    System.out.println(AritCov.esp(3, 2) == 9);
    System.out.println(AritCov.esp(4, 2) == 16);

    System.out.println("//Test Prodotto Tra Esponenziale con Basi Uguali: ");
    System.out.println(AritCov.per(AritCov.esp(2, 3), AritCov.esp(2, 2)) ==
                                  AritCov.esp(2, AritCov.piu(3, 2)));
    System.out.println(AritCov.per(AritCov.esp(3, 3), AritCov.esp(3, 2)) ==
                                  AritCov.esp(3, AritCov.piu(3, 2)));

    System.out.println("//Test Divisione con Basi Uguali: ");
    System.out.println(AritCov.quoz(AritCov.esp(2, 3), AritCov.esp(2, 2)) ==
                      AritCov.esp(2, AritCov.meno(3, 2)));
    System.out.println(AritCov.quoz(AritCov.esp(4, 6), AritCov.esp(4, 3)) ==
                      AritCov.esp(4, AritCov.meno(6, 3)));

    System.out.println("Fine Test Esponenziale");
  }

  public static void testMeno(){
    System.out.println("Test Sottrazione: ");

    System.out.println("//Test Valore Neutro (0):");
    System.out.println(AritCov.meno(0,0)==0); // 0 ele. neutro a dx
    System.out.println(AritCov.meno(1,0)==1);
    System.out.println(AritCov.meno(2,0)==2);

    System.out.println("//Test Propr. Invariantiva");
    System.out.println(AritCov.meno(AritCov.piu(5, 4),AritCov.piu(3, 4))
                      == AritCov.meno(5,3));
    System.out.println(AritCov.meno(AritCov.meno(7, 2),AritCov.meno(3, 2))
                      == AritCov.meno(7,3));

    System.out.println("Fine Test Sottrazione");
  }

  public static void testQuoz(){
    System.out.println("Test Quoziente: ");

    System.out.println("//Test Valore Neutro (1): ");
    System.out.println(AritCov.quoz(6, 1) == 6);
    System.out.println(AritCov.quoz(8, 1) == 8);

    System.out.println("//Test Generale");
    System.out.println(AritCov.quoz(4, 2) == 2);
    System.out.println(AritCov.quoz(8, 4) == 2);
    System.out.println(AritCov.quoz(15, 3) == 5);

    System.out.println("Fine Test Quoziente");
  }

  public static void testFatt(){
    System.out.println("Test Fattoriale");

    System.out.println("//Test Fatt di Zero (0): ");
    System.out.println(AritCov.fatt(0) == 1);

    System.out.println("//Test Generali: ");
    System.out.println(AritCov.fatt(5) == 120);
    System.out.println(AritCov.fatt(8) == 40320);
    System.out.println(AritCov.fatt(3) == 6);

    System.out.println("Fine Test Fattoriale");
  }

  public static void testMultipli(){
    System.out.println("Test Multipli tra vari metodi:");

    System.out.println("//Test tra Moltiplicazione e Addizione");
    System.out.println(AritCov.per(3, 3) == AritCov.piu(3, AritCov.piu(3, 3)));
    System.out.println(AritCov.per(5, 4) == AritCov.piu(5, AritCov.piu(5, AritCov.piu(5, 5))));

    System.out.println("//Test Multiplicazione e Fattoriale: ");
    System.out.println(fatt(5) == per(1 per(2, per(3, per(4, per(5))))));
    System.out.println(fatt(4) == per(1 per(2, per(3, 4)));

    System.out.println("//Test tra Moltiplicazione e Esponenziale: ");
    System.out.println(esp(3, 3) == per(3, per(3, 3)));
    System.out.println(esp(2, 4) == per(2, per(2, per(2, per(2, 2)))));





  }
}
