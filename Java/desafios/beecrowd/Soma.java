import java.io.IOException;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Soma {
 
    public static void main(String[] args) throws IOException {
 
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
         Scanner scanner = new Scanner(System.in);
         
         int a = scanner.nextInt();
         int b = scanner.nextInt();
         
         int soma = a + b;
         
         System.out.println("SOMA = " + soma);
 
    }
 
}