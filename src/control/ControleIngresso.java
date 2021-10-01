package control;

import modelo.Ingresso;

public class ControleIngresso {

	// Array para guardar ngreaao

	private Ingresso[] in;
	private Ingresso[] out;
	private int QntIngressos;

	public ControleIngresso(ControleDados d) {
		out = d.getIngressos();
		QntIngressos = d.getQntIngressos();

		in = d.getIngressos();
		QntIngressos = d.getQntIngressos();
	}

	public String[] getNomeIngresso() {
		String[] s = new String[QntIngressos];
		for (int i = 0; i < QntIngressos; i++) {
			s[i] = in[i].getNomeFilme();
		}

		return s;
	}

	public String[] getHoraFilme() {
		String[] t = new String[QntIngressos];
		for (int i = 0; i < QntIngressos; i++) {
			t[i] = out[i].getHoraFilme();
		}

		return t;
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

	public String getHora(int i) {
		return out[i].getHoraFilme();
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
