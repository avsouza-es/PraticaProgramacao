import java.util.Scanner;

class MenuCalculadora 
{
	public void exibirMenu()
	{
		while (true)	
		{
			Scanner lerOpcao = new Scanner(System.in);
			System.out.println("--------------------------------------------");
			System.out.println(" 		MENU             					");
			System.out.println();
			System.out.println(" 1 - Somar");
			System.out.println(" 2 - Subtrair");
			System.out.println(" 3 - Multiplicar");
			System.out.println(" 4 - Dividir");
			System.out.println(" 5 - Encerrar Calculadora");
			System.out.println();
			System.out.print("Digite opção: ");
			int escolha = lerOpcao.nextInt();

			switch (escolha) {
				case 1:
					System.out.println("Digite o primeiro valor:");
		//			int a = lerOpcao.nextInt();
		//			System.out.println("digite o segundo valor: ");
		//			int b = lerOpcao.nextInt();
		//			somar(a, b);
					break;
				case 2:
					System.out.println("Subtrair");
					break;
				case 3:
					System.out.println("multiplicar");
					break;
				case 4:
					System.out.println("dividir");
					break;
				case 5:
					System.out.println("Encerrando o Programa Calculadora");
					return;
				default:
					System.out.println("Opção não é valida. Digite uma opção válida");
					break;		
			}
		} 	
	} // end exibirMenu

	// methods
	// public void somar(int a, int b) {
	//	int soma = a+b;
	// }  
}