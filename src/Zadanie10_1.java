import java.util.Scanner;

public class Zadanie10_1 {
    public static void main(String[] args) {
        int[] tab = new int[5];
        Scanner klaw = new Scanner(System.in);


        do {
            int i = 0;
            System.out.println("Podaj liczbe: ");
            tab[i] = klaw.nextInt();
            i++;
        } while(klaw.nextInt() != -99);

        int max = tab[0];
        for(int i = 0; i <= tab.length; i++){
            if(tab[i] > max){
                max = tab[i];
            }
        }
        int min = tab[0];
        for(int i = 0; i <= tab.length; i++){
            if(tab[i] < min){
                min = tab[i];
            }
        }
        System.out.println("Maksymalna wartość to: " + max);
        System.out.println("Minimalna wartość to: " + min);
    }
}
