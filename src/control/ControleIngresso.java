package control;

import modelo.Ingresso;

public class ControleIngresso {

	// Array para guardar ingresso

	private Ingresso[] in;
	private int QntIngressos;

	public ControleIngresso(ControleDados d) {
		in = d.getIngressos();
		QntIngressos = d.getQntIngressos();
	}

	// Array de String que irá aparecer no Jlist

	public String[] getNomeIngresso() {
		String[] s = new String[QntIngressos];
		for (int i = 0; i < QntIngressos; i++) {
			s[i] = in[i].getNomeFilme();
		}

		return s;
	}

	public int getQtd() {
		return QntIngressos;
	}

	public void setQtd(int qtd) {
		this.QntIngressos = qtd;
	}

	public String getNome(int i) {
		return in[i].getNomeFilme();
	}

	public int getSala(int i) {
		return in[i].getNumSala();
	}

	public void setQtdIngresso(int QntIngressos) {
		this.QntIngressos = QntIngressos;
	}

	public String gethoraFilme(int i) {
		return in[i].getHoraFilme();
	}

	public String getTipoEntrada(int i) {
		return in[i].getTipoEntrada();
	}

	public int getId(int i) {
		return in[i].getId();
	}

}
