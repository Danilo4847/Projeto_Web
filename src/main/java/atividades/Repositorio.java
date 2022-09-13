package atividades;

import java.util.ArrayList;
import java.util.List;
import entity.User;


public class Repositorio {

	
	public Repositorio() {
		
	}
	
	  public List<User> carregarUsuarios() {
	        List<User> usuarios = new ArrayList<>();
	        usuarios.add(new User("Danilo","123456",1));
	  return usuarios;
	  }
}
