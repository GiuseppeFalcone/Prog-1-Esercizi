import java.util.Arrays;

public class FiltriArrayDi{
    //Metodo Wrapper
    public static int[] limiteSuperioreVersUno(int[] a, int lim){
        if (a != null){
            int[] b = new int[limiteSuperioreVersUno(a, lim, 0, a.length)];
            limiteSuperioreVersUno(a, b, lim, 0, a.length, 0);
            return b;
        } else {
            return null;
        }
    }

    //Metodo per controllare quanti elementi hanno valore minore del limite
    private static int limiteSuperioreVersUno(int[] a, int lim, int l, int r){
        if (l+1 == r){
            if (a[l] < lim){
                return 1;
            } else {
                return 0;
            }
        } else {
            int m = (l+r)/2;
            int Sx = limiteSuperioreVersUno(a, lim, l, m);
            int Dx = limiteSuperioreVersUno(a, lim, m, r);
            return Sx + Dx;
        }
    }
    // Metodo che controlla i valori minori di lim e li assegna a b tramite metodo assegnaValore
    private static int limiteSuperioreVersUno(int[] a, int[] b, int lim, int l, int r, int i){
        if (l+1 == r){
            if (a[l] < lim){
                //assegnaValore(b, a[l]);
                b[i] = a[l];
                return i + 1;
            } else {
                return i;
            } 
        } else {
            int m = ((l+r)/2);
            i = limiteSuperioreVersUno(a, b, lim, l, m, i);
            i = limiteSuperioreVersUno(a, b, lim, m, r, i);
            return i;
        }
    }
    /* 
     * 
     // Metodo per assegnare valori all'array b
     private static void assegnaValore(int[] b, int val){
         int i = 0;
         boolean controllo = true;
         while (controllo && i < b.length){
             if (b[i] == 0){
                 b[i] = val;
                 controllo = !controllo;
                }
                i = i + 1;
            }
        }
        */

    ///////////////////////////////////////////////////////////////////////
    
    //Metodo Wrapper
    public static int[] limiteSuperioreVersDue(int[] a, int lim){
        int[] b = new int[]{};
        if (a != null){
            b = limiteSuperioreVersDue(a, lim, 0, a.length, b);
        }
        return b;
    }

    //Metodo che dicotomicamente controlla i valori ed aggiunge i valori corretti in b
    private static int[] limiteSuperioreVersDue(int[] a, int lim, int l, int r, int[] b){
        if (l+1 == r){
            if (a[l] < lim){
                int[] tmp = new int[b.length + 1];
                int i = 0;
                while (i < b.length){
                    tmp[i] = b[i];
                    i = i + 1;
                }
                tmp[b.length] = a[l];
                b = tmp;
            }
            return b;
        } else {
            int m = ((l+r)/2);
            b = limiteSuperioreVersDue(a, lim, l, m, b);
            b = limiteSuperioreVersDue(a, lim, m, r, b);
            return b;
        }
    }

/*=====================================================================================*/
    // Metodo Wrapper
    public static int[] soloElDispariV1(int[] a){
        int[] b = null;
        if (a != null){
            b = new int[soloElDispariV1(a, 0, a.length)];
            soloElDispariV1(a, 0, a.length, b, 0);
        }
        return b;
    } 
    // Metodo che conta quanti valori dispari ci sono 
    private static int soloElDispariV1(int[] a, int l, int r){
        if (l+1 == r){
            if (a[l] % 2 != 0){
                return 1;
            } else {
                return 0;
            }
        } else {
            int m = ((l+r)/2);
            return (soloElDispariV1(a, l, m) + soloElDispariV1(a, m, r));
        }
    }
    // Metodo che assegna i valori dispari di a all'array b
    private static int soloElDispariV1(int[] a, int l, int r, int[] b, int i){
        if (l+1 == r){
            if (a[l] % 2 != 0){
                b[i] = a[l];
                return i+1;
            } else {
                return i;
            }
        } else {
            int m = ((l+r)/2);
            i = soloElDispariV1(a, l, m, b, i);
            i = soloElDispariV1(a, m, r, b, i);
            return i;
        }
    }

    ///////////////////////////////////////////////////////////////////////

    public static int[] soloElDispariV2(int[] a){
        int[] b = null;
        if (a != null){
            b = new int[]{};
            b = soloElDispariV2(a, 0, a.length, b);
        }
        return b;
    }

