package modelo;

public class Ingresso extends Cadastro {

	// Atributos //
	private int id;
	private String tipoEntrada;
	private Espectador nomeEsp;

	public Ingresso(int i, String dadosIngressos, String dadosIngressos2, String dadosIngressos3, int j,
			String dadosIngressos4) {
		super();
	}

	// Construtor //

	public Ingresso(int numSala, String nomeFilme, String horaFilme, String tipoEntrada, int id,
			Espectador dadosIngressos) {
		this.setNumSala(numSala);
		this.setNomeFilme(nomeFilme);
		this.setHoraFilme(horaFilme);
		this.setTipoEntrada(tipoEntrada);
		this.setNomeEsp(dadosIngressos);
	}

	// Get Set

	@Override
	public int getNumSala() {
		return numSala;
	}

	@Override
	public void setNumSala(int numSala) {
		this.numSala = numSala;
	}

	@Override
	public String getNomeFilme() {
		return nomeFilme;
	}

	@Override
	public void setNomeFilme(String nomeFilme) {
		this.nomeFilme = nomeFilme;
	}

	@Override
	public String getHoraFilme() {
		return horaFilme;
	}

	@Override
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

	public void setNomeEsp(Espectador nome) {
		this.nomeEsp = nome;
	}
}
