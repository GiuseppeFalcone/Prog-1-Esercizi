public class EsUnoDominante {
    private static boolean p(int divisore, int dividento){
        return ((dividento % divisore) == 0);
    }
    
    public static boolean dominante(int[] a) {
        int dominante = 0;
        boolean esiste = false;
        while(!esiste && dominante < a.length){
            int dominato = 0;
            boolean perOgni = true;
            while(perOgni && dominato < a.length){
                perOgni = p(a[dominante], a[dominato]);
                dominato = dominato + 1;
            }
            esiste = perOgni;
            dominante = dominante + 1;
        }
        return esiste;
    }

    public static void main(String[] args) {
    int[][] m0 = { {10,  5,  1,  7}
                 , {14,  7, 21, 28}
                 , {30, 10, 20,  5} };

      int[][] m1 = { {14,  7, 21,  5}
                   , {12,  3, 21, 30} }; 

      System.out.println(true ==dominante(m0[0]));
      System.out.println(true ==dominante(m0[1]));
      System.out.println(true ==dominante(m0[2]));

      System.out.println(false==dominante(m1[0]));
      System.out.println(true ==dominante(m1[1]));
    }   
}