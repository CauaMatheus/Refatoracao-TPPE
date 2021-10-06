package modelo;

public class Espectador {

	// Atributos //

	private String nome;
	private String nasc;
	private String cpf;

	// Método Constructor //

	public Espectador(String nome) {
		this.setNome(nome);
	}

	public Espectador(String nome, String nasc, String cpf) {
		this.setNome(nome);
		this.setNasc(nasc);
		this.setCpf(cpf);
	}

	// Get Set

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNasc() {
		return nasc;
	}

	public void setNasc(String nasc) {
		this.nasc = nasc;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}
