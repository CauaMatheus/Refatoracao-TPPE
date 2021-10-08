package control;
/**Faz a comunicação com a classe modelo para manipular dados do Acompanhamento
 * @version 1.0
 * @author Pablo C.
 * @since Out 2021
 */
import modelo.Acompanhamento;

public class ControleAcompanhamento {
	
	// Array para guardar filmes

	private Acompanhamento[] a;

	private int QntAcompanhamentos;

	public ControleAcompanhamento(ControleDados d) {
		a = d.getAcompanhamentos();
		QntAcompanhamentos = d.getQntAcompanhamentos();
	}
	
	//Array de String que irá aparecer no Jlist
	
	public String[] getNome() {
		String[] s = new String[QntAcompanhamentos];
		for (int i = 0; i < QntAcompanhamentos; i++) {
			s[i] = a[i].getNome();
			
			/**String com os nomes do acompanhamento para aparecer na jlist
			 * @author Pablo C.
			 */
		}

		return s;
	}

	public int getQtd() {
		return QntAcompanhamentos;
	}

	public void setQtd(int qtd) {
		this.QntAcompanhamentos = qtd;
	}

	public String getNome(int i) {
		return a[i].getNome();
	}


	public void setQntAcompanhamento(int QntAcompanhamentos) {
		this.QntAcompanhamentos = QntAcompanhamentos;
	}

	public double getValor(int i) {
		return a[i].getValor();
	}

	public int getQnt(int i) {
		return a[i].getQnt();
	}

	public String getTipo(int i) {
		return a[i].getTipo();
	}

}
