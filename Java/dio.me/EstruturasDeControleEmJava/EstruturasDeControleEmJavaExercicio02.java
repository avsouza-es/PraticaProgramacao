/*
 Autor: Alexandre
 Data: 20250409
 Enunciado: Escreva um código onde o usuário entra com sua altura e peso, 
 			seja feito o calculo do seu IMC(IMC = peso/(altura * altura)) 
 			e seja exibida a mensagem de acordo com o resultado:
 			Se for menor ou igual a 18,5 "Abaixo do peso";
			Se for entre 18,6 e 24,9 "Peso ideal";
			Se for entre 25,0 e 29,9 "Levemente acima do peso";
			Se for entre 30,0 e 34,9 "Obesidade Grau I";
			Se for entre 35,0 e 39,9 "Obesidade Grau II (Severa)";
			Se for maior ou igual a 40,0 "Obesidade III (Mórbida)";
            
*/
import java.util.Scanner;

class EstruturasDeControleEmJavaExercicio02 
{
	public static void main(String[] args)
	{
		Scanner leia = new Scanner(System.in);
		
		double altura, peso;

		System.out.print("Digite sua altura:");
		altura  = leia.nextDouble();
		System.out.print("Digite seu peso: ");
		peso = leia.nextDouble();

		double IMC = peso / (altura * altura);

		System.out.println("IMC = " + IMC);
		if (peso <= 18.5) {
			System.out.println("Abaixo do Peso!");

		} else if (peso >= 18.6 || peso <= 24.9) {
			System.out.println("Peso ideal!");

		} else if (peso >= 25.0 || peso <= 29.9) {
			System.out.println("Levemente acima do Peso"); 
		} else if ( peso>= 30.0 || peso <= 34.9) {
			System.out.println("Obesidade Grau I");

		} else if (peso >= 35.0 || peso <= 39.9 ) {
			System.out.println("Obesidade Grau II (Severa");
			 
		} else {
			System.out.println("Obesidade III (Mórbida)");
		}
	}	
}