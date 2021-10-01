package modelo;

public class Acompanhamento {

	// Atributos //
	private String nome;
	private double valor;
	private int qnt;
	private String tipo;

	// Construtor

	public Acompanhamento(String name, double valor, int tam, String tipo) {
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


}
