import java.util.Scanner;
import java.util.Random;

public class JogoAdivinhaca {
    
    public static void main(String[] args){
        Random random = new Random();
        int numeroSecreto = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        int palpite = 0;
        
        System.out.println("Adivinhe o numero entre 1 e 100:");
        while(palpite != numeroSecreto) {
            System.out.print("digite o seu palpite: ");
            palpite = scanner.nextInt();
            
            if (palpite < numeroSecreto){
                System.out.println("Muito baixo!");
            } else if (palpite > numeroSecreto) {
                System.out.println("Muito alto!");
            } else {
                System.out.println("Parabens! Voce adivinhou o numero.");
            }
        }
    scanner.close()    ;
    }
}