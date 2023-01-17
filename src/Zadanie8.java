import java.util.Scanner;

public class Zadanie8 {
    public static void main(String[] args) {
        Scanner klaw = new Scanner(System.in);
        int product;

        do {
            System.out.println("Podaj liczbę: ");
            int liczba = klaw.nextInt();
            product = liczba * 10;
        } while(product < 100);
    }
}
