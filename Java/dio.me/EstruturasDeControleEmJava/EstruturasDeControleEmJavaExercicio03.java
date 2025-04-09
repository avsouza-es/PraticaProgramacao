/*
 Autor: Alexandre
 Data: 20250409
 Enunciado:  Escreva um código que o usuário entre com um primeiro número, 
			 um segundo número maior que o primeiro e escolhe entre a opção par e impar, 
			 com isso o código deve informar todos os números pares ou ímpares (de acordo com a seleção inicial) 
			 no intervalo de números informados, incluindo os números informados e em ordem decrescente;
            
*/
import java.util.Scanner;

class EstruturasDeControleEmJavaExercicio03 
{
	public static void main(String[] args)
	{
		Scanner leia = new Scanner(System.in);
		int par, impar, decrescente, contador;

		System.out.print("Digite um nuúmero par: ");
		par = leia.nextInt();
		System.out.print("Digite um número ímpar maior que o anterior:");
		impar = leia.nextInt();

		System.out.print("Você escolhe Par ou Impar (P/I): ");
		String escolha = leia.next();

		if ( escolha == "P") {
			decrescente = par;
			System.out.println("Contagem descrecente");
			for (contador = 1; contador <= par; contador--)	{
				System.out.println(par);
				decrescente = decrescente - 2;
			}
		} else {
			decrescente = impar;
			System.out.println("Contagem descrecente");
			for (contador = 1; contador = 0; contador++)	{
				System.out.println(decrescente);
				decrescente  = decrescente - 2;
			}
		}
	}		
}