public class LibIterTest{
  public static void main(String[] args) {
    testDispari();
    System.out.println(" ");
    testQuadrato();
    System.out.println(" ");
    testSommaNDispari();
    System.out.println(" ");
    testPariPerSottr();
    System.out.println(" ");
    testQuoziente();
    System.out.println(" ");
    testResto();
    System.out.println(" ");
    testPrimo();
    System.out.println(" ");
    testSommaDivisori();

  }

  public static void testDispari(){
    System.out.println("Test Dispari");
    System.out.println(LibIter.dispari(7) == true);
    System.out.println(LibIter.dispari(6) == false);
    System.out.println(LibIter.dispari(3) == true);
    System.out.println("Fine test Dispari");
  }

  public static void testQuadrato(){
    System.out.println("Test Quadrato");
    System.out.println(LibIter.quadrato(5) == 36);
    System.out.println(LibIter.quadrato(6) == 49);
    System.out.println(LibIter.quadrato(11) == 144);
    System.out.println("Fine test Quadrato");
  }

  public static void testSommaNDispari(){
    System.out.println("Test Somma dei primi N Dispari");
    System.out.println(LibIter.sommaNDispari(3) == 9);
    System.out.println(LibIter.sommaNDispari(5) == 25);
    System.out.println(LibIter.sommaNDispari(6) == 36);
    System.out.println("Fine Test Somma Primi N Dispari");
  }

  public static void testPariPerSottr(){
    System.out.println("Test Numero Pari per Sottrazione di 2: ");
    System.out.println("//Test con Numeri Pari");
    System.out.println(LibIter.pariPerSottr(10) == true);
    System.out.println(LibIter.pariPerSottr(6) == true);
    System.out.println(LibIter.pariPerSottr(4) == true);
    System.out.println(LibIter.pariPerSottr(12) == true);
    System.out.println("//Test con Numeri Dispari:");
    System.out.println(LibIter.pariPerSottr(7) == false);
    System.out.println(LibIter.pariPerSottr(5) == false);
    System.out.println(LibIter.pariPerSottr(9) == false);
    System.out.println(LibIter.pariPerSottr(11) == false);
    System.out.println("Fine Test Pari per Sottrazione");
  }

  public static void testQuoziente(){
    System.out.println("Test Quoziente");

    System.out.println("//Test con D > d:");
    System.out.println(LibIter.quoz(7, 3) == 2);
    System.out.println(LibIter.quoz(8, 2) == 2);
    System.out.println(LibIter.quoz(12, 6) == 2);

    System.out.println("//Test con D < d:");
    System.out.println(LibIter.quoz(4, 8) == 0);
    System.out.println(LibIter.quoz(6, 13) == 0);

    System.out.println("Fine Test Quoziente");
  }

  public static void testResto(){
    System.out.println("Test Resto: ");
    System.out.println("//Test con D > d:");
    System.out.println(LibIter.resto(8, 4) == 0);
    System.out.println(LibIter.resto(7, 3) == 1);
    System.out.println(LibIter.resto(12, 5) == 2);

    System.out.println("//Test con D < d:");
    System.out.println(LibIter.resto(3, 7) == 3);
    System.out.println(LibIter.resto(4, 9) == 4);

    System.out.println("Fine Test Resto");
  }

  public static void testPrimo(){
    System.out.println("Test Numero Primo");

    System.out.println("//Test con Numeri Primi");
    System.out.println(LibIter.primo(5) == true);
    System.out.println(LibIter.primo(7) == true);
    System.out.println(LibIter.primo(11) == true);

    System.out.println("//Test con Numeri Non Primi");
    System.out.println(LibIter.primo(6) == false);
    System.out.println(LibIter.primo(12) == false);
    System.out.println(LibIter.primo(8) == false);

    System.out.println("Fine Test Numero Primo");
  }

  public static void testSommaDivisori(){
    System.out.println("Test Somma Divisori di n");

    System.out.println("//Test con Numeri Divisibili");
    System.out.println(LibIter.sommaDivisori(6) == 12);
    System.out.println(LibIter.sommaDivisori(8) == 15);
    System.out.println(LibIter.sommaDivisori(10) == 18);

    System.out.println("//Test con Numeri Primi");
    System.out.println(LibIter.sommaDivisori(7) == 8);
    System.out.println(LibIter.sommaDivisori(11) == 12);

    System.out.println("Fine Test Somma Divisori");
  }
}
