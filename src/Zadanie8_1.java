import java.util.Scanner;

public class Zadanie8_1 {
    public static void main(String[] args) {
        Scanner klaw = new Scanner(System.in);

        System.out.println("Podaj liczbe lat: ");
        int lata = klaw.nextInt();
        double suma = 0;
        int miesiace = 0;

        if(lata >= 1) {
            for(int i = 0; i < lata; i++) {
                for(int j = 1; j <= 12; j++){
                    System.out.println("Podaj liczbe cm opadow w " + j + " miesiacu: ");
                    double cmOpadow = klaw.nextDouble();

                    if(cmOpadow >= 0) {
                        suma += cmOpadow;
                        miesiace += j;
                        System.out.println(j + " - opady - " + cmOpadow/suma +"%");
                    } else {
                        System.out.println("Podałeś błędne dane!");
                    }
                }
            }
        } else {
            System.out.println("Podałeś błędne dane!");
        }

    }
}
