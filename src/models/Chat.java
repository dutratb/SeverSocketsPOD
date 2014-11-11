package models;

import java.util.ArrayList;

public class Chat {
	private ArrayList<Usuario> usuarios;
	
	

	public Chat() {
		super();
		this.usuarios = new ArrayList<Usuario>();
	}

	public ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(ArrayList<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	public void addUsuario(Usuario u){
		this.usuarios.add(u);
	}
	public void removeUsuario(Usuario u){
		this.usuarios.remove(u);
	}
	public void enviarMensagem(Mensagem m){
		for(Usuario u: this.usuarios){
			
			
		}
	}
	

}
