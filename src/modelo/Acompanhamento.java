package modelo;

public class Acompanhamento {

	// Atributos //
	private String nome;
	private double valor;
	private String tam;
	private String tipo;

	// Construtor

	public Acompanhamento(String name, double valor, String tam, String tipo) {
		this.setNome(name);
		this.setValor(valor);
		this.setQnt(tam);
		this.setTipo(tipo);

	}

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

	public String getQnt() {
		return tam;
	}

	public void setQnt(String tam) {
		this.tam = tam;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	// Métodos //

	public void cadAcomp() {
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

	public void exibir() {
		System.out.println();
		System.out.println("Nome: " + this.getNome());
		System.out.println("Valor: " + this.getValor());
		System.out.println("Tamanho: " + this.getQnt());
		System.out.println("Tipo: " + this.getTipo());

	}

}
