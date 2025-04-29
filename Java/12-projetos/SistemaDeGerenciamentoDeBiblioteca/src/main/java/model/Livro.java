public class Livro
{
	// CAMPOS E ATRIBUTOS
	private String titulo;
	private int anoPublicacao;
	private long isbn;
	private String genero;
	private String idioma;

	//CONSTRUTOR
	public Livro() {
	}

	// GETTERS e SETTERS
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAnoPublicacao() {
		return anoPublicacao;
	}
	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}
	
	public long getIsbn() {
		return isbn;
	}
	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}

	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getIdioma()  {
		return idioma;
	}
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

}