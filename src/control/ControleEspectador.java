package control;
import modelo.Espectador;

/**Faz a comunicação com a classe modelo para manipular dados do Espectador
 * @version 1.0
 * @author Pedro V.
 * @since Out 2021
 */
public class ControleEspectador {

	// Array para guardar Espectador

	private Espectador[] e;
	private int QntEspectadores;


	/**M�todo para guardar os espectadores
	 * @author Pedro V.
	 * @param d ControleDados - Chama a classe que possui os gets e sets do dado
	 */
	public ControleEspectador(ControleDados d) {
		e = d.getEspectadores();
		QntEspectadores = d.getQntEspectadores();
		
	}

	// Array de String que irá aparecer no Jlist

	/**Cria um array de string com os nomes dos espectadores para aparecer na jlist
	 * @author Pedro V.
	 * @return s - Lista com os nomes dos espectadores na mesma posi��o no array de Espectador
	 */
	public String[] getNome() {
		String[] s = new String[QntEspectadores];
		for (int i = 0; i < QntEspectadores; i++) {
			s[i] = e[i].getNome();
		}

		return s;
		
	}

	// Função pesquisa
	/**Array de strings, pesquisa se no array de espectador possui a string pesquisada
	 * @author Pedro V.
	 * @param pesEsp String - Nome do espectador que ser� pesquisado 
	 * @return s - O espectador pesquisado
	 */
	public String[] getPesquisaEspectador(String pesEsp) {
		String[] s = new String[QntEspectadores];
		for (int i = 0; i < QntEspectadores; i++) {
			if ((e[i].getNome()).contains(pesEsp)) {
				s[i] = e[i].getNome();
			}
		}
		return s;
		
	}

	/**
	 * @return a
	 */
	public int getQtd() {
		return QntEspectadores;
	}

	/**
	 * @param qtd s
	 */
	public void setQtd(int qtd) {
		this.QntEspectadores = qtd;
	}

	/**
	 * @param QntEspectadores s
	 */
	public void setQtdEspectador(int QntEspectadores) {
		this.QntEspectadores = QntEspectadores;
	}

	/**
	 * @param i s
	 * @return s
	 */
	public String getNome(int i) {
		return e[i].getNome();
	}

	/**
	 * @param i s
	 * @return s
	 */
	public String getNasc(int i) {
		return e[i].getNasc();
	}

	/**
	 * @param i s
	 * @return s
	 */
	public String getCpf(int i) {
		return e[i].getCpf();
	}

}
