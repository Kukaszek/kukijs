public class Zadanie21_1 {
    public static void main(String[] args) {
        int pktC = 0;
        int pktU = 0;

        for(int i = 0; i < 10; i++) {
            int randomNumC = (int)(Math.random() * 5);
            int randomNumU = (int)(Math.random() * 5);

            if (randomNumC > randomNumU) {
                pktC += 1;
            } else if (randomNumU > randomNumC) {
                pktU += 1;
            } else continue;
        }

        if(pktU > pktC)
            System.out.println("Wygrałeś!");
        else if(pktC > pktU)
            System.out.println("Przegrałeś!");
        else
            System.out.println("Remis!");

    }
}
