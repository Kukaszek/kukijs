import java.util.Scanner;
public class Zadanie6 {
    public static void main(String[] args) {
        Scanner klaw = new Scanner(System.in);

        System.out.println("Podaj liczbe poczatkowa: ");
        int liczbaP = klaw.nextInt();
        System.out.println("Podaj liczbe koncowa: ");
        int liczbaK = klaw.nextInt();

        for (int i = liczbaP; i <=liczbaK; i=i+5) {
            System.out.print(i + " ");
        }


    }
}