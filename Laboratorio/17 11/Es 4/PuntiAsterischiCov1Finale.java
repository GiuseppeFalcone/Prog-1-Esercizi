public class PuntiAsterischiCov1Finale {

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
      if  (p == 0) {
        /* stampa 0 punti */
      } else {
       rigaCov(p-1); /* stampa p-1 punti iniziali */
       System.out.print("."); /* il punto mancante */
      }
    }
    
    // ----------------------
    static void puntiAsterischiCon(int n, int i, boolean crescente) {
      if (i == n) {
        /* stampa n-i == 0 sequenze*/
      } else {
         if (crescente) {
            riga(i);
            /* stampa una riga con i punti e due asterischi */
            puntiAsterischiCon(n, i+1, crescente);
            /* stampa n-(i+1) sequenze rimanenti*/
         } else {
            puntiAsterischiCon(n, i+1, crescente);
            /* stampa n-(i+1) sequenze rimanenti*/
            riga(i);
            /* stampa una riga con i punti */
         }        
      }
    }
}
