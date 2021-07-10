package cwiczenia;

public class Cwiczenia {

    public long silniaI (long n){
        long wynik=1;
        for(int i=1;i<=n;i++){
            wynik = wynik*i;
        }
        return wynik;
    }

    public long silniaR(long n) {
        if (n < 0) {
            throw new IllegalArgumentException("nie liczm");
        }
        if (n < 2)
            return 1;
        else
            return n * silniaR(n - 1);
    }

    public int fibonacciI (int n){
        int elementA = 0;
        int elementB = 1;
        int wynik = 0;

        if (n<2) {
            return n;
        }

        for (int i =2; i<=n; i++){
            wynik = elementA + elementB;
            elementA = elementB;
            elementB = wynik;
        }
        return wynik;
    }
    public int fibonacciR(int n){
        if (n<2)
            return n;
        else
            return fibonacciR(n-1) + fibonacciR(n-2);
    }
}