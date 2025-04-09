// Demonstra o tamanho do tipo de dado

/* package whatever; // don't place package name! */
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class TiposDeDados {
	public static void main  (String[] args){
		// Declaração de tipos de variaveis e seus respectivos valores
	
		// Tipos de dados Real (Ponto Flutuante)
		float numero5  = 99.99f;
		double numero6 = 65.83;

		// imprimindo os valores dos dados do tipo Real
		System.out.println("Valor armazenado no tipo float  " +	numero5);
		System.out.println("Valor armazenado no tipo long   " +	numero6);

		// tipo caractere e inteiro
		char caractere  = 'A';
		int numero1	= 123;

		System.out.println("O valor armazenado em numero1 é " + numero1);
		System.out.println("A letra armazenado em caractere é " caractere);
	}
}
