import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Zadanie15_1 {
    public static void main(String[] args) throws IOException {
        Scanner odczyt = new Scanner(new File("odczyt.txt"));
        PrintWriter zapis = new PrintWriter("wynik.txt");

        int linijki = (int) Files.lines(Paths.get("odczyt.txt")).count();
        String wynik = "";

        for (int i = 1; i <= linijki ; i++) {
            String text = odczyt.nextLine();
            String text2  = text.toUpperCase();
            zapis.println(text2);
        }
        zapis.close();
    }
}
