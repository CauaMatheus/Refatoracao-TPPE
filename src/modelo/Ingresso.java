package modelo;

public class Ingresso extends Cadastro {

	// Atributos //
	private int id;
	private String tipoEntrada;
	private Espectador nomeEsp;
	
	// Método construtor//
	public Ingresso() {
		super();
	}

	// Construtor //

	public Ingresso(int numSala, String nomeFilme, String horaFilme, String tipoEntrada, int id, Espectador nome) {
		this.setNumSala(numSala);
		this.setNomeFilme(nomeFilme);
		this.setHoraFilme(horaFilme);
		this.setTipoEntrada(tipoEntrada);
		this.setNomeEsp(nome);
	}

	// Get Set

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
/*
	public Espectador[] getEspectador() {
		return this.ingresso;
	}

	public void setArrayIngresso(Espectador[] i) {
		this.ingresso = i;
	}

	public String getNome(int p) {
		return ingresso[p].getNome();
	}

	public void setNome(Espectador espcCad, int p) {
		this.ingresso[p] = espcCad;
	}
*/
	public String getTipoEntrada() {
		return tipoEntrada;
	}

	public void setTipoEntrada(String tipoEntrada) {
		this.tipoEntrada = tipoEntrada;
	}
	
	public Espectador getNomeEsp() {
		return nomeEsp;
	}

	public void setNomeEsp(Espectador nomeEsp) {
		this.nomeEsp = nomeEsp;
	}
	
	

	// Funções

	public void cadIng() {
		// Função cadastro
	}

	public void edIng() {
		// Função de edição
	}

	public void dellIng() {
		// Função de delete
	}

	public void buscIng() {
		// Função de busca
	}

	public void showEspct() {

	}

	public void exibir() {
		System.out.println();
		System.out.println("Id: " + this.getId());
		System.out.println("Sala: " + this.getNumSala());
		System.out.println("Filme: " + this.getNomeFilme());
		System.out.println("Horário: " + this.getHoraFilme());
		System.out.println("Entrada: " + this.getTipoEntrada());

	}

}
