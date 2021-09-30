package modelo;

public class Filme extends Cadastro {

	// Atributos //

	private int duracao;
	private String genero;
	private double valor;
	private int faixaEtaria;
	private String dimensao;
	private String audio;
	private int espCad;
	private Ingresso[] entrada = new Ingresso[100];

	// Método construtor//
	public Filme() {
		super();
	}

	public Filme(int numSala, String nomeFilme, String horaFilme, int duracao, String genero, double valor,
			int faixaEtaria) {
		this.setNumSala(numSala);
		this.setHoraFilme(horaFilme);
		this.setNomeFilme(nomeFilme);
		this.setDuracao(duracao);
		this.setGenero(genero);
		this.setValor(valor);
		this.setFaixaEtaria(faixaEtaria);
	}

	public Filme(int numSala, String nomeFilme, String horaFilme, int duracao, String genero, double valor,
			int faixaEtaria, String d, String audio, int espCad) {
		this.setNumSala(numSala);
		this.setHoraFilme(horaFilme);
		this.setNomeFilme(nomeFilme);
		this.setDuracao(duracao);
		this.setGenero(genero);
		this.setValor(valor);
		this.setFaixaEtaria(faixaEtaria);
		this.setDimensao(d);
		this.setAudio(audio);
		this.setEspCad(espCad);
	}

	// Get Set

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getFaixaEtaria() {
		return faixaEtaria;
	}

	public void setFaixaEtaria(int faixaEtaria) {
		this.faixaEtaria = faixaEtaria;
	}

	public String getDimensao() {
		return dimensao;
	}

	public void setDimensao(String dimensao) {
		this.dimensao = dimensao;
	}

	public String getAudio() {
		return audio;
	}

	public void setAudio(String audio) {
		this.audio = audio;
	}

	public int getEspCad() {
		return espCad;
	}

	public void setEspCad(int espCad) {
		this.espCad = espCad;
	}

	public Ingresso[] getIngresso() {
		return this.entrada;
	}

	public void setArrayIngresso(Ingresso[] i) {
		this.entrada = i;
	}

	public int getId(int p) {
		return entrada[p].getId();
	}

	public void setNome(Ingresso espcCad, int p) {
		this.entrada[p] = espcCad;
	}

}
