import java.util.*;

public class ConsonantOrVowelV2 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
        System.out.println("Input a character:");
        char ch = scanner.next().charAt(0);
        scanner.close();

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
            ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println("vowel");
        } else {
            System.out.println("consonant");
        }
    }
}