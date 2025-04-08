/*
Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido e continue pedindo até 
que usuário informe um valor válido.
*/

import java.util.Scanner;

public class Ex2_NotaVProfessor 
{
	public static void main(String[] args)
	{
		int nota;
		Scanner leia = new Scanner(System.in);

		System.out.print("Digite uma nota: ");
		nota = leia.nextInt();
		
		while(nota < 0 || nota > 10 )
		{
			System.out.print("Digite uma nota válida! Digite novamente: ");
			nota = leia.nextInt();
		}	
		 
	}
}