public class Es2Almeno {
    public static boolean aDD(int[][] a){
        int nRighe = 0;
        int i = 0;
        boolean esisteR = nRighe == 2; //All'inizio sarà falsa
        while(!esisteR && i < a.length){
            int j = 0;
            boolean esisteC = false;
            while(!esisteC && j < a[i].length){
                esisteC = a[i][j] % 2 == 0;
                j = j + 1;
            }
            if (esisteC){ // Se esiste un valore pari allora possiamo incrementare
                            // il valore per contare se esistono almeno 2 righe con un numero pari;
                nRighe++;
            }
            esisteR = nRighe == 2; // Se esistono almeno 2 righe, allora esiste R diventa vero uscendo dal while
            i = i + 1;
        }
        return esisteR;
    }

    public static void main(String[] args) {
        int[][] m0 = { {1, 1}
                 , {1, 2}
                 , {1, 2} };
    System.out.println(true ==aDD(m0));

    int[][] m1 = { {1, 1}
                 , {1, 2}
                 , {1, 2} 
                 , {1, 2} 
                 };
    System.out.println(true ==aDD(m1));

    int[][] m2 = { {1, 1}
                 , {1, 2}
                 , {1, 1} };
    System.out.println(false==aDD(m2));
    }
}