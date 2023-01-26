import java.util.Scanner;

public class Zadanie5_1 {
    public static void main(String[] args) {
        Scanner klaw = new Scanner(System.in);

        System.out.println("Podaj ciąg znaków: ");
        String ciag = klaw.nextLine();
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
