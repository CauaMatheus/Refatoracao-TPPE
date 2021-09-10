
public class Espectador {

	// Atributos //

	private String nome;
	private String nasc;
	private String cpf;
	private Acompanhamento acompanhamento[] = new Acompanhamento[10] ;
	
	// Método Constructor //
	
	public Espectador(String nome, String nasc, String cpf){
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

	}
	
}
