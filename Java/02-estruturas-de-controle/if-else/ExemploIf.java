import java.util.Scanner;

public class ExemploIf {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entre com a nota: ");
        double nota = scanner.nextDouble();
        if (nota <= 100 && nota >= 0) {
            System.out.println("Nota = " + nota + " ( valor válido ).");
        } else {
            System.out.println("Nota = " + nota + " ( valor inválido).");
        }
    }
    
}
