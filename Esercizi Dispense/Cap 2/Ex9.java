public class Ex9{
  public static void main (String[] args) {
    int a = 12;
    int b = 6;
    int i = b;
    int r = a;

    while (i > 1) {
      r = r * a;
      i = i - 1;
    }
    System.out.println("2 elevato 5 è:" + r);
  }
}
