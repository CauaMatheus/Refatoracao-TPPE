package control;
import modelo.Filme;
/**Faz a comunicação com a classe modelo para manipular dados do Filme
 * @version 1.0
 * @author Pablo C.
 * @since Out 2021
 */

public class ControleFilme {

	// Array para guardar filmes

	private Filme[] f;

	private int QntFilmes;

	/**Método para guardar os filmes
	 * @author Pablo C.
	 * @param d ControleDados - Chama a classe que possui os gets e sets do dado
	 */
	public ControleFilme(ControleDados d) {
		f = d.getFilmes();
		QntFilmes = d.getQtdFilmes();
		
	}

	// Array de String que irá aparecer no Jlist

	/**Cria um array de string com os nomes dos filmes para aparecer na jlist
	 * @author Pablo C.
	 * @return a
	 */
	public String[] getNomeFilme() {
		String[] s = new String[QntFilmes];
		for (int i = 0; i < QntFilmes; i++) {
			s[i] = f[i].getNomeFilme();
		}

		return s;
		
	}

	// Função de pesquisa

	/**Array de strings, pesquisa se no array de filme possui a string pesquisada
	 * @author Pablo C.
	 * @param pesFilme String - Nome do filme que será pesquisado 
	 * @return s - O filme pesquisado
	 */
	public String[] getPesquisaFilme(String pesFilme) {
		String[] s = new String[QntFilmes];
		for (int i = 0; i < QntFilmes; i++) {
			if ((f[i].getNomeFilme()).contains(pesFilme)) {
				s[i] = f[i].getNomeFilme();
			}
		}
		return s;
		
	}

	/**
	 * @return a
	 */
	public int getQtd() {
		return QntFilmes;
	}

	/**
	 * @param qtd a
	 */
	public void setQtd(int qtd) {
		this.QntFilmes = qtd;
	}

	/**
	 * @param i a
	 * @return a
	 */
	public String getNome(int i) {
		return f[i].getNomeFilme();
	}

	/**
	 * @param i a
	 * @return a
	 */
	public String getHora(int i) {
		return f[i].getHoraFilme();
	}

	/**
	 * @param i a
	 * @return a
	 */
	public int getSala(int i) {
		return f[i].getNumSala();
	}

	/**
	 * @param i a
	 * @return a
	 */
	public int getDuracao(int i) {
		return f[i].getDuracao();
	}

	/**
	 * @param QntFilmes a
	 */
	public void setQtdFilme(int QntFilmes) {
		this.QntFilmes = QntFilmes;
	}

	/**
	 * @param i a
	 * @return a
	 */
	public String gethoraFilme(int i) {
		return f[i].getHoraFilme();
	}

	/**
	 * @param i a
	 * @return a
	 */
	public String getGenero(int i) {
		return f[i].getGenero();
	}

	/**
	 * @param i a
	 * @return a
	 */
	public Double getValor(int i) {
		return f[i].getValor();
	}

	/**
	 * @param i a
	 * @return a
	 */
	public int getFaixa(int i) {
		return f[i].getFaixaEtaria();
	}

	/**
	 * @param i a
	 * @return a
	 */
	public String getDimensao(int i) {
		return f[i].getDimensao();
	}

	/**
	 * @param i a
	 * @return a
	 */
	public String getAudio(int i) {
		return f[i].getAudio();
	}

	/**
	 * @param i a
	 * @return a
	 */
	public int getEspCad(int i) {
		return f[i].getEspCad();
	}

}
