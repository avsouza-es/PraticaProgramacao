import java.util.*;

public class InputNameOutputNameHelloV2 {
    public static void main(String[] args) {
      Scanner leia = new Scanner(System.in);
      
      System.out.println("Digite Seu nome: ");
      String nome = leia.nextLine();
      
      System.out.print("Hello " + nome);
  }
}