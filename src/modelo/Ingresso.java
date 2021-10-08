package modelo;
/**Classe de construção do Objto Ingresso
 * @version 2.0
 * @author Pablo C.
 * @since Out 2021
 */
public class Ingresso extends Cadastro {

	// Atributos //
	private int id;
	private String tipoEntrada;
	private Espectador nomeEsp;

	public Ingresso() {
		super();
	}

	// Construtor //

	public Ingresso(int numSala, String nomeFilme, String horaFilme, String tipoEntrada, int id, Espectador nome) {
		this.setNumSala(numSala);
		this.setNomeFilme(nomeFilme);
		this.setHoraFilme(horaFilme);
		this.setTipoEntrada(tipoEntrada);
		this.setNomeEsp(nome);
		
		/**Método construct de Filme
		 * @author Pablo C.
		 * @param numSala int - Número da sala do Cinema
		 * @param nomeFilme String - Nome do filme que será exibido
		 * @param horaFilme String - Horarío que o Filme será exibido
		 * @param tipoEntrada String- Se o tipo de entrada é meia ou inteira
		 * @param id int - ID do ingresso
		 * @param nome Espectador- Nome do especatador
		 */
	}

	// Get Set

	@Override
	public int getNumSala() {
		return numSala;
	}

	@Override
	public void setNumSala(int numSala) {
		this.numSala = numSala;
	}

	@Override
	public String getNomeFilme() {
		return nomeFilme;
	}

	@Override
	public void setNomeFilme(String nomeFilme) {
		this.nomeFilme = nomeFilme;
	}

	@Override
	public String getHoraFilme() {
		return horaFilme;
	}

	@Override
	public void setHoraFilme(String horaFilme) {
		this.horaFilme = horaFilme;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTipoEntrada() {
		return tipoEntrada;
	}

	public void setTipoEntrada(String tipoEntrada) {
		this.tipoEntrada = tipoEntrada;
	}

	public Espectador getNomeEsp() {
		return nomeEsp;
	}

	public void setNomeEsp(Espectador nomeEsp) {
		this.nomeEsp = nomeEsp;
	}
}
