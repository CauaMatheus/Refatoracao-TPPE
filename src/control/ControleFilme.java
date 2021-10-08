package control;
/**Faz a comunicação com a classe modelo para manipular dados do Filme
 * @version 1.0
 * @author Pablo C.
 * @since Out 2021
 */
import modelo.Filme;

public class ControleFilme {

	// Array para guardar filmes

	private Filme[] f;

	private int QntFilmes;

	public ControleFilme(ControleDados d) {
		f = d.getFilmes();
		QntFilmes = d.getQtdFilmes();
		
		/**Método para guardar os filmes
		 * @author Pablo C.
		 * @param d ControleDados - Chama a classe que possui os gets e sets do dado
		 */
	}

	// Array de String que irá aparecer no Jlist

	public String[] getNomeFilme() {
		String[] s = new String[QntFilmes];
		for (int i = 0; i < QntFilmes; i++) {
			s[i] = f[i].getNomeFilme();
		}

		return s;
		
		/**Cria um array de string com os nomes dos filmes para aparecer na jlist
		 * @author Pablo C.
		 */
	}

	// Função de pesquisa

	public String[] getPesquisaFilme(String pesFilme) {
		String[] s = new String[QntFilmes];
		for (int i = 0; i < QntFilmes; i++) {
			if ((f[i].getNomeFilme()).contains(pesFilme)) {
				s[i] = f[i].getNomeFilme();
			}
		}
		return s;
		
		/**Array de strings, pesquisa se no array de filme possui a string pesquisada
		 * @author Pablo C.
		 * @param pesFilme String - Nome do filme que será pesquisado 
		 * @return s - O filme pesquisado
		 */
	}

	public int getQtd() {
		return QntFilmes;
	}

	public void setQtd(int qtd) {
		this.QntFilmes = qtd;
	}

	public String getNome(int i) {
		return f[i].getNomeFilme();
	}

	public String getHora(int i) {
		return f[i].getHoraFilme();
	}

	public int getSala(int i) {
		return f[i].getNumSala();
	}

	public int getDuracao(int i) {
		return f[i].getDuracao();
	}

	public void setQtdFilme(int QntFilmes) {
		this.QntFilmes = QntFilmes;
	}

	public String gethoraFilme(int i) {
		return f[i].getHoraFilme();
	}

	public String getGenero(int i) {
		return f[i].getGenero();
	}

	public Double getValor(int i) {
		return f[i].getValor();
	}

	public int getFaixa(int i) {
		return f[i].getFaixaEtaria();
	}

	public String getDimensao(int i) {
		return f[i].getDimensao();
	}

	public String getAudio(int i) {
		return f[i].getAudio();
	}

	public int getEspCad(int i) {
		return f[i].getEspCad();
	}

}
