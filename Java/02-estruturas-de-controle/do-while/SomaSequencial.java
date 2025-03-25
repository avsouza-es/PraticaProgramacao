import java.util.Scanner;

public class SomaSequencial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;
        int soma = 0;
        while (contador < 4) {
            System.out.print("Digie um número: ");
            int numero  = scanner.nextInt();

            soma = soma + numero;

            contador++;
        }
        System.out.println("A soma total dos numeros é: " +soma);
        scanner.close;
    }    
}
