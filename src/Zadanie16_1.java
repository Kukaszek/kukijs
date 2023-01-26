import java.util.Scanner;

public class Zadanie16_1 {
    public static void main(String[] args) {
        Scanner klaw = new Scanner(System.in);

        System.out.println("Podaj miesieczny budżet: ");
        double budzet = klaw.nextDouble();
        double wydatek;
        double sumaWyd = 0;
        double roznica = 0;
        do {
            System.out.println("Podaj wydane pieniadze: ");
            wydatek = klaw.nextDouble();
            sumaWyd += wydatek;
            roznica = budzet-sumaWyd;
            System.out.println("Wydane pieniadze: " + sumaWyd);
        }
        while (wydatek != 0);

        System.out.println("Po miesiacu zostalo: " + roznica);
    }
}
