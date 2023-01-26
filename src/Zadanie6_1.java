import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class Zadanie6_1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner klaw = new Scanner(System.in);
        File plik = new File("odczyt.txt");
        Scanner odczyt = new Scanner(new File("odczyt.txt"));

        String ciag = odczyt.nextLine();
        System.out.println("Podaj znak wystepujacy w tym ciagu: ");
        char znak = klaw.next().charAt(0);
        int suma = 0;

        for(int i = 0; i < ciag.length(); i++){
            if(ciag.charAt(i) == znak) {
                suma += 1;
            } else {
                continue;
            }
        }
        System.out.println("Liczba wystapien znaku '" + znak + "' to: " + suma);
    }
}
