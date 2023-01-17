import java.util.Scanner;
public class Zadanie2 {
    public static void main(String[] args) {
        Scanner klaw = new Scanner(System.in);
        boolean twierdz = true;
        String dane;

        while (twierdz) {

            System.out.println("Wpisz 'T', 't', 'N' lub 'n'");
            dane = klaw.nextLine();

            if (dane.equalsIgnoreCase("T")||dane.equalsIgnoreCase("N")) {
                System.out.println("Podałeś poprawne dane wejściowe");
                break;
            } else {
                System.out.println("Podałeś błędne dane wejściowe");
            }

        }
    }
}
