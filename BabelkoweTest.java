package cwiczenia;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BabelkoweTest {

    @Test
    public void pustaTablica() {
        final int[] tablica = new int[] {};

        Babelkowe.sortuj(tablica);

        final int[] oczekiwanaTablica = new int[] {};
        Assertions.assertArrayEquals(tablica, oczekiwanaTablica);
    }

    @Test
    public void jedenElement() {
        final int [] tablica = new int[] {1};

        Babelkowe.sortuj(tablica);

        final int[] oczekiwanaTablica = new int[] {1};
        Assertions.assertArrayEquals(tablica, oczekiwanaTablica);
    }

    @Test
    public void wieleElementow() {
        final int [] tablica = new int[] {1, 7, 6, 3, 5, 1, -1, -100, 0};

        Babelkowe.sortuj(tablica);

        // posortuj wpisz jaka wlasciwie powinna byc ta tablica :)
        final int[] oczekiwanaTablica = new int[] {};
        Assertions.assertArrayEquals(tablica, oczekiwanaTablica);
    }
}
