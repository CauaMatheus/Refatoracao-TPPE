
public class Filme extends Cadastro {
	
	
	// Atributos //
	
	private int duracao;
	private String genero;
	private double valor;
	private int faixaEtaria;
	private String dimensao;
	private int numSala;
	private String audio;
	private int espCad;
	
	
	//Método construtor//
	
	public Filme(String espectador, String entrada) {
		super(espectador, entrada);
		// TODO Auto-generated constructor stub
	}

	public Filme(int duracao, String genero, double valor, int faixaEtaria, String dimensao, int numSala, String audio, int espCad) {
		super(duracao, genero, valor, faixaEtaria, dimensao, audio, espCad);

		this.setDuracao(duracao);
		this.setGenero(genero);
		this.setValor(valor);
		this.setFaixaEtaria(faixaEtaria);
		this.setDimensao(dimensao);
		this.setNumSala(numSala);
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
	public int getNumSala() {
		return numSala;
	}
	public void setNumSala(int numSala) {
		this.numSala = numSala;
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
	
	

	// Métodos //
	
	public void cadFilme(){
		// Função de cadastro filme
	}
	
	public void edFilme(){
		// Função de edição
	}
	
	public void dellFilme(){
		// Função de delete
	}
	
	public void buscFilme(){
		// Função de busca
	}

}
