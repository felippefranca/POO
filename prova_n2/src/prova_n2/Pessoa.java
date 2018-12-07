package prova_n2;

public class Pessoa {
	int id;
	String nome;
	String fone;
	String email;
	
	//Gets and sets
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone = fone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	//Construtores
	public Pessoa(int id, String nome, String fone, String email) {
		super();
		this.id = id;
		this.nome = nome;
		this.fone = fone;
		this.email = email;
	}
	
	public Pessoa() {
		super();
	}
	@Override
	public String toString() {
		return " [id=" + id + ", nome=" + nome + ", fone=" + fone + ", email=" + email + "]";
	}

	
	
}
