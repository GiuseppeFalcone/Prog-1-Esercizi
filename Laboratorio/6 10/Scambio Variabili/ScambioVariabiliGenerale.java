public class ScambioVariabiliGenerale {
  public static void main (String[] args){
    int tmp = 0;
    int a = 1;
    int b = 2;

    System.out.println("valore variabile tmp:" + tmp);
    System.out.println("valore variabile a:" + a);
    System.out.println("valore variabile b:" + b);

    tmp = a;
    a = b;
    b = tmp;

    System.out.println("valore variabile tmp:" + tmp);
    System.out.println("valore variabile a:" + a);
    System.out.println("valore variabile b:" + b);
  }
}

// provare byte, short, long, float, double
