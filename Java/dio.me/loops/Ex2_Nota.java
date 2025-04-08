/*
Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido e continue pedindo até 
que usuário informe um valor válido.
*/

import java.util.Scanner;

public class Ex2_Nota 
{
	public static void main(String[] args)
	{
		int nota;
		Scanner leia = new Scanner(System.in);

		boolean condicao = true;
		
		while(condicao)
		{
			System.out.print("Digite nota1: ");
			nota = leia.nextInt();
			if (nota > 0 && nota <= 10 )
			{
				condicao = false;
			} else {
				condicao = true;
				System.out.println("Digite uma nota válida!");
			}
		}	
		 
	}
}