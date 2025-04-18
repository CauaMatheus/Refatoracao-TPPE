package modelo;
/**Classe de construção do Objto Filme
 * @version 2.0
 * @author Pedro V.
 * @since Out 2021
 */

public class Espectador {

	// Atributos //

	private String nome;
	private String nasc;
	private String cpf;

	// Método Constructor //

	/**
	 * @param nome
	 */
	public Espectador(String nome) {
		this.setNome(nome);
	}

	/**Método construct de Espectador
	 * @author Pablo C.
	 * @param nome String - Nome do espectador
	 * @param nasc String - Data de nascimento do espectador
	 * @param cpf String - CPF do espectador
	 */
	public Espectador(String nome, String nasc, String cpf) {
		this.setNome(nome);
		this.setNasc(nasc);
		this.setCpf(cpf);
		
	}

	// Get Set

	/**
	 * @return
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return
	 */
	public String getNasc() {
		return nasc;
	}

	/**
	 * @param nasc
	 */
	public void setNasc(String nasc) {
		this.nasc = nasc;
	}

	/**
	 * @return
	 */
	public String getCpf() {
		return cpf;
	}

	/**
	 * @param cpf
	 */
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}
