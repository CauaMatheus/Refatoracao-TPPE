
public class Filme extends Cadastro {
	
	
	// Atributos //
	
	private int duracao;
	private String genero;
	private double valor;
	private int faixaEtaria;
	private String dimensao;
	private String audio;
	private int espCad;
	
	
	//M�todo construtor//
	
	public Filme(int numSala, String nomeFilme, String horaFilme, int duracao, String genero, double valor,int faixaEtaria) {
		super(numSala, nomeFilme, horaFilme);
		this.setNumSala(numSala);
		this.setHoraFilme(horaFilme);
		this.setNomeFilme(nomeFilme);
		this.setDuracao(duracao);
		this.setGenero(genero);
		this.setValor(valor);
		this.setFaixaEtaria(faixaEtaria);
	}
	
	public Filme(int numSala, String nomeFilme, String horaFilme, int duracao, String genero, double valor,int faixaEtaria, String d, String audio, int espCad) {
		super(numSala, nomeFilme, horaFilme);
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
	
	

	// M�todos //
	
	public void cadFilme(){
		// Fun��o de cadastro filme
	}
	
	public void edFilme(){
		// Fun��o de edi��o
	}
	
	public void dellFilme(){
		// Fun��o de delete
	}
	
	public void buscFilme(){
		// Fun��o de busca
	}
	
	
	public void exibir() {
		System.out.println();
		System.out.println("Nome: " + this.getNomeFilme());
		System.out.println("Sala: " + this.getNumSala());
		System.out.println("Hora: "+ this.getHoraFilme());
		System.out.println("A�dio: " + this.getAudio());
		System.out.println("Dura��o: " + this.getDuracao());
		System.out.println("Dimens�o: " + this.getDimensao());
		System.out.println("Faixa Et�ria: " + this.getFaixaEtaria());
		System.out.println("G�nero: " + this.getGenero());
		System.out.println("Espectadores: " + this.getEspCad());
			
	}


}
