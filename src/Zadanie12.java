public class Zadanie12 {
    public static void main(String[] args) {
    double wynik = 0;
        for(int i =30, j = 1; i > 0; i--, j++){
            wynik = wynik + (double)i/j;

        }
        System.out.println("Wynik to: " + wynik);
    }
}
