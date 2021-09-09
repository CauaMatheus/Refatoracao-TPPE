
public class Ingresso extends Cadastro {

	
	
	// Atributos //
	private String nomeEspct;
	private String tipoEntrada;
	private Espectador espectador[] = new Espectador[100];
	
	
	
	// Construtor //
	
	
	public Ingresso(int numSala, String nomeFilme, String horaFilme, String nomeEspct, String tipoEntrada) {
		super(numSala, nomeFilme, horaFilme);
		this.setNomeEspct(nomeEspct);
		this.setTipoEntrada(tipoEntrada);
	}
	
	// Get Set
	

	public String getNomeEspct() {
		return nomeEspct;
	}

	public void setNomeEspct(String nomeEspct) {
		this.nomeEspct = nomeEspct;
	}

	public String getTipoEntrada() {
		return tipoEntrada;
	}

	public void setTipoEntrada(String tipoEntrada) {
		this.tipoEntrada = tipoEntrada;
	}

	
	
	// Funções
	
	public void cadIng(){
		// Função cadastro
	}
	
	public void edIng(){
		// Função de edição
	}
	
	public void dellIng(){
		// Função de delete
	}
	
	public void buscIng(){
		// Função de busca
	}
	
	public void showEspct() {
		// Função de exibição
	}

}
