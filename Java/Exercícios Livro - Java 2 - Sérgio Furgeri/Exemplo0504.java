public class Exemplo0504 {
	public static void main(String args[]) {
		if (args.length == 2)
			System.out.println("Resultado = " + soma(args[0], args[1]));
		else
			System.out.println("Entre com dois valores inteiros!");
	}
	
	// método
	public static int soma(String Num1, String Num2) {
		int x=0, y=0;
		try {
			x = Integer.parseInt(Num1);
			y = Integer.parseInt(Num2);
		}
		
		catch(NumberFormatException e) {
			System.out.println("Digite apenas caracteres numericos");
			System.exit(0); //caso houver erro encerra o programa
		}
	return(x+y);	// retorna a soma dos argumentos passados	
	}

}
