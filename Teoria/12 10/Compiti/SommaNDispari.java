public class SommaNDispari {
  public static void main(String[] args) {
    System.out.println(somma(3));
  }
  public static int sommaNDispari(int n){
    if (n == 1){
      return 1;
    } else {
      if(dispari(n)){
        return sommmaNDispari(n-1) + n;
      } else{
        return sommaNDispari(n-1);
      }
    }
  }
}
