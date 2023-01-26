import java.util.Scanner;

public class Zadanie11_1 {
    public static void main(String[] args) {
        Scanner klaw = new Scanner(System.in);

        System.out.println("Podaj poczatkowa liczbe w Celcjuszach: ");
        int pocz = klaw.nextInt();
        System.out.println("Podaj koncowa liczbe w Celcjuszach: ");
        int kon = klaw.nextInt();

        for(int i = pocz; i <=kon; i++) {
            double[] cel = new double[i];
            double F = (double)i*1.8 + 32;
            int[] far = new int[(int) F];
            System.out.println(i + "C - " + F + "F");
        }

    }
}
