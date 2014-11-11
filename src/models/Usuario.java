package models;

import java.util.ArrayList;

public class Usuario {
	private ArrayList<Mensagem> mensagens;

	public Usuario() {
		super();
		this.mensagens = new ArrayList<Mensagem>();
	}

	public ArrayList<Mensagem> getMensagens() {
		return mensagens;
	}

	public void setMensagens(ArrayList<Mensagem> mensagens) {
		this.mensagens = mensagens;
	}

	@Override
	public String toString() {
		return "Usuario [mensagens=" + mensagens + "]";
	}
	

}
