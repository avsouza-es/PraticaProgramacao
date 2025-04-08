import java.util.Scanner;

public class LeiaTresNumerosV2 {
	public static void main(String[] args)
	{
		Scanner leitura = new Scanner(System.in);
		
		int count = 0;
		int numero;
		int maior = 0;
		do 
		{
			System.out.print("Digite um valor: ");
			numero = leitura.nextInt();
			
			if (numero > maior) 
				maior = numero;
			
			count = count + 1;
		} while (count < 3);
		
		System.out.println("O maior número é " + maior);
	}	
}
