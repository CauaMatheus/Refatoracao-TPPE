package modelo;
/**Classe abstrata que sr� pai de Filme e Ingresso
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
		/**Construtor da classe abstract Cadastro
		 * @author Pedro V.
		 * @param numSala int - N�mero da sala do Cinema
		 * @param nomeFilme String - Nome do filme que ser� exibido
		 * @param horaFilme String - Horar�o que o Filme ser� exibido
		 */
	}

	// Get and Set

	public int getNumSala() {
		return numSala;
	}

	public void setNumSala(int numSala) {
		this.numSala = numSala;
	}

	public String getNomeFilme() {
		return nomeFilme;
	}

	public void setNomeFilme(String nomeFilme) {
		this.nomeFilme = nomeFilme;
	}

	public String getHoraFilme() {
		return horaFilme;
	}

	public void setHoraFilme(String horaFilme) {
		this.horaFilme = horaFilme;
	}
}
