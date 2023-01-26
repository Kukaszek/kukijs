import java.util.Random;
import java.util.Scanner;

public class Zadanie17_1 {
    public static void main(String[] args) {
        Scanner klaw = new Scanner(System.in);
        int randomNum = (int)(Math.random() * 99);
        int odp;

        do {
            System.out.println("Odgadnij liczbe:");
            odp = klaw.nextInt();

            if (randomNum > odp) {
                System.out.println("liczba jest wieksza!");
            } else if (randomNum < odp) {
                System.out.println("Liczba jest mniejsza!");
            }
        }
        while (randomNum != odp);

        System.out.println("Zgadłeś! Szukana liczba to: " + randomNum);
    }
}
