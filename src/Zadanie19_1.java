import java.util.Scanner;

public class Zadanie19_1 {
    public static void main(String[] args) {
        Scanner klaw = new Scanner(System.in);
        String[] kolory = new String[]{"Czerwony", "Zielony", "Niebieski", "Pomarańczowy", "Żółty"};
        String odp;
        int punkty = 0;

        for(int i = 0; i < 10; i++) {
            int randomNum = (int)(Math.random() * 5);
            System.out.println("Odgadnij kolor: ");
            odp = klaw.nextLine();
            if(kolory[randomNum].equals(odp)) {
                punkty += 1;
            } else continue;
        }

        System.out.println("Poprawnie wskazano " + punkty + " razy");


    }
}
