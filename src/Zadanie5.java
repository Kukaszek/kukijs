import java.util.Scanner;
public class Zadanie5 {
    public static void main(String[] args) {
        Scanner klaw = new Scanner(System.in);

        System.out.println("Podaj liczbe poczatkowa: ");
        int liczbaP = klaw.nextInt();
        System.out.println("Podaj liczbe koncowa: ");
        int liczbaK = klaw.nextInt();

        if (liczbaP%2==1) {
            for (int i = liczbaP; i <=liczbaK; i=i+2) {
                System.out.print(i + " ");
            }
        } else {
            for (int i = liczbaP +1; i <=liczbaK; i=i+2) {
                System.out.print(i + " ");
            }
        }

    }
}
