package cwiczenia;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParaTest {
    @Test
    public void pustaTablica() {
        final int[] tablica = new int[] {};

        boolean wynik = Para.czyJestPara(tablica);

        assertEquals(wynik, false);
    }

    @Test
    public void brakPary() {
        final int[] tablica = new int[] {1, 2, 3};

        boolean wynik = Para.czyJestPara(tablica);

        assertEquals(wynik, false);
    }

    @Test
    public void znalezionaPara() {
        final int[]tablica = new int[] {1,3,5,3,6};

        boolean wynik = Para.czyJestPara(tablica);

        assertEquals(wynik, true);
    }
}
