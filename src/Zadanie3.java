import java.util.Scanner;
public class Zadanie3 {
    public static void main(String[] args) {
        Scanner klaw = new Scanner(System.in);
        boolean twierdz = true;
        String dane;

        while (twierdz) {

            System.out.println("Wpisz 'Tak' lub 'Nie'");
            dane = klaw.nextLine();

            if (dane.equalsIgnoreCase("Tak")||dane.equalsIgnoreCase("Nie")) {
                System.out.println("Podałeś poprawne dane wejściowe");
                break;
            } else {
                System.out.println("Podałeś błędne dane wejściowe");
            }

        }
    }
}

