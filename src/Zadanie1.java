import java.util.Scanner;
public class Zadanie1 {
    public static void main(String[] args) {
        Scanner klaw = new Scanner(System.in);
        boolean twierdz = true;
        int liczba;

        while (twierdz) {

            System.out.println("Podaj liczbę od 10-24");
            liczba = klaw.nextInt();

            if (liczba < 10 || liczba > 24) {
                twierdz = true;
            } else {
                twierdz = false;
            }

            System.out.println("Podałeś " + liczba);
        }
    }
}
