package atividades;

import java.util.List;

import entity.User;

public class Servico {

	private Repositorio resp;
	
	public Servico() {
		resp= new Repositorio();
	}
	public boolean validar(User usuario) {
		
		List<User>usuarios=resp.carregarUsuarios();
		
		if(usuario.getNome().trim()==null||usuario.getSenha().trim()==null)
		return false;
		
		return usuarios.stream().anyMatch(u -> u.getNome().equals(usuario.getNome())
                && u.getSenha().equals(usuario.getSenha()));
				
	}
}
