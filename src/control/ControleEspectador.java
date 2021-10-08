package control;
/**Faz a comunicação com a classe modelo para manipular dados do Espectador
 * @version 1.0
 * @author Pedro V.
 * @since Out 2021
 */
import modelo.Espectador;

public class ControleEspectador {

	// Array para guardar Espectador

	private Espectador[] e;
	private int QntEspectadores;

	public ControleEspectador(ControleDados d) {
		e = d.getEspectadores();
		QntEspectadores = d.getQntEspectadores();
		
		/**M�todo para guardar os espectadores
		 * @author Pedro V.
		 * @param d ControleDados - Chama a classe que possui os gets e sets do dado
		 */
	}

	// Array de String que irá aparecer no Jlist

	public String[] getNome() {
		String[] s = new String[QntEspectadores];
		for (int i = 0; i < QntEspectadores; i++) {
			s[i] = e[i].getNome();
		}

		return s;
		
		/**Cria um array de string com os nomes dos espectadores para aparecer na jlist
		 * @author Pedro V.
		 * @return s - Lista com os nomes dos espectadores na mesma posi��o no array de Espectador
		 */
	}

	// Função pesquisa
	public String[] getPesquisaEspectador(String pesEsp) {
		String[] s = new String[QntEspectadores];
		for (int i = 0; i < QntEspectadores; i++) {
			if ((e[i].getNome()).contains(pesEsp)) {
				s[i] = e[i].getNome();
			}
		}
		return s;
		
		/**Array de strings, pesquisa se no array de espectador possui a string pesquisada
		 * @author Pedro V.
		 * @param pesEsp String - Nome do espectador que ser� pesquisado 
		 * @return s - O espectador pesquisado
		 */
	}

	public int getQtd() {
		return QntEspectadores;
	}

	public void setQtd(int qtd) {
		this.QntEspectadores = qtd;
	}

	public void setQtdEspectador(int QntEspectadores) {
		this.QntEspectadores = QntEspectadores;
	}

	public String getNome(int i) {
		return e[i].getNome();
	}

	public String getNasc(int i) {
		return e[i].getNasc();
	}

	public String getCpf(int i) {
		return e[i].getCpf();
	}

}
