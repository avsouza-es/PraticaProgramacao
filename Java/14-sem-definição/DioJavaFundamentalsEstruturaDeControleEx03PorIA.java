import java.util.Scanner;

class DioJavaFundamentalsEstruturaDeControleEx03PorIA {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int n1, n2;
        char escolhaUsuario;

        // Entrada dos números
        System.out.print("Digite o primeiro número: ");
        n1 = leia.nextInt();
        System.out.print("Digite o segundo número (maior que o primeiro): ");
        n2 = leia.nextInt();

        // Validação: garantir que n2 > n1
        if (n2 <= n1) {
            System.out.println("O segundo número deve ser maior que o primeiro!");
            return;
        }

        // Escolha entre par ou ímpar
        System.out.print("Escolha PAR ou ÍMPAR (P/I): ");
        String escolha = leia.next().toUpperCase();
        escolhaUsuario = escolha.charAt(0);

        // Validar a escolha do usuário
        if (escolhaUsuario != 'P' && escolhaUsuario != 'I') {
            System.out.println("Escolha inválida! Use 'P' para par ou 'I' para ímpar.");
            return;
        }

        // Imprimir números em ordem decrescente
        System.out.println("Números " + (escolhaUsuario == 'P' ? "pares" : "ímpares") + " no intervalo:");

        for (int i = n2; i >= n1; i--) {
            if ((escolhaUsuario == 'P' && i % 2 == 0) || (escolhaUsuario == 'I' && i % 2 != 0)) {
                System.out.println(i);
            }
        }
    }
}