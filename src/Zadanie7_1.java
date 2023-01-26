import java.util.Scanner;

public class Zadanie7_1 {
    public static void main(String[] args) {
        Scanner klaw = new Scanner(System.in);

        System.out.println("Liczbe pieter: ");
        int pietra = klaw.nextInt();
        int sumaPok = 0;
        int sumaZajPok = 0;
        int pokoje = 0;
        
        if(pietra > 1) {
            for(int i = 1; i <= pietra; i++) {
                System.out.println("Liczba pokoi na " + i + " pietrze: ");
                pokoje= klaw.nextInt();
                if(pokoje > 10) {
                    System.out.println("Liczba zajetych pokoi na  " + i + " pietrze");
                    int zajetePokoje = klaw.nextInt();
                    sumaPok += pokoje;
                    sumaZajPok += zajetePokoje;
                } else {
                    System.out.println("Podałeś błędne dane! Liczba pokoi musi być większa od 10!");
                }
            }
                int wolnePokoje = sumaPok-sumaZajPok;
                double oblezenie = (double)sumaZajPok/sumaPok;
                System.out.println("Łączna liczba pokoi to: " + sumaPok);
                System.out.println("Zajęte pokoje to: " + sumaZajPok);
                System.out.println("Puste pokoje to: " + wolnePokoje);
                System.out.println("Oblężenie hotelu: " + oblezenie);
        } else {
            System.out.println("Podałeś błędne dane! Hotel musi mieć conajmniej jedno piętro");
        }
        
        
    }
}
