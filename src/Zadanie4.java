import java.util.Scanner;

public class Zadanie4 {
    public static void main(String[] args) {
        Scanner klaw = new Scanner(System.in);

        System.out.println("Podaj swoje imie: ");
        String imie = klaw.nextLine();

        for(int i = 0; i < 10; i++){
            System.out.println(imie);
        }
    }
}
