import java.util.*;

public class UsuarioDigitarNumero {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      
      int numero;
      do {
            System.out.print("Digite um número: ");
            numero = scanner.nextInt();
        } while (numero < 100);
    System.out.println("Você digitou um número maior que 100! Parabéns!!");
    scanner.close(); // boa pratica fechar o scanner após o seu uso
    }
}