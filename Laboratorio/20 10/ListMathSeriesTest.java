import java.lang.Math;

public class ListMathSeriesTest {
  public static void main (String[] args) {
    System.out.println(ListMathSeries.sin(0,5));
    System.out.println(Math.sin(0));
    System.out.println(ListMathSeries.sin(1,5));
    System.out.println(Math.sin(1));
    System.out.println(ListMathSeries.sin(2,5));
    System.out.println(Math.sin(2));
    System.out.println(ListMathSeries.sin(3,5));
    System.out.println(Math.sin(3));
    System.out.println(ListMathSeries.sin(4,5)); // peggiora
    System.out.println(Math.sin(4));
    System.out.println(ListMathSeries.sin(5,5)); // pessimo
    System.out.println(Math.sin(5));

  }
}
