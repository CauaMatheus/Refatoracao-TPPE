
public class Acompanhamento {

	// Atributos //
	private String nome;
	private double valor;
	private int qnt;
	private String tipo;
	
	// Get Set
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public int getQnt() {
		return qnt;
	}
	public void setQnt(int qnt) {
		this.qnt = qnt;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	// Método construtor//
	public Acompanhamento(String nome, double valor, int qnt, String tipo) {
		this.nome = "Coca-cola";
		this.valor = 4,50;
		this.qnt = 8;
		this.tipo = "Bebida"			
	}
	// Métodos //
	public void cadAcomp(){
		// Fução cadastro de acompanhamento
	}
	public void edAcomp() {
		// Função edição de acompanhamento
	}
	public void delAcomp() {
		// Função de deleção de acompanhamento
	}
	public void bscAcomp() {
		// Função busca de acompanhamento
	}
	public void exibAcomp() {
		// Função exibição de acompanhamento 
	}
	
}
