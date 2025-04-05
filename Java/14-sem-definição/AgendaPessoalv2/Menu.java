import java.util.Scanner;

class Menu 
{
    public void exibirMenu() 
    {
        Scanner leitura = new Scanner(System.in);
        // Exibe o menu de opções
        System.out.println("------------------------------------------");
        System.out.println("----                MENU              ----");
        System.out.println();
        System.out.println(" 1 - Cadastrar Nome de Cliente");
        System.out.println(" 2 - Relatorio de Clientes");
        System.out.println(" 3 - Encerrar Programa");
        System.out.println();
        System.out.print("Digite uma escolha: ");
        int escolha = leitura.nextInt();

        switch (escolha) 
        {
            case 1:
                System.out.println("Cadastrar Nome de Cliente");
                // Chama o método para cadastrar nome de cliente
                break;
            case 2:
                System.out.println("Relatorio de Clientes");
                // Chama o método para relatorio de clientes
                break;
            case 3:
                System.out.println("Encerrar Programa");
                // Chama o método para encerrar o programa
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
        }

        public void cadastrarCliente() 
        {
            // Lógica para cadastrar cliente
            Scanner scanner = new Scanner(System.in);
            Pessoa cliente = new Pessoa();

            System.out.println("Cadastrar número do Cliente");
            int id = scanner.nextInt();
            cliente.setId(id);

            System.out.println("Cadastrar nome do Cliente");
            String nome = scanner.next();
            cliente.setNome(nome);
            
            System.out.println("Cliente cadastrado com sucesso!");
        }
    }
}