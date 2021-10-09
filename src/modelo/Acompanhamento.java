package modelo;
/**Classe de construção do Objto Acompanhamento
 * @version 2.0
 * @author Pedro V.
 * @since Out 2021
 */

public class Acompanhamento {

	// Atributos //
	private String nome;
	private double valor;
	private int qnt;
	private String tipo;

	// Construtor

	/** Método construct de Acompanhamento
	 * @author Pedro V.
	 * @param name String - Nome do produto
	 * @param valor double - valor do produto
	 * @param tam - Quantidade de produtos
	 * @param tipo String - Tipo do produto(bebida, doce, salgado, entrre outros)
	 */
	public Acompanhamento(String name, double valor, int tam, String tipo) {
		this.setNome(name);
		this.setValor(valor);
		this.setQnt(tam);
		this.setTipo(tipo);
		
	}

	// Get Set
	/**
	 * @return a
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome a
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return a
	 */
	public double getValor() {
		return valor;
	}

	/**
	 * @param valor a
	 */
	public void setValor(double valor) {
		this.valor = valor;
	}

	/**
	 * @return a
	 */
	public int getQnt() {
		return qnt;
	}

	/**
	 * @param qnt a
	 */
	public void setQnt(int qnt) {
		this.qnt = qnt;
	}

	/**
	 * @return a
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * @param tipo a
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


}
