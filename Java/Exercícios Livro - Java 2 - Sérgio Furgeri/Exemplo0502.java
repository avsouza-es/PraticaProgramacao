class Exemplo0502 {
	public static void main (String[] args) {
		String frase1 = "Sou muito";
		String frase2 = "feliz por que sei";
		String frase3 = "que Deus me ama!";
		limpaTela();
		tela(frase1);
		tela(" ");
		tela(frase2);
		tela(" ");
		tela(frase3);
	}

	//declaração do método tela()
	public static void tela(String S) {
		System.out.println(S);
	}

	// declaração do metodo limpaTela()
	public static void limpaTela() {
	for (int i=1;i<=25;i++)
		System.out.println();
	}	
	

}