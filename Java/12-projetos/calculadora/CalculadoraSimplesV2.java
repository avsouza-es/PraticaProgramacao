import java.util.*;

public class CalculadoraSimplesV2 {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      
      int resultado, num1, num2;
      
      System.out.println("### Calculadora simples ###");
      
      System.out.print("Digite o primeiro valor: ");
      num1 = scanner.nextInt();
      
      System.out.print("Digite o segundo valor: ");
      num2 = scanner.nextInt();
      
      System.out.println("Você deseja: ");
      System.out.println("1 - Somar");
      System.out.println("2 - Subtrair");
      System.out.println("3 - Multiplicar");
      System.out.println("4 - Dividir");
      int opcao = scanner.nextInt();
      
      if (opcao == 1) {
        resultado = num1 + num2;
        System.out.println(resultado);
      } else if (opcao == 2) {
        resultado = num1 - num2;
        System.out.println(resultado);
      } else if  (opcao == 3) {
        resultado = num1 * num2;
        System.out.println(resultado);
      } else if (opcao == 4) {
        resultado = num1 / num2;
        System.out.println(resultado);
      } else {
        System.out.println("Opção digitada incorreta. Programa encerrado.");
      }
  }
}