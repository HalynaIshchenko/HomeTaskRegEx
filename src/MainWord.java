import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainWord {
    public static void main(String[] args) {
        List<String > listOfWords = new ArrayList<>();
       Scanner sc = new Scanner(System.in);
       readText(listOfWords, sc);
    }

    private static void readText(List<String> listOfWords, Scanner sc) {
        System.out.println("Enter word: ");
        String text = sc.next();
        if (text.matches("^a.*")) {
            System.out.println(text + "has 'a' as first letter");
            listOfWords.add(text);
        } else System.out.println(text + "has no 'a' as first letter");
        System.out.println("List of words: " + listOfWords);
        readText(listOfWords,sc);
    }
}
