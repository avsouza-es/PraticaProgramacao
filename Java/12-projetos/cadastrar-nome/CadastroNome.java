/*
 * Este programa permite cadastrar até 100 nomes através de um sistema de menu.
 * O usuário pode:
 * 1. Adicionar nomes enquanto houver espaço no array
 * 2. Sair do sistema
 * Utiliza um array estático para armazenamento e mantém o controle de registros com um contador
 */ 

import java.util.Scanner;

public class CadastroNome { 
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[100];
        int contador = 0; 
        
        while (true) {
            ExibirMenu.mostrarMenu();
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    if (contador < nomes.length) {
                        System.out.print("digite o nome a ser cadastrado: ");
                        String nome = scanner.nextLine();
                        nomes[contador] = nome;
                        contador++;
                        System.out.println("Nome cadastrado com sucesso!");
                    } else {
                        System.out.println("Limite de nomes atingido!");
                    }
                    break;
                case 2:
                    System.out.println("Saindo do sistema...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }    
}

// Classe auxiliar para exibir o menu
class ExibirMenu {
    public static void mostrarMenu() {
        System.out.println("===MENU===");
        System.out.println("1. Cadastrar Nome");
        System.out.println("2. Sair");
    }
}
