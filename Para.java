package cwiczenia;

public class Para {
    public static boolean czyJestPara(final int [] tablica) {

        for (int i=0; i<tablica.length; i++){
            for(int j=i+1; j<tablica.length; j++){
                if(tablica[i]==tablica[j]){
                    return true;
                }
            }
        }
        return false;
    }
}
