public class MenDIniziale {
 
  /* 0<=a && 0<=b && b<=a */
  public static int menU(int x, int y) {
    int ris = x;
    int i = y;
    /*  
     * ris==x-(y-i) vero dopo 0 iterazioni
     * dato che ris == x - (y-i) == x - 0 == x
    */
    while (i > 0) {
      /*  ris==x-(y-i) vera dopo n iterazioni per IH
      /*  ris - 1 ==x-y+i-1
       * 
      */

      ris = ris - 1;
      /*
       * ris==x-y+i-1
       */
      i = i - 1;
      /*  
       * ris==x-y+i
       * ris==x-(y-i) vera dopo n+1 iterazioni
       * 
       * 
      */
    }
    /* (ris==x-(y-i)) && i==0)
        deve essere vero        */
    return ris;
  } 
  
  public static void main(String[] args) {
    int somma = menU(3,2);
  }
}
