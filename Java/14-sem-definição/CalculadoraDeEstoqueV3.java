/* 	
	Author:Alexandre Vieira de Souza	
	Objetivo do Programa - Trabalhar conhecimento: Looping e mais Looping  (estrutura de 	repetição - while.

 
	While: Enquanto a expressão booleana for true, seu código continuará sendo executado.

	Revisão: 0.3
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class CalculadoraDeEstoque {

	public static void main (String[] args) throws java.lang.Exception
	{
		// declaração de variaveis e inicialização
		double soma = 0;
		int contador = 0;

		// criação de um contador
		while (contador < 35) 
		{
			double valorDoLivro = 59.90;
			soma = soma + valorDoLivro;
			contador = contador + 1;
		}
		
		System.out.println("O total em estoque é "+ soma);
		
		if (soma < 150) {
			System.out.println("Seu estoque está muito baixo!");
		} else if (soma >= 2000) {
			System.out.println("Seu estoque está muito baixo!");
		} else {
			System.out.println("Seu estoque está bom!");
		}
	}
}