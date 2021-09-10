
public class Espectador {

	// Atributos //

	private String nome;
	private String nasc;
	private String cpf;
	private String acompanhamento ;
	
	// Método Constructor //
	


	public Espectador(String nome, String nasc, String cpf, String acompanhamento){
		this.setNome(nome);
		this.setNasc(nasc);
		this.setCpf(cpf);
		this.setAcompanhamento(acompanhamento);
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

	public String getAcompanhamento() {
		return acompanhamento;
	}
	
	public void setAcompanhamento(String acompanhamento) {
		this.acompanhamento = acompanhamento;
	}
	
	
	// Métodos //
	
	public void cadEsp(){
		// Função de cadastro
	}
	
	public void edEsp(){
		// Função de edição
	}
	
	public void dellEsp(){
		// Função de delete
	}
	
	public void buscEsp(){
		// Função de busca
	}
	
	
	public void exibir() {
		System.out.println();
		System.out.println("Nome: " + this.getNome());
		System.out.println("Nascimento: " + this.getNasc());
		System.out.println("Cpf: " + this.getCpf());
		System.out.println("Acompanhamento: " + this.getAcompanhamento());

	}
	
}
