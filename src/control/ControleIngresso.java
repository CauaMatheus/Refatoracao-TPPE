package control;

import modelo.Ingresso;

/**Faz a comunicação com a classe modelo para manipular dados do Ingresso
 * @version 1.0
 * @author Pedro V.
 * @since Out 2021
 */
public class ControleIngresso {

	// Array para guardar ingresso

	private Ingresso[] in;
	private int QntIngressos;

	/**
	 * Método para guardar os ingressos
	 * 
	 * @author Pedro V.
	 * @param d ControleDados - Chama a classe que possui os gets e sets do dado
	 */
	public ControleIngresso(ControleDados d) {
		in = d.getIngressos();
		QntIngressos = d.getQntIngressos();

	}

	// Array de String que irá aparecer no Jlist

	/**
	 * Cria um array de string com os nomes dos filmes dentro do ingresso que irá
	 * para aparecer na jlist
	 * 
	 * @author Pedro V.
	 * @return s - Lista com os nomes dos filmes na mesma posição no array de
	 *         Ingresso
	 */
	public String[] getNomeIngresso() {
		String[] s = new String[QntIngressos];
		for (int i = 0; i < QntIngressos; i++) {
			s[i] = in[i].getNomeEsp();
		}

		return s;

	}

	// Função pesquisar

	/**
	 * Array de strings, pesquisa se no array de ingresso possui a string pesquisada
	 * exibindo o FILME no qual o espectadore está cadastrado
	 * 
	 * @author Pedro V.
	 * @return s - Lista com os nomes dos filmes na mesma posição no array de
	 *         Ingresso
	 * @param pesIn a
	 */
	public String[] getPesquisaEsp(String pesIn) {
		String[] s = new String[QntIngressos];
		for (int i = 0; i < QntIngressos; i++) {
			if ((String.valueOf(in[i].getNumSala()).equals(pesIn)) || ((in[i].getHoraFilme()).equals(pesIn))) {
				s[i] = in[i].getNomeEsp();
			}
		}

		return s;
	}

	/**
	 * @return s
	 */
	public int getQtd() {
		return QntIngressos;
	}

	/**
	 * @param qtd s
	 */
	public void setQtd(int qtd) {
		this.QntIngressos = qtd;
	}

	/**
	 * @param i s
	 * @return s
	 */
	public String getNome(int i) {
		return in[i].getNomeFilme();
	}

	/**
	 * @param i s
	 * @return s
	 */
	public String getNomeEsp(int i) {
		return in[1].getNomeEsp();
	}

	/**
	 * @param i s
	 * @return s
	 */
	public int getSala(int i) {
		return in[i].getNumSala();
	}

	/**
	 * @param QntIngressos s
	 */
	public void setQtdIngresso(int QntIngressos) {
		this.QntIngressos = QntIngressos;
	}

	/**
	 * @param i s
	 * @return s
	 */
	public String gethoraFilme(int i) {
		return in[i].getHoraFilme();
	}

	/**
	 * @param i s
	 * @return s
	 */
	public String getTipoEntrada(int i) {
		return in[i].getTipoEntrada();
	}

	/**
	 * @param i s
	 * @return s
	 */
	public int getId(int i) {
		return in[i].getId();
	}

}
