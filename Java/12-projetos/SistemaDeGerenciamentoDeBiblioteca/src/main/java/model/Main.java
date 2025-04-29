public class Main
{
	public static void main(String[] args) 
	{
		Livro livro = new Livro();
		livro.setTitulo("O Senhor dos Anéis");
		livro.setAnoPublicacao(1954);
		livro.setIsbn(9788535902726L);
		livro.setGenero("Fantasia");
		livro.setIdioma("Português");

		System.out.println("Título: " + livro.getTitulo());
		System.out.println("Ano de Publicação: " + livro.getAnoPublicacao());
		System.out.println("ISBN: " + livro.getIsbn());
		System.out.println("Gênero: " + livro.getGenero());
		System.out.println("Idioma: " + livro.getIdioma());


	}
}
