import java.util.Scanner;

/*
Faça um programa que leia conjunto de dois valores.
o pimeiro representando o nome do aluno e o segundo representando a sua idade.
(Pare o programa inserindo o valor 0 no campo nome.)
*/

public class Ex1_NomeEIdade {
	public static void main(String[] args)
	{
		Scanner leia = new Scanner(System.in);

		String nome;
		int idade;
		 
		while (true)	
		{
			System.out.print("Digite Aluno: ");
			nome = leia.next();
			if (nome.equals("0")) break;

			System.out.print("Digite idade do Aluno: ");
			idade = leia.nextInt();
		}
	}
}