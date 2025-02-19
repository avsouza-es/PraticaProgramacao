import java.util.ArrayList;
import java.util.Scanner;

public class MenuCadastro {
	// Método menu
	public static void exibirMenu() {
		// Lista para armazenar os nomes cadastrados
		ArrayList<String> nomes = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		int opcao;

		do {
			// exibe o menu
			System.out.println("\n ===== MENU =====");
			System.out.println("1 - Cadastrar nome");
			System.out.println("2 - Sair do programa");
			System.out.print("Escolha uma opção: ");
			opcao = scanner.nextInt();
			scanner.nextLine(); // limpa o buffer do teclado

			// Processa a opcao escolhida
			switch (opcao) {
				case 1:
					System.out.println("Digite o nome a ser cadastrado: ");
					String nome = scanner.nextLine();
					nomes.add(nome); // adiciona nome a lista
					System.out.println("Nome cadastrado com sucesso!");
					break;
				case 2:
					System.out.println("Saindo...");
					break;
				default:
					System.out.println("Opção inválida! Tente novamente.");
			}
		} while (opcao != 2);
		
		// Exibe os nomes cadastrados antes de sair
		System.out.println("\nNomes cadastrados:");
		for (String n : nomes) {
			System.out.println("- " + n);
		}

		scanner.close();
	}
	
	// método principal
	public static void main(String[] args) {
		exibirMenu();
	}
}