    private static int[] soloElDispariV2(int[] a, int l, int r, int[] b){
        if (l+1 == r){
            if (a[l] % 2 != 0){
                int[] tmp = new int[b.length + 1];
                int i = 0;
                while (i < b.length){
                    tmp[i] = b[i];
                    i = i + 1;
                }
                tmp[b.length] = a[l];
                b = tmp;
            }
            return b;
        } else {
            int m = ((l+r)/2);
            b = soloElDispariV2(a, l, m, b);
            b = soloElDispariV2(a, m, r, b);
            return b;
        }
    }

/*=====================================================================================*/

    public static int[] elPosPariV1(int[] a){
        int[] b = null;
        if (a != null){
            b = new int[elPosPariV1(a, 0, a.length)];
            elPosPariV1(a, 0, a.length, b);
        }
        return b;
    }

    private static int elPosPariV1(int[] a, int l, int r){
        if (l+1 == r){
            if (l % 2 == 0){
                return 1;
            } else {
                return 0;
            }
        } else {
            int m = ((l+r) / 2);
            return (elPosPariV1(a, l, m) + elPosPariV1(a, m, r));
        }
    }

    private static int[] elPosPariV1(int[] a, int l, int r, int[] b){
        if (l+1 == r){
            if (l % 2 == 0){
                int i = 0;
                boolean controllo = true;
                while (controllo && i < b.length){
                    if (b[i] == 0){
                        b[i] = a[l];
                        controllo = !controllo;
                    }
                    i = i + 1;
                }
            }
            return b;
        } else {
            int m = ((l+r) / 2);
            b = elPosPariV1(a, l, m, b);
            b = elPosPariV1(a, m, r, b);
            return b;
        }
    }

    ///////////////////////////////////////////////////////////////////////

    public static int[] elPosPariV2(int[] a){
        if (a != null){
            int[] b = new int[]{};
            b = elPosPariV2(a, 0, a.length, b);
            return b;
        } else {
            return null;
        }
    }

    private static int[] elPosPariV2(int[] a, int l, int r, int[] b){
        if (l+1 == r){
            if (l % 2 == 0){
                int[] tmp = new int[b.length + 1];
                int i = 0;
                while (i < b.length){
                    tmp[i] = b[i];
                    i = i + 1;
                }
                tmp[b.length] = a[l];
                b = tmp;
            }
            return b;

        } else {
            int m = ((l+r) / 2);
            b = elPosPariV2(a, l, m, b);
            b = elPosPariV2(a, m, r, b);
            return b;
        }
    }

/*=====================================================================================*/
    public static int[] elPosDispValParV1(int[] a){
        int[] b = null;
        if (a != null){
            b = new int[elPosDispValParV1(a, 0, a.length)];
            elPosDispValParV1(a, 0, a.length, b);
        }
        return b;
    }
    private static int elPosDispValParV1(int[] a, int l, int r){
        if (l+1 == r){
            if ((l % 2 != 0) && (a[l] % 2 == 0)){
                return 1;
            } else {
                return 0;
            }
        } else {
            int m = ((l+r)/2);
            return (elPosDispValParV1(a, l, m) + elPosDispValParV1(a, m, r));
        }
    }

    private static void elPosDispValParV1(int[] a, int l, int r, int[] b){
        if (l+1 == r){
            if ((l % 2 != 0) && (a[l] % 2 == 0)){
                int i = 0;
                boolean controllo = true;
                
                while (controllo && i < b.length){
                    if (b[i] == 0){
                        b[i] = a[l];
                        controllo = !controllo;
                    }
                    i = i+1;
                }
            }
        } else {
            int m = ((l+r) / 2);
            elPosDispValParV1(a, l, m, b);
            elPosDispValParV1(a, m, r, b);
        }
    }
    
    ///////////////////////////////////////////////////////////////////////
    
    public static int[] elPosDispValParV2(int[] a){
        int[] b = null;
        if (a != null){
            b = new int[]{};
            b = elPosDispValParV2(a, 0, a.length, b);
        }
        return b;
    }
    
    private static int[] elPosDispValParV2(int[] a, int l, int r, int[] b){
        if (l+1 == r){
            if ((l % 2 != 0) && (a[l] % 2 == 0)){
                int[] tmp = new int[b.length + 1];
                int i = 0;

                while (i < b.length){
                    tmp[i] = b[i];
                    i = i + 1;
                }
                tmp[b.length] = a[l];
                b = tmp;
            }
            return b;
        } else {
            int m = ((l+r)/2);
            b = elPosDispValParV2(a, l, m, b);
            b = elPosDispValParV2(a, m, r, b);
            return b;
        }
    }
}