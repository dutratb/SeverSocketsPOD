package models;

public class Usuario {
	private String nome;

	public Usuario(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	@Override
	public String toString() {
		return String.format("%s", this.nome);
	}

}
