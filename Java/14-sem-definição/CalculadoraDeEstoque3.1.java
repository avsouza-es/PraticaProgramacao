/* 	
	Author:Alexandre Vieira de Souza	
	Objetivo do Programa - Trabalhar conhecimento: Looping e mais Looping  (estrutura de 	repetição - for.

 
	for: Enquanto a expressão booleana for true, seu código continuará sendo executado.
	
	Sintaxe: for(inicialização; condição; atualização) {
	
	}
	
	Revisão: 0.3.1
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class CalculadoraDeEstoque {

	public static void main (String[] args) throws java.lang.Exception
	{
		double soma = 0;
		
		for (double i = 0; i < 35; i ++) {
			soma += 59.90;
		}

		System.out.println("O total em estoque é " + soma);

		if (soma < 150) {
			System.out.println("Seu estoque está muito baixo!");
		} else if (soma >= 2000) { 
			System.out.println("Seu estoque está muito alto");
		} else { 
			System.out.println("Seu estoque está bom!");
		}

	}

}