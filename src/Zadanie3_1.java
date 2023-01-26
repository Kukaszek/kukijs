import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Zadanie3_1 {
    public static void main(String[] args) {
        Scanner klaw = new Scanner(System.in);


        System.out.println("Podaj prędkość pojazdu:");
        int predkosc = klaw.nextInt();
        System.out.println("Podaj liczbe godzin podróży: ");
        int godziny = klaw.nextInt();

        File file = new File("wynik.txt");
        try {
            FileWriter writer = new FileWriter(file);

            if (predkosc >= 0 && godziny > 1) {
                for (int i = 1; i <= godziny; i++) {
                    int droga = predkosc * i;
                    writer.write(i + " " + droga);
                }
            } else {
                writer.write("Błędne dane!");
            }
        } catch (IOException e) {
            System.out.println("Wystąpił błąd podczas zapisu do pliku: " + e.getMessage());

        }


    }
}
