import java.util.Scanner;

public class Zadanie9_1 {
    public static void main(String[] args) {
        Scanner klaw = new Scanner(System.in);

        System.out.println("Podaj początkową liczbę organizmów: ");
        int poczOrg = klaw.nextInt();

        if(poczOrg >= 2) {
            System.out.println("Podaj średni dzienny przyrost w procentach: ");
            int przyrost = klaw.nextInt();

            if(przyrost > 0) {
                System.out.println("Podaj liczbe dni: ");
                int dni = klaw.nextInt();

                if(dni > 0) {
                    int sumaOrg = poczOrg;
                    for(int i = 1; i <= dni; i++) {
                        sumaOrg = sumaOrg + sumaOrg * przyrost / 100;
                        System.out.println(i + " dzień - " + sumaOrg);
                    }
                } else {
                    System.out.println("Dni muszą być większe od 0!");
                }
            } else {
                System.out.println("Przyrost musi być dodatni!");
            }
        } else {
            System.out.println("Populacja musi wynosić conajmniej 2 osobniki!");
        }


    }
}
