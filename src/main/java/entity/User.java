package entity;

public class User {

	private String nome;
	private String senha;
	private int id;
	
	public User() {
		
	}
	
	public User(String nome, String senha, int id) {
		super();
		this.nome = nome;
		this.senha = senha;
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public long getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Login nome=" + nome;
	}
	
	
	
	
	
}
