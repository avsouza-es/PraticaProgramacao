public class Exemplo0503 {
	public static void main(String[] args) {
		String frase1 = "Sou muito";
		String frase2 = "feliz por que sei que";
		String frase3 = "que Deus me ama!";
		tela(frase1);
		tela(frase2);
		tela(frase3);
	}
	
	public static void tela(String S) {
		System.out.println(S);
		tempo(1);
	}
	
	public static void tempo(int Segundos) {
		try {
			Thread t;
			t = new Thread();
			t.start();
			t.sleep(Segundos * 1000);
		}
		catch (InterruptedException e) {
			
		}
	}

}
