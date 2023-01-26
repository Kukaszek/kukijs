import java.util.Scanner;

public class Zadanie20_1 {
    public static void main(String[] args) {
        Scanner klaw = new Scanner(System.in);

        System.out.println("Podaj dlugosc boku kwadratu: ");
        int dlKwad = klaw.nextInt();

        if(dlKwad > 15){
            for(int i = 0; i < 15; i++) {
                for(int j = 0; j < 15; j++){
                    System.out.print("X");
                }
                System.out.println();
            }
        } else {
            for(int i = 0; i <dlKwad; i++) {
                for(int j = 0; j < dlKwad; j++){
                    System.out.print("X");
                }
                System.out.println();
            }
        }

    }
}
