import java.util.Scanner;

public class Zadanie12_1 {
    public static void main(String[] args) {
        Scanner klaw = new Scanner(System.in);
        int[] wartosc = new int[5];
        int liczbaGwiazdek;
        for(int i = 1; i <=5; i++) {
            System.out.println("Podaj dzisiejszą wartość sprzedaży dla sklepu nr " + i);
            wartosc[i-1] = klaw.nextInt();
        }
        for(int i = 1; i <=5; i++) {
            System.out.print("Sklep nr " + i + ": ");
            liczbaGwiazdek = wartosc[i-1]/100;
            for(int j = 0; j < liczbaGwiazdek; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
