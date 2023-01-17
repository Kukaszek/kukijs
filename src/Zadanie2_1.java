import java.util.Scanner;

public class Zadanie2_1 {
    public static void main(String[] args) {
        Scanner klaw = new Scanner(System.in);


        System.out.println("Podaj prędkość pojazdu:");
        int predkosc = klaw.nextInt();
        System.out.println("Podaj liczbe godzin podróży: ");
        int godziny = klaw.nextInt();

        if (predkosc >= 0 && godziny > 1) {
            for (int i = 1; i <= godziny; i++) {
                int droga = predkosc * i;
                System.out.println(i + " " + droga);
            }
        } else {
            System.out.println("Błędne dane!");
        }
}
}

