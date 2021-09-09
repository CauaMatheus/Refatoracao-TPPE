
public class Filme extends Cadastro {
	
	
	// Atributos //
	
	private int duracao;
	private String genero;
	private double valor;
	private int faixaEtaria;
	private String dimensao;
	private String audio;
	private int espCad;
	
	
	//Método construtor//
	
	public Filme(int numSala, String nomeFilme, String horaFilme, int duracao, String genero, double valor,int faixaEtaria, String dimensao, int numSala2, String audio, int espCad) {
		super(numSala, nomeFilme, horaFilme);
		this.setDuracao(duracao);
		this.setGenero(genero);
		this.setValor(valor);
		this.setFaixaEtaria(faixaEtaria);
		this.setDimensao(dimensao);
		this.setAudio(audio);
		this.setEspCad (espCad);
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
	
	// Status //
	
	public void status() {
		System.out.println(this.getAudio());
		System.out.println(this.getDuracao());
		System.out.println(this.getDimensao());
		System.out.println(this.getEspCad());
		System.out.println(this.getFaixaEtaria());
		System.out.println(this.getGenero());

		
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
