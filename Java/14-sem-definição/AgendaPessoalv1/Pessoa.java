import java.util.Scanner;

public class Pessoa {
	// atributos
	private int id;
    private String nome;

public Pessoa() {

}

    // Construtores
    public Pessoa(int id, String nome) {
		this.id = id;
		this.nome = nome;
	}

    // getter id
	public int getId() {
		return id;
	}
	// setter id
	public void setId(int id) {
		this.id = id;
	}

	// getter nome
	public String getNome() {
		return nome;
	}
	// seter id
	public void setNome(String nome){
		this.nome = nome;
	}	
}