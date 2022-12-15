public class LibStringArrayTest {
  public static void main (String[] args) {
    toStringTest();
    toStringPuntoFinaleTest();
    equalsSubstringTest();
    palindromaTest();
    palindromaRTest();
  }

  public static void toStringTest () { 
    System.out.println(" --- Test toString");
    System.out.println(LibStringArray.toString1(new int[] {}));
    System.out.println(LibStringArray.toString1(new int[] {1}));
    System.out.println(LibStringArray.toString1(new int[] {1,2}));
    System.out.println(LibStringArray.toString1(new int[] {1,2,3}));
  }

  public static void toStringPuntoFinaleTest() { 
    System.out.println(" --- Test toStringPuntoFinale");
    System.out.println(LibStringArray.toString2(new int[] {}));
    System.out.println(LibStringArray.toString2(new int[] {1}));
    System.out.println(LibStringArray.toString2(new int[] {1,2}));
    System.out.println(LibStringArray.toString2(new int[] {1,2,3}));
  }

  public static void equalsSubstringTest() { 
    System.out.println(" --- Test equals e substring");
    System.out.println(LibStringArray.equals("bc",LibStringArray.substring("abc",1,3)) == true);
    System.out.println(LibStringArray.equals("c",LibStringArray.substring("abc",2,3)) == true);
    System.out.println(LibStringArray.equals("",LibStringArray.substring("abc",2,3)) == false);
  }

  public static void palindromaTest() { 
    System.out.println(" --- Test palindroma con metodo iterativo ");
    System.out.println(LibStringArray.palindromaIter("anna")==true);
    System.out.println(LibStringArray.palindromaIter("anno")==false);
    System.out.println(LibStringArray.palindromaIter("radar")==true);
  }

  public static void palindromaRTest() { 
    System.out.println(" --- Test palindroma con metodo ricorsivo ");
    System.out.println(LibStringArray.palindromaR("anna")==true);
    System.out.println(LibStringArray.palindromaR("anno")==false);
    System.out.println(LibStringArray.palindromaR("radar")==true);
  }
}