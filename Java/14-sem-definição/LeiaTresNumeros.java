import java.util.Scanner;

public class LeiaTresNumeros {
	public static void main(String[] args)
	{
		Scanner leitura = new Scanner(System.in);
		
		int n1, n2, n3, maior;
		
		System.out.print("Digite um valor: ");
		n1 = leitura.nextInt();
		System.out.print("Digite um valor: ");
		n2 = leitura.nextInt();
		System.out.print("Digite um valor: ");
		n3 = leitura.nextInt();
	
		if ((n1 > n2) || (n1 > n3)) {
			maior = n1;
		} else if ((n2 > n1) || (n2 > n3)) {
			maior = n2;			
		} else {
			maior = n3;
		}
		
		System.out.println("O maior número digitado é: " + maior);
		System.out.println("Os números digitados foram: \tN1 = " + n1 + "\tN2 = " + n2 + "\tN3 = " + n3);
	}
}
