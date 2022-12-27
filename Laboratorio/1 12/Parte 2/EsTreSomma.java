public class EsTreSomma{
    public static boolean somma(int[] a, int[] b){
        int i = 0;
        boolean perOgni = true;
        while (perOgni && i < a.length){
            int j = 0;
            boolean esiste = false;
            while(!esiste && (j < b.length-1)){
                esiste = (a[i] == b[j] + b[j+1]);
                j = j+1;
            }
            i = i+1;
            perOgni = esiste;
        }
        return perOgni;
    }

    public static void main(String[] args) {
    int[] a0 = {}; 
    int[] b0 = {1}; 
    int[] a1 = {10}; 
    int[] b1 = {5, 5}; 
    int[] b2 = {5, 1, 5}; 
    int[] a2 = {10, 2}; 
    int[] b3 = {1, 1, 7, 3}; 
    System.out.println(somma(a0,b0)==true);
    /* per ogni i, se i è nell'intervallo [0...length)
       allora esiste .... è un'affermazione vera quando
       l'intervallo è vuoto, come in questo caso. */
    System.out.println(somma(a1,b0)==false);
    System.out.println(somma(a1,b1)==true);
    System.out.println(somma(a1,b2)==false);
    System.out.println(somma(a2,b3)==true);
    }
}