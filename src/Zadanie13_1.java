import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Zadanie13_1 {
    public static void main(String[] args) throws IOException {
        Scanner odczyt = new Scanner(new File("odczyt.txt"));
        String wynik = "";
        int linijki = (int) Files.lines(Paths.get("odczyt.txt")).count();
        if(linijki == 5) {
            for(int i = 0; i < 5; i++) {
                String text = odczyt.nextLine();
                wynik += text + "\n";
            }
        } else if (linijki < 5) {
            for(int i = 0; i < linijki; i++) {
                String text = odczyt.nextLine();
                wynik += text + "\n";
            }
        }

        System.out.println(wynik);
    }
}
