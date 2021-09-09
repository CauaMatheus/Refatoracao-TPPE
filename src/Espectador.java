
public class Espectador {

	// Atributos //

	private String nome;
	private String nasc;
	private int cpf;
	
	// M�todo Constructor //
	
	public Espectador(String nome, String nasc, int cpf){
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

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	// M�todos //
	
	void cadEsp(){
		// Fun��o de cadastro
	}
	
	void edEsp(){
		// Fun��o de edi��o
	}
	
	void dellEsp(){
		// Fun��o de delete
	}
	
	void buscEsp(){
		// Fun��o de busca
	}
}
