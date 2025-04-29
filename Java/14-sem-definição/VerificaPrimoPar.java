import java.util.Scanner;

class VerificaPrimoPar 
{
	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);

		int n1, n2, escolhaNumeroUsuario;
		int numeroPar = 'P';
		int numeroImpar = 'I';
		char letra;

		System.out.print("Digite um número: ");
		n1 = leia.nextInt();
		System.out.print("Digite um número: ");
		n2 = leia.nextInt();
		
		if (n1 % 2 == 0 )
		{
			numeroPar = n1;
			numeroImpar = n2;
		} else {
			numeroPar = n2;
			numeroImpar = n1;
		}

		System.out.print("Escolha número PAR ou IMPAR (P/I): ");
		String escolhaUsuario = leia.next();
		letra = escolhaUsuario.charAt(0);

		if (letra == 'P') {
			escolhaNumeroUsuario = numeroPar;
		} else {
			escolhaNumeroUsuario = numeroImpar;
		}

		System.out.print("Usuário escolheu " + letra + " e número " + escolhaNumeroUsuario);
		System.out.println("\nVamos apresentar os numeros decrescente " + escolhaNumeroUsuario);

		// Parte 2

		int i;
		int verificador = 0;

		if (letra == 'P')  {
			for(i = 2; i <= escolhaNumeroUsuario; i-=2) {
				System.out.println("Imprimir decrescente: " + i);
				verificador = i;
				if (verificador == 0)
					System.exit(0); 
			}
		} else {
			for(i = 1; i <= escolhaNumeroUsuario; i-=2) {
				System.out.println("Imprimir decrescente: " + i);
				verificador = i;
				if (verificador == 0)
					System.exit(0); 
			}	
		}
	
	} // Fim class main
}