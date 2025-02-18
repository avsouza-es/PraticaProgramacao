import java.util.*;

public class WordNameNumber {
  
    public static void main(String[] args) {
      Scanner leitura = new Scanner(System.in);
      
      System.out.println("Digite um número de 0 a 9: ");
      int numero = leitura.nextInt();
      
      switch(numero) {
        case 1:
          numero = 0;
          System.out.println("zero");
          
        default:
          System.out.println("Número digitado não é válido (0 à 9)");
      }
      
  }
}