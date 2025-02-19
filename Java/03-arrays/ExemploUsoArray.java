public class ExemploUsoArray {
	public static void main(String[] args) {
		// Declara e inicializa o array de notas
		double[] notas = {7.5, 8.0, 6.5, 9.0, 7.0};
		
		// variavel para armazenar a soma das notas
		double soma = 0;

		// percorrer o array para somar as notas
		for (double nota : notas) {
			soma += nota;
		}
		
		// calcula média
		double media = soma / notas.length;

		// imprime a média
		System.out.println("A média das notas é: " + media);
	}
}
