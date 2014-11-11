package models;

public class Mensagem {
	private String texto;

	public Mensagem(String texto) {
		super();
		this.texto = texto;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	@Override
	public String toString() {
		return "Mensagem [texto=" + texto + "]";
	}
	
	

}
