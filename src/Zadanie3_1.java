import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Zadanie3_1 {
    public static void main(String[] args)throws FileNotFoundException {
        PrintWriter zapis = new PrintWriter("wynik.txt");
        Scanner klaw = new Scanner(System.in);


        System.out.println("Podaj prędkość pojazdu:");
        int predkosc = klaw.nextInt();
        System.out.println("Podaj liczbe godzin podróży: ");
        int godziny = klaw.nextInt();

        if (predkosc >= 0 && godziny > 1) {
            for (int i = 1; i <= godziny; i++) {
                int droga = predkosc * i;
                zapis.println(i + " " + droga);
                zapis.close();
            }
        } else {
            zapis.println("Błędne dane!");
            zapis.close();
        }
    }
}

