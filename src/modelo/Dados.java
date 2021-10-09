package modelo;

/**
 * Cria arrays que serão necessários para capturar os dados
 * 
 * @version 1.0
 * @author Pablo C, Pedro V.
 * @since Out 2021
 */
public class Dados {

	private Filme[] filmes = new Filme[100];
	private int qtdFilmes = 0;

	private Ingresso[] ingressos = new Ingresso[100];
	private int qtdIngressos = 0;

	private Espectador[] espectadores = new Espectador[100];
	private int qtdEspectadores = 0;

	private Acompanhamento[] acompanhamentos = new Acompanhamento[10];
	private int qtdAcompanhamentos = 0;

	/**
	 * Método que insere alguns dados em um array específico
	 * 
	 * @author Pablo C, Pedro V.
	 */
	public void fillWithSomeData() {

		for (int i = 0; i < 3; i++) {

			filmes[i] = new Filme(i + 5, "Advengers-" + i, "16:00", 120, "Ação", 25.50, 14, "2d", "dublado", 50);

			ingressos[i] = new Ingresso("Espectador-" + i, "Advengers", "16:00", "Inteira", i + 2, i);

			espectadores[i] = new Espectador("Espectador-" + i, "31/07/9" + i, "75266597062");

			acompanhamentos[i] = new Acompanhamento("Pipoca" + i, i, i * 2, "Salgado");


		}

		qtdFilmes = 3;
		qtdIngressos = 3;
		qtdEspectadores = 3;
		qtdAcompanhamentos = 3;
	}

	public Filme[] getFilmes() {
		return filmes;
	}

	public void setFilmes(Filme[] filmes) {
		this.filmes = filmes;
	}

	/**
	 * Método que aumenta a quantidade de filmes no array
	 * 
	 * @author Pablo c, Pedro V.
	 * @param f   Filme - Array de Filmes
	 * @param pos int - Posição no array
	 */
	public void inserirEditarFilme(Filme f, int pos) {
		this.filmes[pos] = f;
		if (pos == qtdFilmes)
			qtdFilmes++;

	}

	public int getQtdFilmes() {
		return qtdFilmes;
	}

	public void setQtdFilmes(int qtdFilmes) {
		this.qtdFilmes = qtdFilmes;
	}

	public Ingresso[] getIngressos() {
		return ingressos;
	}

	public void setIngressos(Ingresso[] ingressos) {
		this.ingressos = ingressos;
	}

	/**
	 * Método que aumenta a quantidade de ingresso no array
	 * 
	 * @author Pablo c, Pedro V.
	 * @param i   Ingresso - Array de Ingressos
	 * @param pos int - Posição no array
	 */
	public void inserirEditarIngresso(Ingresso i, int pos) {
		this.ingressos[pos] = i;
		if (pos == qtdIngressos)
			qtdIngressos++;

	}

	/**
	 * @return
	 */
	public int getQtdIngressos() {
		return qtdIngressos;
	}

	/**
	 * @param qtdIngressos
	 */
	public void setQtdIngressos(int qtdIngressos) {
		this.qtdIngressos = qtdIngressos;
	}

	/**
	 * @return
	 */
	public Espectador[] getEspectadores() {
		return espectadores;
	}

	/**
	 * @param espectadores
	 */
	public void setEspectadores(Espectador[] espectadores) {
		this.espectadores = espectadores;
	}

	/**
	 * Método que aumenta a quantidade de espectador no array
	 * 
	 * @author Pablo c, Pedro V.
	 * @param e   Espectador - Array de espectadores
	 * @param pos int - Posição no array
	 */
	public void inserirEditarEspectador(Espectador e, int pos) {
		this.espectadores[pos] = e;
		if (pos == qtdEspectadores)
			qtdEspectadores++;

	}

	/**
	 * @return
	 */
	public int getQtdEspectadores() {
		return qtdEspectadores;
	}

	/**
	 * @param qtdEspectadores
	 */
	public void setQtdEspectadores(int qtdEspectadores) {
		this.qtdEspectadores = qtdEspectadores;
	}

	/**
	 * @return
	 */
	public Acompanhamento[] getAcompanhamentos() {
		return acompanhamentos;
	}

	/**
	 * @param acompanhamentos
	 */
	public void setAcompanhamentos(Acompanhamento[] acompanhamentos) {
		this.acompanhamentos = acompanhamentos;
	}

	/**
	 * Método que aumenta a quantidade de acompanhamentos no array
	 * 
	 * @author Pablo c, Pedro V.
	 * @param a   Acompanhamento - Array de acompanhamentos
	 * @param pos int - Posição no array
	 */
	public void inserirEditarAcompanhamento(Acompanhamento a, int pos) {
		this.acompanhamentos[pos] = a;
		if (pos == qtdAcompanhamentos)
			qtdAcompanhamentos++;

	}

	/**
	 * @return
	 */
	public int getQtdAcompanhamentos() {
		return qtdAcompanhamentos;
	}

	/**
	 * @param qtdAcompanhamentos
	 */
	public void setQtdAcompanhamentos(int qtdAcompanhamentos) {
		this.qtdAcompanhamentos = qtdAcompanhamentos;
	}

}
