
public class Ingresso extends Cadastro {

	
	
	// Atributos //
	private String nomeEspct;
	private String tipoEntrada;
	private Espectador espectador[] = new Espectador[100];
	
	
	
	// Construtor //
	
	
	public Ingresso(int numSala, String nomeFilme, String horaFilme, String nomeEspct, String tipoEntrada) {
		super(numSala, nomeFilme, horaFilme);
		this.setNumSala(numSala);
		this.setNomeFilme(nomeFilme);
		this.setHoraFilme(horaFilme);
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

	
	
	// Fun��es
	
	public void cadIng(){
		// Fun��o cadastro
	}
	
	public void edIng(){
		// Fun��o de edi��o
	}
	
	public void dellIng(){
		// Fun��o de delete
	}
	
	public void buscIng(){
		// Fun��o de busca
	}
	
	public void showEspct() {
		
	}
	public void exibir() {
		System.out.println();
		System.out.println("Sala: " + this.getNumSala());
		System.out.println("Filme: " + this.getNomeFilme());
		System.out.println("Hor�rio: " + this.getHoraFilme());
		System.out.println("Espectador: " + this.getNomeEspct());
		System.out.println("Entrada: " + this.getTipoEntrada());
		
	}

}
