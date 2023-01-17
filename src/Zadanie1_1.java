import java.util.Scanner;

public class Zadanie1_1 {
    public static void main(String[] args) {
        Scanner klaw = new Scanner(System.in);
        System.out.println("Podaj liczbę początkowa zakresu: ");
        int pocz = klaw.nextInt();
        System.out.println("Podaj liczbe koncowa zakresu: ");
        int koniec = klaw.nextInt();

        int wynik = 0;
        for(int i = pocz; i < koniec; i++){
            wynik += i;
        }
        System.out.println("Wynik to: "+ wynik);
    }
}
