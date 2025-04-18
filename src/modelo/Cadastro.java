package modelo;
/**Classe abstrata que será pai de Filme e Ingresso
 * @version 2.0
 * @author Pablo C. e Pedro V.
 * @since Out 2021
 */
public abstract class Cadastro {

	// Atributos

	protected int numSala;
	public String nomeFilme;
	protected String horaFilme;

	// Construtor


	public Cadastro() {
		super();
	}

	// Get and Set

	/**
	 * @return a
	 */
	public int getNumSala() { return numSala;
	}

	/**
	 * @param numSala
	 */
	public void setNumSala(int numSala) {
		this.numSala = numSala;
	}

	/**
	 * @return
	 */
	public String getNomeFilme() {
		return nomeFilme;
	}

	/**
	 * @param nomeFilme
	 */
	public void setNomeFilme(String nomeFilme) {
		this.nomeFilme = nomeFilme;
	}

	/**
	 * @return
	 */
	public String getHoraFilme() {
		return horaFilme;
	}

	/**
	 * @param horaFilme
	 */
	public void setHoraFilme(String horaFilme) {
		this.horaFilme = horaFilme;
	}
}
