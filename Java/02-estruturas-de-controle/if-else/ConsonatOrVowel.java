import java.util.*;

public class ConsonatOrVowel {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      
      System.out.println("Entre com a letra: ");
      char letra = scanner.next().charAt(0);
      
      if ((letra == 'a') || (letra == 'e') && (letra == 'i') && (letra == 'o') && (letra == 'u')) {
        System.out.println("Vowel.");
      } else {
        System.out.println("Consonant.");
      }
      
      // Fechar scanner
      scanner.close();
  }
}