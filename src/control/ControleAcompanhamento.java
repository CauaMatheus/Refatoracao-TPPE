package control;
import modelo.Acompanhamento;
/**Faz a comunicação com a classe modelo para manipular dados do Acompanhamento
 * @version 1.0
 * @author Pablo C.
 * @since Out 2021
 */

public class ControleAcompanhamento {

	private Acompanhamento[] a;

	private int QntAcompanhamentos;


	/**
	 * Método para guardar os acompanhamentos
	 * 
	 * @author Pablo C.
	 * @param d ControleDados - Chama a classe que possui os gets e sets do dado
	 */
	public ControleAcompanhamento(ControleDados d) {
		a = d.getAcompanhamentos();
		QntAcompanhamentos = d.getQntAcompanhamentos();

	}

	// Array de String que irá aparecer no Jlist

	/**
	 * String com os nomes do acompanhamento para aparecer na jlist
	 * 
	 * @author Pablo C.
	 * @return nome
	 */
	public String[] getNome() {
		String[] s = new String[QntAcompanhamentos];
		for (int i = 0; i < QntAcompanhamentos; i++) {
			s[i] = a[i].getNome();

		}

		return s;
	}

	/**
	 * String com os nomes do acompanhamento para aparecer na jlist de acordo com o
	 * dado inserido
	 * 
	 * @author Pablo C.
	 * @param pesAcom a
	 * @return a
	 */
	public String[] getPesquisaAcompanhamento(String pesAcom) {
		String[] s = new String[QntAcompanhamentos];
		for (int i = 0; i < QntAcompanhamentos; i++) {
			if ((a[i].getNome()).contains(pesAcom)) {
				s[i] = a[i].getNome();
			}

		}

		return s;
	}

	/**
	 * @return a
	 */
	public int getQtd() {
		return QntAcompanhamentos;
	}

	/**
	 * @param qtd a
	 */
	public void setQtd(int qtd) {
		this.QntAcompanhamentos = qtd;
	}

	/**
	 * @param i int 
	 * @return a
	 */
	public String getNome(int i) {
		return a[i].getNome();
	}

	/**
	 * @param QntAcompanhamentos a
	 */
	public void setQntAcompanhamento(int QntAcompanhamentos) {
		this.QntAcompanhamentos = QntAcompanhamentos;
	}

	/**
	 * @param i a
	 * @return a
	 */
	public double getValor(int i) {
		return a[i].getValor();
	}

	/**
	 * @param i a
	 * @return a
	 */
	public int getQnt(int i) {
		return a[i].getQnt();
	}

	/**
	 * @param i a
	 * @return a
	 */
	public String getTipo(int i) {
		return a[i].getTipo();
	}

}
