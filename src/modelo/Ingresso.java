package modelo;

public class Ingresso extends Cadastro {

	// Atributos //
	private int id;
	private String tipoEntrada;
	private Espectador nomeEsp;
	

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
	
	public int getNumSala() {
		return numSala;
	}

	public void setNumSala(int numSala) {
		this.numSala = numSala;
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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
}
