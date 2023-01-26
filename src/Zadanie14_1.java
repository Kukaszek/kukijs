import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Zadanie14_1 {
    public static void main(String[] args) throws IOException {
        Scanner klaw = new Scanner(System.in);

        System.out.println("Podaj nazwę pliku: ");
        String plik = klaw.nextLine();
        Scanner odczyt = new Scanner(new File(plik));
        String wynik = "";
        int linijki = (int) Files.lines(Paths.get("odczyt.txt")).count();

        for (int i = 1; i <= linijki ; i++) {
            String text = odczyt.nextLine();
            System.out.println(i + ": " + text);
        }
    }
}
