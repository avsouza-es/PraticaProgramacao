/*
 Autor: Alexandre
 Data: 20250409
 Enunciado: Escreva um código onde o usuário entra com um número e seja gerada a tabuada de 1 até 10 desse número;
            
*/
import java.util.Scanner;

class EstruturasDeControleEmJavaExercicio01 
{
	public static void main(String[] args)
	{
		Scanner leia = new Scanner(System.in);
		int numero;

		System.out.print("Digite um número: ");
		numero = leia.nextInt();

		System.out.println("\tA tabuada de " + numero);
		for(int count = 1; count<11; count++)
		{
			System.out.println(numero + " X " + count + " = " + numero * count);
		}
	}	
}