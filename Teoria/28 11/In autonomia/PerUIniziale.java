public class PerUIniziale {

  public static int perU(int x, int y) {
   int ris = 0;
   int i = 0;
   /*  ris==x*i vero dopo 0 iterazioni
       infatti: 0 == 0
   */ 
   while (i < y) {
      /* 
       * Per IH: 
       * ris==x*i vero dopo n iterazioni
       * e quindi deve essere vero anche: 
       * ris + x == x+x*i == x(1+i)
       */
      ris = x + ris;
      /*  
       * ris == x+x*i == x(1+i)
       * 
      */
      i = 1 + i;
      /*  
       * ris == x*i
       * 
      */
   }
   /* ris==x*i && i==y */
   return ris;
}

  public static void main(String[] args) {
    int prodotto = perU(3,2);
  }
}