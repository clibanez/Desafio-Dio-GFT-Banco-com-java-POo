package entitis;

public class Cliente {
	
	
	private String nome;
	private String cpf;
	private String pais;
	
	
	public Cliente(String nome, String cpf,String pais) {
		super();
	
		this.nome = nome;
		this.cpf = cpf;
		this.pais = pais;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}
	
	
	
	

}
