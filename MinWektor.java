package cwiczenia;

//znajdowanie elementu minimalnego w wektorze(tablicy jendowymiarowej)

public class MinWektor {

    public int minWektor(int[] tablica) {
        int min;
        min = tablica[0];

        for (int i = 1; i < tablica.length; i++) {
            if (tablica[i] < min) {
                min = tablica[i];
            }
        }

        return min;
    }
}
