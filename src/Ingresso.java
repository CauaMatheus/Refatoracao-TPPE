
public class Ingresso extends Cadastro {

	
	// Construtor //
	
	public Ingresso(String espectador, String entrada,String filme,String hora, int sala) {
		super(espectador, entrada);
		this.setNomeEspct(espectador);
		this.setTipoEntrada(entrada);
		this.setNomeFilme(filme);
		this.setHoraFilme(hora);
		this.setNumSala(sala);
		
	}
	
	// Atributos //
	
	private Espectador espectador[];
	private int numSala;
	private String nomeFilme;
	private String horaFilme;

		
	// Métodos //
	
	
	// Get Set
	public int getNumSala() {
		return numSala;
	}

	public void setNumSala(int sala) {
		this.numSala = sala;
	}

	public String getNomeFilme() {
		return nomeFilme;
	}

	public void setNomeFilme(String nomeFilme) {
		this.nomeFilme = nomeFilme;
	}
	

	public String getHoraFilme() {
		return horaFilme;
	}

	public void setHoraFilme(String horaFilme) {
		this.horaFilme = horaFilme;
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
