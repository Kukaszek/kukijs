import java.util.Scanner;

public class Zadanie22_1 {
    public static void main(String[] args) {
        Scanner klaw = new Scanner(System.in);
        String[] tab = new String[]{"Wiśnie", "Pomarańcze", "Śliwki", "Dzwonki", "Melony", "Bary"};
        double insert = 0;
        double sumaIns = 0;
        double wygrana = 0;
        double sumaWyg = 0;
        String odp;

        do{
            System.out.println("Podaj kwotę pieniędzy, którą chcesz wrzucić do maszyny:");
            insert = klaw.nextDouble();
            String czyszcz = klaw.nextLine();
            int rNum1 = (int)(Math.random() * 5);
            int rNum2 = (int)(Math.random() * 5);
            int rNum3 = (int)(Math.random() * 5);
            System.out.println(tab[rNum1]);
            System.out.println(tab[rNum2]);
            System.out.println(tab[rNum3]);

            if(rNum1 == rNum2 && rNum1 == rNum3){
                wygrana = insert * 3;
                System.out.println("Wygrałeś " + wygrana +"zł!");
            }
            else if(rNum1 == rNum2 || rNum1 == rNum3 || rNum2 == rNum3){
                wygrana = insert * 2;
                System.out.println("Wygrałeś " + wygrana +"zł!");
            }
            System.out.println("Chcesz zagrać ponownie?");
            odp = klaw.nextLine();
            sumaWyg += wygrana;
            sumaIns += insert;
        } while(odp.equals("tak"));

            System.out.println("Łączna wrzucona kwota: " + sumaIns + "zł");
            System.out.println("Łączna wygrana: " + sumaWyg + "zł");


    }
}
