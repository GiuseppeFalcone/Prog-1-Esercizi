import java.lang.String;
public class LibStringArray {
    //-------------------------------------------------//
    //Es 1
    public static String toString1(int[] a){
        if (a != null){
            return toString1(a, a.length);
        } else {
            return "Null Array Error";
        }
    }

    public static String toString1(int[] a, int i){
        if (i == 0){
            return "";
        } else {
            char div = ',';
            if (i == a.length){
                div = ' ';
            }
            return toString1(a, i-1) + a[i-1] + div;
        }
    }

    //-------------------------------------------------//
    //Es 2
    public static String toString2(int[] a){
        if (a != null){
            return toString2(a, a.length);
        } else {
            return "Impossibile stampare elementi da Array Null";
        }
    }

    public static String toString2(int[] a, int i){
        if (i == 0){
            return "";
        } else {
            char div = ',';
            if (i == a.length){
                div = '.';
            }
            return toString2(a, i-1) + a[i-1] + div;
        }
    }

    //-------------------------------------------------//
    //Es 3
    /**
     * @param s è la Stringa in entrata
     * @param i valore dell'intervallo iniziale (incluso)
     * @param f valore finale dell'intervallo della sotto stringa (escluso)
     * Alla fine avremo la sottostringa dei caratteri dell'intervallo [i, f-1]
     */

    /*
    Prima Versione
    public static void subString1(String s, int i, int f){
        char[] tmp = new char[f-i];
        for(int j = i, y = 0; j < f && y < f-i; j++, y++){
            tmp[y] = (s.charAt(j));
        }
        String subString = new String(tmp);
        System.out.println(subString);  
    }
    */

    //Versione Migliorata
    public static String substring(String s, int i, int f){
        String a = "";
        for(int x = i; x < f; x++){
            a += s.charAt(x);
        }
        return a;
    }
        
    //-------------------------------------------------//
    //Es 4
    public static boolean equals(String a, String b){
        if (a.length() == b.length()){
            return equals(a, b, 0);
        } else {
            return false;
        }
    }
    public static boolean equals(String a, String b, int i){
        if (i == a.length()){
            return true;
        } else {
            if (equals(a, b, i+1) && ((a.charAt(i)) == (b.charAt(i)))){
                return true;
            } else {
                return false;
            }
        }
    }

    //-------------------------------------------------//
    //Es 5 Versione Iterativa

    /* Versione del Prof
     * public static boolean palindroma(String s) {
        boolean p = true;
        for (int i = 0; p && i < s.length() / 2; i++)
            p = (s.charAt(i) == s.charAt(s.length() - (i + 1)));
        return p;
        }
     */
    
    public static boolean palindromaIter(String s){
        // I due arrays che conterranno le lettere della stringa
        char[] primaParte = new char[s.length()/2];
        char[] secondaParte = new char[s.length()/2];

        //Ciclo for per la prima parte della stringa
        for (int i = 0; i < (s.length()/2); i++){
            primaParte[i] = s.charAt(i);
        }

        //if utilizzato per determinare da dove iniziare per la seconda parte
        // Dato che anche stringhe come radar sono palindrome
        int tmp;
        if (s.length() % 2 != 0){
            tmp = (s.length()/2) + 1;
        } else {
            tmp = s.length()/2;
        }

        //Ciclo for per la seconda parte della
        for (int i = tmp, y = 0; (i < s.length()) && (y < secondaParte.length); i++, y++){
            secondaParte[y] = s.charAt(i);
        }

        // Ciclo While per il controllo dei due array
        // Prima parte da 0 => fine array
        // Seconda parte da fine array -> 0
        int i = 0, y = secondaParte.length-1;
        boolean r = true;
        while (r && ((i < primaParte.length) && (y >= 0))){
            if (primaParte[i] != secondaParte[y]){
               r = false;
            }
            i++; y--;
        }
        return r;
    }

    //-------------------------------------------------//
    //Es 5 Versione Ricorsiva
    /*
     * Utilizziamo il metodo substring della classe string così da controllare sottostringhe via 
     * via sempre più corte finchè non arriviamo a una sottostringa con: 
     *          - 0 elementi se la stringa iniziale ha pari lettere
     *          - 1 elemento  se la stringa iniziale ha numero dispari di lettere
     */
    public static boolean palindromaR(String s){
        if (s.length() == 1 || s.length() == 0){
            return true;
        } else {
            //Controlliamo che la prima e l'ultima lettera della sottostringa siano uguali
            // e che le altre lettere siano uguali a due a due richiamando la funzione ma
            // con una sottostringa che non ha presente queste ultime lettere controllate
            return (s.charAt(0) == s.charAt(s.length()-1)) 
                        && palindromaR(s.substring(1, s.length()- 1));
        }
    }

}
