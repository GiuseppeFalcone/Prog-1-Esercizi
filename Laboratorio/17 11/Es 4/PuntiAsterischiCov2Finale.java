public class PuntiAsterischiCov2Finale {

    public static void main(String[] args) {
       puntiAsterischi(0);
       System.out.println("---------------");
       puntiAsterischi(1);
       System.out.println("---------------");
       puntiAsterischi(2);
       System.out.println("---------------");
       puntiAsterischi(3);
        System.out.println("---------------");
       puntiAsterischi(4);
       System.out.println("---------------");       
       puntiAsterischi(5);
    }
    
    // ----------------------
    static void puntiAsterischi(int r) {
       puntiAsterischiCon(r, 0, true);
          /* stampa r-0 == r sequenze 
             in cui il numero di punti cresce */
       riga(r);
          /* stampa una riga di r punti 
             seguiti da 2 asterischi */
       puntiAsterischiCon(r, 0, false);
          /* stampa r-0 == r sequenze 
             in cui il numero di punti decresce */
    }

    // ----------------------
    static void riga(int p) {
      rigaCov(p); 
        /* stampa p punti */
      System.out.println("**");
    }

    // ----------------------
    static void rigaCov(int p) {
      if (p == 0) {
           /* stampa 0 punti */
      } else {
         System.out.print(".");
         rigaCov(p-1);
           /* stampa p-(i+1) punti rimanenti*/
      }
    }
    
    // ----------------------
    static void puntiAsterischiCon(int n, int i, boolean crescente) {
      if (i == n) {
        /* stampa n-i == 0 sequenze*/
      } else {
         if (crescente) {
            riga(i);
            /* stampa una riga con i punti */
         } else {
            riga(n-i-1);
            /* stampa una riga con n-i-1 punti */
         }        
         puntiAsterischiCon(n, i+1, crescente);
          /* stampa n-(i+1) sequenze rimanenti*/
      }
    }
}
