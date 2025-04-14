import java.util.Scanner;

class AulaEstruturaDeRepeticaoForImprimeDecrescente 
{
	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		

		System.out.print("digite um número par: ");
		int par = leia.nextInt();
		
		System.out.print("digite um número impar maior que o par: ");
		int impar = leia.nextInt();

		System.out.print("Escolha par ou impar (P/I): ");
		String escolha = leia.next();
		
		System.out.println("Sua escolha foi: " + escolha);

		if (escolha == "P") {
			for (var i = 2; i <= par; i+=2)
			{
				System.out.println(i);
			}
		} else {
			for (var i = 1; i <= impar; i+=2)
			{
				System.out.println(i);
			}
		}



	}
}