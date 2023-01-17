import java.util.Scanner;

public class Zadanie7 {
    public static void main(String[] args) {
        Scanner klaw = new Scanner(System.in);

        int wynik = 0;
        int liczba;

        for(int i = 0; i < 7; i++) {
            System.out.println("Podaj liczbę: ");
            liczba = klaw.nextInt();
            wynik += liczba;
        }
        System.out.println("Wynik to: " + wynik);
    }
}
