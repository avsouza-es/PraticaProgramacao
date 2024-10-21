import java.util.*;

public class SistemaLogin {
    public static void main(String[] args){
        String usernameStored = "admin";
        String passwordStored = "1234";
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o nome do usuario: ");
        String usernameInput = scanner.nextLine();
        
        System.out.print("Digite a senha do usuario: ");
        String passwordInput = scanner.nextLine();
        
        if (usernameStored.equals(usernameInput) && passwordStored.equals(passwordInput)) {
            System.out.print("Bem-vindo, " + usernameInput + "!");
        } else {
            System.out.println("Nome do usuario ou senha invalido.");
        }
        scanner.close();
    }
}