import java.util.Scanner;

public class Zadanie4_1 {
    public static void main(String[] args) {
        Scanner klaw = new Scanner(System.in);

        System.out.println("Podaj liczbe dni przepracowanych: ");
        int liczbaDni = klaw.nextInt();
        double wyplata = 0.01;
        double suma = 0;

        if(liczbaDni>=1){
            for(int i = 1; i <= liczbaDni; i++) {
                wyplata *= 2;
                suma += wyplata;
                System.out.println(i + " - " + wyplata);
            }
            System.out.println("Suma wypłat to - " + suma);
        } else {
            System.out.println("Nie przepracowano nawet jednego dnia!");
        }


    }
}
