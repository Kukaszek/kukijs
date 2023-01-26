import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Zadanie23_1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner klaw = new Scanner(System.in);
        PrintWriter zapis = new PrintWriter("index.html");

        System.out.println("Podaj imie i nazwisko: ");
        String imie = klaw.nextLine();
        System.out.println("Podaj zdanie-opis: ");
        String zdanie = klaw.nextLine();

        zapis.println("<html>\n " +
                "<head>\n" +
                "</head>\n" +
                "<body>\n" +
                "<center>\n" +
                "<h1>" + imie +
                "</h1>\n" +
                "</center>\n" +
                "<hr />\n" + zdanie +
                "<hr />\n" +
                "</body>\n" +
                "</html>");
        zapis.close();
    }
}
