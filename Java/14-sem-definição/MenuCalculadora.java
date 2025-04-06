import java.util.Scanner;

class MenuCalculadora 
{
	public void exibirMenu()
	{
		Scanner lerOpcao = new Scanner(System.in);
		while (true)	
		{
			
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
			int a, b;
			switch (escolha) {
				case 1:
					System.out.println("Calculadora Soma");
					System.out.print("Digite o primeiro valor: ");
					a = lerOpcao.nextInt();
					System.out.print("Digite o segundo valor: ");
					b = lerOpcao.nextInt();
					System.out.println();
					System.out.println("Resultado da soma é: " + somar(a, b) + ".");
					break;
				case 2:
					System.out.println("Calculadora Subtrair");
					System.out.print("Digite o primeiro valor: ");
					a = lerOpcao.nextInt();
					System.out.print("Digite o segundo valor: ");
					b = lerOpcao.nextInt();
					System.out.println();
					System.out.println("Resultado da subtração é: " + subtrair(a, b) + ".");
					break;				
				case 3:
					System.out.println("Calculadora Multiplicar");
					System.out.print("Digite o primeiro valor: ");
					a = lerOpcao.nextInt();
					System.out.print("Digite o segundo valor: ");
					b = lerOpcao.nextInt();
					System.out.println();
					System.out.println("Resultado da multiplicação é: " + multiplicar(a, b) + ".");
					break;
				case 4:
					System.out.println("Calculadora Soma");
					System.out.print("Digite o primeiro valor: ");
					a = lerOpcao.nextInt();
					System.out.print("Digite o segundo valor: ");
					b = lerOpcao.nextInt();
					System.out.println();
					System.out.println("Resultado da divisãoa é: " + dividir(a, b) + ".");
					break;
				case 5:
					System.out.println("Encerrando o Programa Calculadora");
					lerOpcao.close();
					return;
				default:
					System.out.println("Opção não é valida. Digite uma opção válida");
					break;		
			}
		} 	
	} // end exibirMenu

	// methods
	public int somar(int a, int b) {
		int soma = a+b;
		return soma;
	}

	public int subtrair(int a, int b) {
		int subtrair = a - b;
		return subtrair;
	}

	public int multiplicar(int a, int b){
		int multiplicar = a * b;
		return multiplicar;
	}

	public int dividir(int a, int b) {
		int dividir = a / b;
		return dividir;
	}  
}