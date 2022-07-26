import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainEmail {
    public static void main(String[] args) {
        List<String > listOfEmails = new ArrayList<>();
       Scanner sc = new Scanner(System.in);
       readEmail(listOfEmails, sc);
      }

    private static void readEmail(List<String> listOfEmails, Scanner sc) {
        System.out.println("Enter email: ");
        String text = sc.next();
        if (text.matches(".*@gmail.com$")) {
            System.out.println(text + " has end as '@gmail.com'");
            listOfEmails.add(text);
        } else System.out.println(text + " has no end as '@gmail.com'");
        System.out.println("List of emails: " + listOfEmails);
        readEmail(listOfEmails,sc);
    }
}
