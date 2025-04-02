import java.util.Scanner;

public class Menu {
    private static Pessoa pessoa = new Pessoa(); // Armazena dados de uma única pessoa

    public static void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        while(true) { // Loop para manter o menu ativo até o usuário optar por sair
            System.out.println("----- MENU -----"); 
            System.out.println("1 - Cadastrar Pessoa");
            System.out.println("2 - Relatório de Pessoas Cadastradas");
            System.out.println("3 - Sair do Programa");
    
            System.out.print("Digite a opção desejada: ");
            int escolha = scanner.nextInt();

            switch (escolha) {
            case 1:
                addPessoa();
                break;
            case 2:
                relPessoa();
                break;
            case 3:
                System.out.println("Você escolheu a opção 2. Encerrando o programa.");
                return;
            default:
                System.out.println("Opção inválida. Escolha novamente.");
                break;
            }
        }
    }

    public static void addPessoa() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cadastrar Pessoa");
        System.out.print("Informe o numero de identificação: ");
        pessoa.setId(scanner.nextInt());
        System.out.print("Informe o nome da pessoa: ");
        pessoa.setNome(scanner.next());
        System.out.println("Cadastro realizado com sucesso!");
        tempo(2);
    }

    public static void relPessoa() {
        System.out.println("Relatório de Pesoas Cadastradas");
        System.out.println(" _______________________________");
        System.out.println("| ID  |     NOME                |");
        
    }
    
    public static void tempo(int Segundos) { // Segundos recebe 2
        try {
            Thread t;
            t = new Thread();
            t.start();
            t.sleep(Segundos * 1500);
        }
        catch (InterruptedException e) {

        }
    }
}
